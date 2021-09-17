package day10_stringContinued;

public class StringEqual {
	public static void main(String[] args) {

		String word1 = "Hello ";
		String word2 = "Java";
		String word3 = word1 + word2;

		String word4 = "Hello Java";

		System.out.println(word3);
		System.out.println(word4);

		System.out.println(word3 == word4); // returns false because it is actually comparing the
											// location in the computer's RAM; bad practice when
											// comparing Strings
		System.out.println(word3.equals(word4)); // always use .equal(); method when comparing two
													// Strings
		String word5 = "HELLO JAVA";

		System.out.println(word4.equals(word5)); // returns false because .equal(); method IS case
													// sensitive
		System.out.println(word4.equalsIgnoreCase(word5));  // true

		if (word4.equals(word5)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		if (word4.equalsIgnoreCase(word5)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}


	}
}
