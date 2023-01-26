import java.util.ArrayList;
import java.util.Scanner;

public class clsBread extends clsSandwich {
	Scanner input = new Scanner(System.in);
	
	private int breadType = 0;
	public ArrayList<ListType> BreadList = new ArrayList<ListType>() {
		{
			/*              Bread, cost, is healthy  */
			add(new ListType("WheatBread", 1.63, true));
			add(new ListType("HerbBread", 1.75, true));
			add(new ListType("WhiteBread", 1.52, false));
		}
	};

	public void BreadOptions(clsSandwich order) {
		System.out.println("What Bread Type would you like?");
		for (int i = 0; i < BreadList.size(); i++) {
			System.out.println((i + 1) + ". " + BreadList.get(i).desc);
		}
		System.out.println("Enter 1,2,3");
		breadType = input.nextInt() - 1;
		order.AdjustPrice(BreadList.get(breadType).cost);
	}
	
	public String BreadChoice( ) {
		return  BreadList.get(breadType).desc + 
				(BreadList.get(breadType).ind ? " (healthy)" : ""); 
	}
}
