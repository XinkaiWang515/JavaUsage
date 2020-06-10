package LinkedListProblems;

public class hasCircle {
	public boolean checkCircle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		hasCircle test = new hasCircle();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		head.next.next.next = head.next;
		System.out.println(test.checkCircle(head));

	}

}
