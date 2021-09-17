package homework_Week3;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

		// Find the middle character of a string
		// Write a Java program to find the middle character of a string.
		// If the length of the string is odd there will be one middle character.
		// If the length of the string is even there will be 2 middle characters.
		// Input: abcde
		// output:c
		// input car11car
		// output 11

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a series of letters or numbers:");

		String input = scan.next();

		if (input.length() % 2 == 1) {
			System.out.println(input.charAt((input.length() - 1) / 2));

		} else {
			System.out.print(input.charAt(input.length() / 2 - 1));
			System.out.println(input.charAt(input.length() / 2));

		}
		scan.close();
	}
}
