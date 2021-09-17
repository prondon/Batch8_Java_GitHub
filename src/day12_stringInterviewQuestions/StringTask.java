package day12_stringInterviewQuestions;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {

		/*
		 * Task: 1. Ask user to enter two words. Print first word without its first
		 * character then print the second word without its first character. 
		 * Input: apple 
		 * 		  banana 
		 * Output: ppleanana
		 */

		System.out.println("Please enter first word: ");

		Scanner scan = new Scanner(System.in);

		String word1 = scan.next();

		System.out.println("Please enter second word: ");

		String word2 = scan.next();

		System.out.println(word1.substring(1) + word2.substring(1));
		
		scan.close();
	}
}
