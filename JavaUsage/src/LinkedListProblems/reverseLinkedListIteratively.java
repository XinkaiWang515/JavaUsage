package LinkedListProblems;

public class reverseLinkedListIteratively extends reverseLinkedList {
	@Override
	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		reverseLinkedListIteratively MyTest = new reverseLinkedListIteratively();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		MyTest.printLinkedList(MyTest.reverse(head));
	}

}
