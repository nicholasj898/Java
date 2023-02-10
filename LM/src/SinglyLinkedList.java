
public class SinglyLinkedList {

	ListNode head;

	public void Last(ListNode node) {
		if (head == null) {
			head = node;
		} else {
			ListNode temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	public void printList() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " > ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public ListNode concatenate(ListNode headA, ListNode headB) {
		ListNode holdNode = new ListNode(0);
	
		ListNode tail = holdNode;
		while (true) {

			if (headA == null) {
				tail.next = headB;
				break;
			}
			if (headB == null) {
				tail.next = headA;
				break;
			}
			if (headA.data <= headB.data) {
				tail.next = headA;
				headA = headA.next;
			} else {
				tail.next = headB;
				headB = headB.next;
			}

			tail = tail.next;
		}
		return holdNode.next;
	}
}
