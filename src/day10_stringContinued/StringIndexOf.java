package day10_stringContinued;

public class StringIndexOf {
	public static void main(String[] args) {
//					   0123456789  by default, the index is read from left to right
		String name = "President George Washington";

		System.out.println(name.indexOf('P')); // 0

		System.out.println(name.indexOf('e')); // 2; returns the first 'e' found starting from index
												// position 0

		System.out.println(name.indexOf("George")); // 10; returns the position of the first letter of
													// the String that you are searching for

		System.out.println(name.indexOf('e', 3)); // 6; starts searching from position 3

		System.out.println(name.indexOf("Bob")); // -1; returns -1 since this String does not exist in
													// the String
		System.out.println(name.indexOf('z')); // -1; returns -1 since this character does not exist in
												// the String

		System.out.println(name.lastIndexOf('e')); // 15; returns the index position when reading from
													// right to left

		System.out.println(name.length()); // returns the total number of characters in the String; 
										   // returns the character count

		System.out.println(name.length() - 1); // the final index position of a String is always its
												// total length minus (-) 1
		System.out.println(name.charAt(26));  // this has a hard coded 26 and is NOT dynamic

		System.out.println(name.charAt(name.length() - 1));  // dynamically returns the character at 
															 // the final index position of the String

	}
}
