package day12_stringInterviewQuestions;

public class ExtractNumbersFromString {
	public static void main(String[] args) {

		// String str = "ab123456cde78d";

		// Write a program to extract number from a string.

		// expected output : 12345678

		String str = "ab123456cde78d";
		String reference = "0123456789";

		for (int i = 0; i <= str.length() - 1; i++) {
			String currentChars = Character.toString(str.charAt(i));
			if (reference.contains(currentChars)) {
				System.out.print(str.charAt(i));
			}
		}
		
		// Elira's solution using ASCII Table
		
//		String str = "ab123456cde78d";
//
//		for (int i = 0; i < str.length(); i++) {
//
//			if (str.charAt(i) > 48 && str.charAt(i) < 57) {
//				System.out.print(str.charAt(i));
//			}
//
//		}

	}
}
