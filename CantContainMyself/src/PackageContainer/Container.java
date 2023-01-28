package PackageContainer;

import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedList;

public class Container {

	public static void main(String[] args) {
		// Declaring Linked List
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		// Make a list of ints to the linked list
		linkedlist.add(3);
		linkedlist.add(9);
		linkedlist.add(5);
		linkedlist.add(2);
		linkedlist.add(4);
		
		// Loop through the list
		for (Iterator <Integer> List = linkedlist.iterator(); List.hasNext();) {
			 Integer item = List.next();
		}
		
		// Display of Linked List
		System.out.println("Linked List: " + linkedlist);
		
		// Remove second element
		linkedlist.remove(1);
		System.out.println("Linked List after removing second item: " + linkedlist);
		
		// Map of string to ints
		HashMap<String, Integer> movieMap = new HashMap<String, Integer>();

		// Add five movie titles with the year they were released
		movieMap.put("Avengers: Infinity War", 2018);
		movieMap.put("Bright", 2017);
		movieMap.put("Terminator 2: Judgement Day", 1991);
		movieMap.put("The Shawshank Redemption", 1994);
		movieMap.put("Interstellar", 2014);

		// Display the year "Bright" was released
		System.out.println("Bright was released in " + movieMap.get("Bright"));

		// Clear both containers
		linkedlist.clear();
		movieMap.clear();
		System.out.println("linkedlist: " + linkedlist);
		System.out.println("map: " + movieMap);

	}

}
