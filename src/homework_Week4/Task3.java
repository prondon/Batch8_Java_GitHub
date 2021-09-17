package homework_Week4;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

//	  Write a program that asks user to enter a string.
//    if the string is empty, print: string is empty
//    if the string has more than 3 characters, print the last three characters
//    if the string has less than or equal 3 characters, print the string itself

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a string: ");

		String input = scan.next();

		if (input.length() == 0) {  // note: an empty String cannot be manually entered by the user
			System.out.println("String is empty");
		} else if (input.length() > 3) {
			System.out.println(input.substring(input.length() - 3));
		} else if (input.length() > 0 && input.length() <= 3) {
			System.out.println(input);

			scan.close();
		}
	}
}