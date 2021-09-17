package saturdayReview_Week4;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		// Write a program that asks the user to input a positive integer.
		// It should then print the multiplication table of that number.

		System.out.println("Please input a positive integer");

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		if (num >= 0) {
			for (int multiple = 0; multiple <= 9; multiple++) {

				System.out.println(num + " * " + multiple + " = " + num * multiple);
			}

		} else
			System.out.println("Invalid input");
		scan.close();
	}

}
