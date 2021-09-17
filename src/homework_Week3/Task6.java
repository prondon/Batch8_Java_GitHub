package homework_Week3;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		// Make it total of 5 characters
		// Write a program that checks the length of the string.
		// If the string length is less than 5 characters then add any character and
		// make it total of
		// five character.
		// if the length is equal to 5 then keep the original string.
		// if string length greater than 5 characters then keep the last 5 characters.
		// Examples:
		// String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
		// expected "puter" , "JavaA" "Pizza"

		System.out.println("Please enter a string:");

		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		if (input.length() < 5) {

			for (int i = input.length(); i < 5; i++) {
				Random random = new Random();
				char letter = (char) random.nextInt(90);
				input += letter;
			}
			System.out.println(input);

		} else if (input.length() == 5) {
			System.out.println(input);
		} else {
			for (int i = input.length() - 5; i <= input.length() - 1; i++) {
				System.out.print(input.charAt(i));
			}
		}
		scan.close();
	}
}
