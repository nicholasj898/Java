public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		clsSandwich order = new clsSandwich();
		
		// select bread type
		clsBread bread = new clsBread();
		bread.BreadOptions(order); 

		// select protein type
		clsProtein protein = new clsProtein();
		protein.ProtienOptions(order);

		// select Toppings
		clsToppings toppings = new clsToppings();
		toppings.AddToppings(order);
		// 
		System.out.println("Bread: " + bread.BreadChoice());
		System.out.println("Protein: " + protein.ProteinChoice());
		System.out.println("Toppings: " + toppings.ToppingsChoice());
		System.out.println("Sandwich Price: " + order.TotalPrice());
	}

}
