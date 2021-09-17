package saturdayReview_Week4;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		// Write a program that asks the user to input an integer and then outputs the
		// number with the
		// digits reversed.

		System.out.println("Please input an integer");

		Scanner scan = new Scanner(System.in); // add the Scanner class

		String keyboard = scan.next(); // once the user enters an integer, we want to store this value
										// as a String

		for (int i = keyboard.length() - 1; i >= 0; i--) {
			System.out.print(keyboard.charAt(i));
		}
		scan.close();

	}

}