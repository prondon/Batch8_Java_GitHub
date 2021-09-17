package day12_stringInterviewQuestions;

import java.util.Scanner;

public class CodilityTestCoders {
	public static void main(String[] args) {

		/*
		 * That, given positive Integer N, Points the consecutive numbers from 1 to N,
		 * each on a separate line, However, any number divisible by 2, 3, 5, should be
		 * replaced by the word Codility, Test, Coders respectively.
		 * 
		 * If the number divisible by more than one if the numbers: 2,3 or 5, it should
		 * be replaced by a concatenation of the respective words Codility, Test, and
		 * Coders in the given order. For example, numbers divisible by both 2 and 3
		 * should be replaced by CodilityTest and numbers divisible by all three
		 * numbers: 2,3, and 5, should be replaced by CodilityTestCoders. For example,
		 * here is the output for 24: 
		 * 1 
		 * Codility Test Codility Coders CodilityTest 7
		 * Codility Test CodilityCoders 11 CodilityTest 13 Codility TestCoders Codility
		 * 17 CodilityTest 19 CodilityCoders Test Codility 23 CodilityTest
		 *
		 *
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = scan.nextInt();

		String str = "Codility";
		String str2 = "Test";
		String str3 = "Coders";

		String msg = ""; // initialize with an empty String

		for (int i = 1; i <= input; i++) {

			if (i % 2 == 0) {
				msg = str;
			}

			if (i % 3 == 0) {
				msg += str2; // msg.concat(str2);
			}
			if (i % 5 == 0) {
				msg += str3; // msg.concat(str3);
			}
			if (msg.length() == 0) {
				System.out.println(i);
			} else {
				System.out.println(msg);
			}
			msg = ""; // reset the msg back to an empty String to begin each new iteration

		}
		scan.close();
	}
}