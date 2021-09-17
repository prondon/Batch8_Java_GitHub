package homework_Week4;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		// Write a program that can return the longest string from two user inputs

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first string: ");

		String word1 = scan.next();

		System.out.println("Please enter second string: ");

		String word2 = scan.next();

		if (word1.length() > word2.length()) {
			System.out.println(word1);
		} else {
			System.out.println(word2);
		}
		scan.close();
	}
}
