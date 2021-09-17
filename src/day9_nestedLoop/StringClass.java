package day9_nestedLoop;

public class StringClass {
	public static void main(String[] args) {

//      index         0123456789    String literals have an index that begin with position 0
		String str = "Techcircle";  // example of a string literal

		System.out.println(str);  // prints Techcircle

		System.out.println(str.charAt(0));  // char charAt(i); returns the char at position i;
										    // .charAt(); is a method of the string; since String is
									        // an object, it has methods that can be used to manipulate
											// it
											

		System.out.println(str.charAt(6));

		char letter = str.charAt(3);  // assign a character to char variable letter

		System.out.println(letter);

		System.out.println("Techcircle".charAt(0)); // you can use the variable name or the actual
													// string literal (ie "Techcircle" vs str)

	}
}
