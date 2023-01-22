package Package00;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class ExcelAtArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<teamClass> teamList = new ArrayList<teamClass>();

		while (true) {
			System.out.println("Please pick an option from the list below:");
			System.out.println("1) Create League");
			System.out.println("2) List all teams");
			System.out.println("3) Record a Win");
			System.out.println("4) Record a Loss");
			System.out.println("5) Quit");
			int choice = input.nextInt();
			if (choice < 0 || choice > 5) {
				System.out.println("That is not a choice");
				continue;
			}
			if (choice == 1) {
				System.out.println("How many teams should I make?");
				int teamNbr = input.nextInt();
				for (int i = 1; i <= teamNbr; i++) {
					System.out.println("What is the name of team " + Integer.toString(i) + " ?");
					String teamNme = input.nextLine();
					teamList.add(new teamClass(teamNme, 0, 0));
				}
			} else if (choice == 2) {
				for (teamClass item : teamList) {
					System.out.println(item.teamName + " wins: " + item.teamWin + " losses:" + item.teamLoss);
				}
			} else if (choice == 3) {
				System.out.println("Which team number had a win?");
				int tNbr = input.nextInt();
				if (tNbr < teamClass.teamClassSize()) {
					teamList.get(tNbr).win();
				} else {
					System.out.println("No such teams defined - try again");
				}
			} else if (choice == 4) {
				System.out.println("Which team number has a loss");
				int tNbr = input.nextInt();
				if (tNbr < teamClass.teamClassSize()) {
					teamList.get(tNbr).loss();
				} else {
					System.out.println("No such teams defined - try again");
				}
				teamList.get(tNbr).loss();
			} else {
				break;
			}
			;
		}
	}

}

class teamClass {
	private static int counter;
	String teamName;
	int teamWin;
	int teamLoss;

	teamClass(String name, int win, int loss) {
		counter++;
		this.teamName = name;
		this.teamWin = win;
		this.teamLoss = loss;
	}

	public static int teamClassSize() {
		return counter;
	}

	public void win() {
		this.teamWin++;
	}

	public void loss() {
		this.teamLoss++;

	}
};
