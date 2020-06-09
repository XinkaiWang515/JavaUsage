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

public abstract class reverseLinkedList {
	abstract ListNode reverse(ListNode head);
	
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
}
