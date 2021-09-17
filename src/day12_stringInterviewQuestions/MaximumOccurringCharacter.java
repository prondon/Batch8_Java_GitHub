package day12_stringInterviewQuestions;

import java.util.Scanner;

public class MaximumOccurringCharacter {
	public static void main(String[] args) {

		/*
		 * Write an efficient Java program to return the maximum occurring character in
		 * the input string, e.g., if the input string is "Java" then the function
		 * should return 'a'.
		 * 
		 */

		System.out.println("Please enter a string: ");

		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		String uniqueChar = "";

		for (int i = 0; i < input.length(); i++) {
			String currentChar = Character.toString(input.charAt(i));
			if (!uniqueChar.contains(currentChar)) {
				uniqueChar += currentChar;
			
			}

		}System.out.println(uniqueChar);
		
		int count = 0;
		int maxOccuringChar = ' ';
		
		for (int j = 0; j<uniqueChar.length(); j++) {
			maxOccuringChar += count;
		}
		System.out.println(maxOccuringChar);
		scan.close();
	}
}
