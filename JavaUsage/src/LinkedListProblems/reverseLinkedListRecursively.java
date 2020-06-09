package LinkedListProblems;

class ListNode {
	Integer value;
	ListNode next;
	
	public ListNode() {
		this(null);
	}
	
	public ListNode(Integer value) {
		this.value = value;
	}
}

public class reverseLinkedListRecursively {
	public ListNode reverseRecursively(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseRecursively(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
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
		reverseLinkedListRecursively MyTest = new reverseLinkedListRecursively();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		MyTest.printLinkedList(MyTest.reverseRecursively(head));
	}
}
