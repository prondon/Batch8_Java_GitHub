package saturdayReview_Week4;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		// Reverse a string
		// elephant --> tnahpele

		System.out.println("Please enter a word: "); // ask user to input a word

		Scanner scan = new Scanner(System.in); // initialize an object from the Scanner class

		String word = scan.next(); // store user input as the value for the variable named word

		for (int i = word.length() - 1; i >= 0; i--) { // use the .length method; the final position
														// in the index is the length of the string
														// minus (-) 1
			System.out.print(word.charAt(i)); // use the .charAt String method to find and print the
											  // character at that position
		}
		scan.close();
	}
}
