import java.util.ArrayList;
import java.util.Scanner;

public class clsProtein extends clsSandwich {
	Scanner input = new Scanner(System.in);
	
	private int proteinType = 0;
	ArrayList<ListType> ProteinList = new ArrayList<ListType>() {
		{
			/*            Protein, cost, will burn */
			add(new ListType("Ham", 2.33, false));
			add(new ListType("RoastBeef", 2.75, false));
			add(new ListType("Tuna", 1.52, true));
			add(new ListType("SoyPatty", 1.95, false));
			add(new ListType("Veggie", 0, true));
		}
	};

	public void ProtienOptions(clsSandwich order) {
		System.out.println("What Protein would you like?");
		for (int i = 0; i < ProteinList.size(); i++) {
			System.out.println((i+1) + ". " + ProteinList.get(i).desc);
		}
		System.out.println("Enter 1 - 5");
		proteinType = input.nextInt() - 1;
		order.AdjustPrice(ProteinList.get(proteinType).cost);
	}
	
	public String ProteinChoice( ) {
		return ProteinList.get(proteinType).desc  + 
				(ProteinList.get(proteinType).ind ? " (is burnt)" : ""); 
	}
}
