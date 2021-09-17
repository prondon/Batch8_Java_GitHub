package homework_Week3;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		// Extract letters from a String
		// Write a program to extract all the letter from a given alphanumeric string
		// "a1b2c34d098098efg"
		// output:
		// abcdefg

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter any string containing letters and numbers:");

		String input = scan.next();

		for (int i = 0; i <= input.length() - 1; i++) {

			if (input.charAt(i) >= 65 && input.charAt(i) <= 90 || input.charAt(i) >= 97 && input.charAt(i) <= 122) {

				System.out.print(input.charAt(i));
			}
		}
		scan.close();
	}
}
