package homework_Week3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		// Write a program that calculates the sum of numbers entered by the user until
		// user enters a
		// negative number.
		// hint: you need an infinite loop

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		for (int i = 1; i > 0; i++) {

			System.out.println("Please enter a number:");

			int in = scan.nextInt();

			if (in > 0) {
				sum += in;
				System.out.println("The total sum of the numbers that you entered is: " + sum + "\n");
			} else {
				System.out.println("Invalid input.  Postive numbers only." + "\n");
			}
		}
		scan.close();

	}
}
