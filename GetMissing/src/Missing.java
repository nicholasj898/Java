
public class Missing {
	public static void main(String args[]) {
		
		int array[] = { 4, 3, 1 };
		int missing = getNumber(array, 3);
		//System.out.println(missing + " is missing");
		
	}

	static int getNumber(int at[], int n)

	{
		int i;
		int total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= at[i];
		return total;
	}
}
