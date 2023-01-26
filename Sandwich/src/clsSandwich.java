import java.util.ArrayList;
import java.util.List;

public class clsSandwich {
	//this is the superclass
	private double price = 0;

	public void AdjustPrice(double Cost) {
		price = price + Cost;
	}
	
	public String TotalPrice( ) {
		return "$" + price;
	}
}
