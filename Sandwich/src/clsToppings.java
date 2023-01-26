import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clsToppings extends clsSandwich{
	Scanner input = new Scanner(System.in);
	
	private List<Integer> topChoice = new ArrayList<Integer>();
	
	private ArrayList<ListType> ToppingsList = new ArrayList<ListType>() {
		{
			/*               Topping, cost, delicious */
			add(new ListType("GreenPeppers", 0.35,true));
			add(new ListType("Pickles", 0.61,true));
			add(new ListType("Jalapenos", 0.76, true));
			add(new ListType("Bacon", 1.32, true ));
			add(new ListType("Cilantro", 0.15, false));
			add(new ListType("BBQSauce", 0.52, true));
			add(new ListType("SweetOnionSauce", 0.72, true));
			add(new ListType("Mustard", 0.52,false));
			add(new ListType("Mayo", 0.52, true));
		}
	};

	public void AddToppings(clsSandwich order) {
		System.out.println("Select toppings?");
		while (true) {
			for (int i = 0; i < ToppingsList.size(); i++) {
				System.out.println((i + 1) + ". " + ToppingsList.get(i).desc);
			}
			System.out.println("0. When Done");
			System.out.println("Enter 1 - 9, 0");
			int topOpt = input.nextInt();
			if (topOpt > 9) continue;
			if (topOpt == 0) break;  
			/* adjust back for relative index */
			topChoice.add( topOpt - 1);
			order.AdjustPrice(ToppingsList.get(topOpt - 1).cost);
			/* 5 toppings only */
			if (topChoice.size() == 5) break;
		}
	}
	
	public String ToppingsChoice() {
		String plus ="";
		String stuff ="";
		for (int i = 0; i < topChoice.size(); i++) {
			int opt = topChoice.get(i);
			stuff = stuff + ToppingsList.get(opt).desc + ", ";
			if (ToppingsList.get(opt).ind)
				plus=" (not delicious)";
		}
		return stuff;
	}
}
