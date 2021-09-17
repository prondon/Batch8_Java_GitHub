package day9_nestedLoop;

public class String_charAt {
	public static void main(String[] args) {

//	                  0123456789
		String str = "TechCircle";

		System.out.println(str.length()); // 10

		System.out.println(str.charAt(0)); // T

		System.out.println(str.charAt(9));  // e

		System.out.println(str.charAt(str.length() - 1)); // the position of the last character is equal
														  // to string length minus (-) 1 since the 
														  // first character is assigned position 0
	}
}
