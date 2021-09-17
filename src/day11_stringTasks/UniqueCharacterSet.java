package day11_stringTasks;

public class UniqueCharacterSet {
	public static void main(String[] args) {

		String str = "aaaaaaaaaaaaaaabbbbbbbbbcccccccccccc";
//		String expectedStr = "abc";

		String uniqueChars = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			String currentChar = Character.toString(str.charAt(i));  // convert character to String

			if (!uniqueChars.contains(currentChar)) {  // .contains(); is expecting you to pass a 
													   // String; therefore, the above conversion is 
													   // necessary; note the ! which states that if
													   // uniqueChars, which begins as an empty string
													   // does NOT contain currentChar, then the code
													   // should continue running
				uniqueChars += currentChar; // only adds the characters that were not previously 
											// present in uniqueChars to the new concatenated 
										    // uniqueChars
			}
		}
		System.out.println(uniqueChars);
	}
}
