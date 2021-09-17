package homework_Week3;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		// Write a program that can return the factorial number of any given number
		// Ex:
		// input: 5
		// output: 120 ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

		System.out.println("Please input any number: ");

		Scanner scan = new Scanner(System.in);

		int in = scan.nextInt();

		int sum = 1;

		for (int i = in; i >= 1; i--) {
			sum *= i;
		}
		System.out.println("The factorial number of your input is: " + sum);

		scan.close();
	}
	
}
