package homework_Week3;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		// Write a program that can calculate the sum of 5 user entered inputs

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.println("Please enter a number:");

			int in = scan.nextInt();
			sum += in;

		}

		scan.close();

		System.out.println("The total sum of user inputs is: " + sum);
	}
}