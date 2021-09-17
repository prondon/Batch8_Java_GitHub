package day12_stringInterviewQuestions;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		// Write a program to reverse a string
		// Input = ABCD
		// Output = DCBA

		System.out.println("Please enter a string: ");

		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		scan.close();
		
		//  See StringBuilderTest class file for an alternative way to reverse a String
	}
}
