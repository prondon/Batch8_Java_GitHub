package day9_nestedLoop;

public class EmptyString {
	public static void main(String[] args) {

		String word1 = "Java"; // has 4 characters

		// First way to create an empty string

		String emptyString = ""; // has 0 characters

		String str = "Techcircle"; // has 10 characters

		System.out.println(word1.length()); // 4; int lenth(): returns the number of characters in the 
										    // string

		System.out.println(str.length()); // 10

		System.out.println(emptyString.length()); // 0

		// Second way to create an empty string

		String emptyString2 = new String(); // uses a default constructor (no parameter within the
											// parenthesis)

		System.out.println(emptyString2.length()); // 0

		// Creating an empty string serves as a placeholder before assigning an actual
		// value to the string variable

		String word2 = new String("Java");  
		System.out.println(word2);

		String word3 = new String(word2);  // this syntax creates a new location for the value
		System.out.println(word3);

		boolean result = word2 == word3;
		System.out.println(result);  // false; the values look the same but have different locations
		 							 // in the computer's memory

		String word4 = "Java";  // this syntax points to the same location

		String word5 = word4;

		boolean result2 = word4 == word5;
		System.out.println(result2);  // true

	}

}
