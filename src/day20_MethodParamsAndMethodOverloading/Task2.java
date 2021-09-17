package day20_MethodParamsAndMethodOverloading;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		// 2. create a function that can calculate the grade of the student

		System.out.println("Please enter your score: ");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		System.out.println("Your grade is: " + grade(input));

		scan.close();

	}

	public static char grade(int num) {

		if (num <= 100 && num >= 90) {
			return 'A';
		} else if (num < 90 && num >= 80) {
			return 'B';
		} else if (num < 80 && num >= 70) {
			return 'C';
		} else if (num < 70 && num >= 60) {
			return 'D';
		} else if (num < 60) {
			return 'F';
		}
		return 0;
	}
}
