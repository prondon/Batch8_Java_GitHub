package day17_wrapperClassAndLocalDate;

public class CharacterClassTest {
	public static void main(String[] args) {

		char a = 'A';
		char b = '9';

		Character c = a;

		System.out.println(c);

		System.out.println(Character.isDigit(b)); // true; method checks if the value is a digit with a
													// numeric value

		System.out.println(Character.isDigit(a));

		System.out.println(Character.isLetter(b)); // false; method checks if the value is a letter

		System.out.println(Character.isLetter(a));

		// extract letters from a String

		String str = "abc123def456";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {  // this code block with extract the letters only 

				System.out.print(str.charAt(i));
			}
//			if (Character.isDigit(str.charAt(i))) {  // this code block with extract the numeric 
												     // values only
//				System.out.print(str.charAt(i));
//			}
		}

	}
}
