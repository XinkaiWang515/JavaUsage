package LinkedListProblems;



public class reverseLinkedListRecursively extends reverseLinkedList {
	@Override
	public ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		reverseLinkedListRecursively MyTest = new reverseLinkedListRecursively();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		MyTest.printLinkedList(MyTest.reverse(head));
	}
}
