package homework_Week6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		/*
		 * Password validation 
		 * 1. 8 character at least 
		 * 2. there must be a digit 
		 *                                     (isUpper         isLowercase) 
		 * 3. there must be a letter (at least one upper case & one lower case) 
		 * 4. there must be special character
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your password: ");

		String input = scan.next();

		int digit = 0;
		int upper = 0;
		int lower = 0;
		int specialCount = 0;
		String special = "!@#$%^&*()<>?";

		if (input.length() >= 8) {

			for (int i = 0; i < input.length(); i++) {
				if (Character.isDigit(input.charAt(i))) {
					digit++;
				}
				if (Character.isUpperCase(input.charAt(i))) {
					upper++;
				}
				if (Character.isLowerCase(input.charAt(i))) {
					lower++;
				}
				String currentChar = Character.toString(input.charAt(i));
				if (special.contains(currentChar)) {
					specialCount++;
				}
			}
			if (digit >= 1 && upper >= 1 && lower >= 1 && specialCount >= 1) {
				System.out.println("Your password is valid!!");
			} else {
				System.out.println("Password invalid");
			}
			if (digit == 0) {
				System.out.println("Password must contain at least one digit");
			}
			if (upper == 0) {
				System.out.println("Password must contain at least one Uppercase letter");
			}
			if (lower == 0) {
				System.out.println("Password must contain at least one Lowercase letter");
			}
			if (specialCount == 0) {
				System.out.println("Password must contain at least one special character");
			}
		} else {
			System.out.println("Password invalid.  Must be at least 8 characters");

		}
		scan.close();
	}
}
