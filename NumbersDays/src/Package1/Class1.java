package Package1;

import java.util.Scanner;

/*
	was originally working with division "/ 60, / 60, / 30", etc. 
	instead of multiplying everything together, but 
	ran into too many errors (days kept showing up as 0
	no matter what was entered) and eventually just had to
	use the total numbers for each. I believe it was unable to
	get a proper amount of days with the remainder and shoved it
	to hours, but I would of preferred it to work with division
	just so it looked a little cleaner and would be easier to follow.
*/

public class Class1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number "); 
		int seconds = reader.nextInt(); 
		
		int years = seconds / 31536000; //(365*24*60*60)
		seconds = seconds % 31536000;
		
		int fortnights = seconds / 1209600; //14*24*60*60)
		seconds = seconds % 1209600;
		
		int days = seconds / 86400; //(24*60*60)
		seconds = seconds % 86400;
		
		int hours = seconds / 3600; //(60*60)
		seconds = seconds % 3600;
		
		int minutes = seconds / 60;
		seconds = seconds % 60;
		
		System.out.print("That is " + years );
		System.out.print(" years, " + fortnights );
		System.out.print(" fortnights, " + days);
		System.out.print(" days, " + hours);
		System.out.print(" hours, " + minutes);
		System.out.print(" minutes, " + seconds);
		System.out.println(" seconds. ");
		reader.close();

	}

}
