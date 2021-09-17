package saturdayReview_Week5;

// import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {

		// Compare 2 strings. Store the result in a boolean variable. If the boolean
		// variable is true,
		// print a statement stating the strings are the same. If false, print a
		// statement stating they're
		// not the same.

//		System.out.println("Please enter first string: ");
//
//		Scanner scan = new Scanner(System.in);
//
//		String word1 = scan.next();
//
//		System.out.println("Please enter second string: ");
//
//		String word2 = scan.next();
//
//		boolean result = word1.equals(word2);
//
//		if (result) {
//			System.out.println("Your strings are the SAME!!");
//		} else {
//			System.out.println("Your strings are NOT the same :(");
//		}
//		scan.close();

		// Task 2: Count how many vowels are in a string
		// vowels: a, e, i, o, u
		// String: elephant; number of vowels = 3

//		System.out.println("Please enter a string: ");
//
//		Scanner scan = new Scanner(System.in);
//
//		String input = scan.next();
//
//		String referenceData = "aeiou";
//
//		int count = 0;
//
//		for (int i = 0; i <= input.length() - 1; i++) {
//
//			String currentChar = Character.toString(input.charAt(i));
//			if (referenceData.contains(currentChar)) {
//				count++;
//			}
//		}
//		System.out.println(input + "; number of vowels = " + count);
//		scan.close();

		// Elira's solution

//		String a = "aeiou";
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("Plz enter a word, Let's see how many vowels are in this word.");
//
//		String b = scan2.nextLine();
//		int count2 = 0;
//
//		for (int i = 0; i < a.length(); i++) { // outter loop
//			// i = 0; comparing a
//
//			for (int k = 0; k < b.length(); k++) { // inner loop
//				// k = 0
//				if (b.charAt(k) == a.charAt(i)) {
//					count2++;
//				}
//			}
//		}
//		System.out.println(count2);
//		scan2.close();

		// Given a string, replace only the first occurrence of a letter
		// Initialize: String/char, letter

		String input = "parallel";

		char char1 = 'a';

		String str1 = "b";

		String result = "";

		boolean s = true;

		for (int i = 0; i <= input.length() - 1; i++) {

			if (input.charAt(i) == char1 && s) {
				result += str1;
				s = false;
			} else {
				result += input.charAt(i);
			}
		}
		System.out.println(result);
	}
}
