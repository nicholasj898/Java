package net.datastructures;
import net.datastructures.ChainHashMap;
import net.datastructures.ProbeHashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainHashMap<Integer, String> chm = new ChainHashMap();
		chm.put(2, "a");
		chm.put(5, "p");
		chm.put(9, null);

		int key = 1;

		while (key < 10) {
			if (chm.containsKey(key))
				if (chm.get(key) != null)
					System.out.println("Chain value at Key " + key + " is " + chm.get(key));
				else
					System.out.println("Chain value at Key " + key + " is null");
			else
				System.out.println("No such Chain key " + key);
			key++;
		}

		ProbeHashMap<Integer, String> phm = new ProbeHashMap();
		phm.put(2, "a");
		phm.put(5, "p");
		phm.put(9, null);

		key = 1;
		while (key < 10) {
			if (phm.containsKey(key))
				if (phm.get(key) != null)
					System.out.println("Probe value at Key " + key + " is " + phm.get(key));
				else
					System.out.println("Prob value at Key " + key + " is null");
			else
				System.out.println("No such Prob key " + key);
			key++;
		}

	}

}
