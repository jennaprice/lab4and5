
/*
 * @author: Jenna Price
 * Project Die Rolling Random numbers
 */
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please enter the number of sides you would like for your die:");
			int dieSide = scnr.nextInt();

			System.out.println("How many times would you like to roll your dice?");
			int numRolls = scnr.nextInt();

			for (int i = 0; i < numRolls; i++) {
				System.out.println(
						"Your first roll is " + rollDie1(dieSide) + " and your second roll is " + rollDie1(dieSide));
			}

			System.out.println("Would you like to continue? (y / n)");
			cont = scnr.next();
		}
		scnr.close();
	}

	/**
	 * 
	 * @param side
	 *            - how many sides of the die
	 * @return - the value of the die
	 */
	public static int rollDie1(int side) {
		float randomValue = (float) Math.random() * 100;
		int roll = 0;
		// I used mod to get the die side
		while (roll == 0) {
			roll = Math.round(randomValue % side);
		}
		return roll;

	}

}
