package day9_nestedLoop;

public class StringImmutable {
	public static void main(String[] args) {

		String str = "TechCircle";

		System.out.println(str.toUpperCase());  // print TECHCIRCLE

		System.out.println(str); // TechCircle; the original string still remains the same even though
									// it was changed to uppercase earlier

		String word1 = "Java";
		String word2 = "Hello ";
		String word3 = "Hello Java";

		String word4 = word2 + word1;

		System.out.println(word4);  // prints Hello Java
		
		boolean result = word4 == word3;
		
		System.out.println(result);  // false; even though the print out looks similar, the values
									 // have different locations in the memory

	}
}
