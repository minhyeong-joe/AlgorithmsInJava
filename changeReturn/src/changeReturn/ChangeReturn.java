package changeReturn;

import java.util.Scanner;

public class ChangeReturn {
	
	static void change(double money) {
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		if(money >= 1.0) {
			int whole = (int)money;
			money = money - whole;
			int cent = (int)(money * 100);
			System.out.printf("%d Dollars and %d cents:\n", whole, cent);
		} else {
			int cent = (int)(money * 100);
			System.out.printf("%d cents:\n", cent);
		}
		// how many quarters
		while(money >= 0.25) {
			quarter++;
			money -= 0.25;
		}
		// how many dimes
		while(money >= 0.1) {
			dime++;
			money -= 0.1;
		}
		// how many nickel
		while(money >= 0.05) {
			nickel++;
			money -= 0.05;
		}
		// how many pennies
		while(money >= 0.01) {
			penny++;
			money -= 0.01;
		}
		System.out.printf("%d Quarters\n", quarter);
		System.out.printf("%d Dimes\n", dime);
		System.out.printf("%d Nickels\n", nickel);
		System.out.printf("%d Pennies\n", penny);
	}

	public static void main(String[] args) {
		double cost;
		double paid;
		double change;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How much is the cost?");
		cost = input.nextDouble();
		System.out.println("How much is paid?");
		paid = input.nextDouble();
		input.close();
		if(cost > paid) {
			System.out.println("Not enough money!");
		} else if(cost < paid) {
			change = paid - cost;
			System.out.print("Your change is ");
			change(change);
		} else {
			System.out.println("There is no change.");
		}

	}

}
