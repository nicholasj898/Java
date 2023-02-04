

public class GameScoreList {

	public static void main(String[] args) {
		SinglyLinkedList gamelist = new SinglyLinkedList();
		GameNode nNode;
		nNode = gamelist.newNode("Rob 57,922", 8);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Mike 65,223", 5);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Rose 56,800", 10);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Jill 59,870", 7);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Jack 73,128", 3);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Ana 61,382", 6);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Paul 104,380", 1);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Bob 57,424", 9);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Larry 78,502", 2);
		gamelist.sort(nNode);
		nNode = gamelist.newNode("Jake 68,672", 4);
		gamelist.sort(nNode);
		//System.out.println("Sorted Game Scores");
		gamelist.list();

	}

}
