package day10_stringContinued;

public class StringReview {
	public static void main(String[] args) {
//					  0123	
		String str = "Java"; // String literal

		String word = new String(); // the default String constructor creates an empty String

		String word2 = new String("Java"); // parameterized constructor

		String word3 = ""; // creates an empty String

		// The .length(); method returns the total length of the String

		System.out.println(str.length()); // 4
		System.out.println(word.length()); // 0
		System.out.println(word2.length()); // 4
		System.out.println(word3.length()); // 0

		System.out.println(str.charAt(0)); // J; returns the character at index position 0
		System.out.println(str.charAt(1)); // a
		System.out.println(str.charAt(2)); // v
		System.out.println(str.charAt(3)); // a

	}
}
