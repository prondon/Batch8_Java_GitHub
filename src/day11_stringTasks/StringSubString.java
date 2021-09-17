package day11_stringTasks;

public class StringSubString {
	public static void main(String[] args) {
//       	     	   0123456789	
		String word = "Television";

		System.out.println(word.charAt(2)); // l; you are simply extracting 1 letter from the String

		System.out.println(word.substring(2)); // returns everything after the location provided to the
												// final index position

		System.out.println(word.substring(4));

		System.out.println(word.substring(1, 4)); // ele

		System.out.println(word.substring(4, 10));

		String str = "Bob";
		System.out.println(str.substring(9));  // Java will complain because you are trying to access
		 									   // something that does not exist; returns an error

	}
}
