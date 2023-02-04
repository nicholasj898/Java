

public class SinglyLinkedList {
	GameNode head;
		
	void sort(GameNode newNode) {
		GameNode current;

		if (head == null || newNode.score <= head.score) {
			newNode.next = head;
			head = newNode;
		} else {

			current = head;
			while (current.next != null && current.next.score < newNode.score)
				current = current.next;
			
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	GameNode newNode(String Name, int Score) {
		GameNode x = new GameNode(Name, Score);
		return x;
	}

	void list() {
		GameNode temp = head;
		while (temp != null) {
			//System.out.println(temp.score + " " + temp.name);
			temp = temp.next;
		}
	}
	
}
