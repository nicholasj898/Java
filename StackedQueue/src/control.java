

import java.util.*;

public class control {

	public static void main(String[] args) {
		LinkedList<Comparable> q1 = new LinkedList<Comparable>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		//System.out.println(q1);

		LinkedList<String> q2 = new LinkedList<String>();
		q2.add("A");
		q2.add("B");
		q2.add("C");

		//System.out.println(q2);

		while (!q2.isEmpty()) {
			q1.add(q2.peekFirst());
			q2.pop();
		}

		//System.out.println(q1);
		//System.out.println(q2);
	}

}
