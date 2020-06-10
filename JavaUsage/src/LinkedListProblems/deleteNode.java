package LinkedListProblems;

public class deleteNode {
	public ListNode delete(ListNode head, int deleteValue) {
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode cur = dummy;
		while (cur.next != null && cur.next.value != deleteValue) {
			cur = cur.next;
		}
		if (cur.next != null) {
			cur.next = cur.next.next;
		}
		return dummy.next;
	}
	
	public void printLinkedList(ListNode head) {
		StringBuilder sb = new StringBuilder();
        while (head != null) {
        	sb.append(head.value);
        	sb.append("->");
        	head = head.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }
	
	public static void main(String[] args) {
		deleteNode MyTest = new deleteNode();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		MyTest.printLinkedList(MyTest.delete(head, 2));
	}
}
