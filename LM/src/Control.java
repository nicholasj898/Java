public class Control {

	public static void main(String[] args) {
		
		SinglyLinkedList L = new SinglyLinkedList();
		SinglyLinkedList M = new SinglyLinkedList();

		L.Last(new ListNode(1));
		L.Last(new ListNode(2));
		L.Last(new ListNode(5));
		L.Last(new ListNode(22));
		L.Last(new ListNode(88));

		M.Last(new ListNode(5));
		M.Last(new ListNode(7));
		M.Last(new ListNode(8));
		M.Last(new ListNode(11));
		M.Last(new ListNode(14));

	    L.head = L.concatenate(L.head,  M.head);
		
		L.printList(); 
	}

}
