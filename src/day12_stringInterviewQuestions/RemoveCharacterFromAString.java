package day12_stringInterviewQuestions;

public class RemoveCharacterFromAString {
	public static void main(String[] args) {

		/*
		 * Write an efficient program in Java to remove all occurrences of a given
		 * character in Java. For example, if the given String is "Programming" and the
		 * given character to remove is "m" then your function should return
		 * "Prograing".
		 */

		
		// Solution using .replace();
		
		String str = "Programming";
		String targetChar = "m";

		System.out.println(str.replace(targetChar, ""));

		// Alternative solution without .replace();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 109) {  // if (str.charAt(i) != 'm') { will also work
				System.out.print(str.charAt(i));

			}

		}

	}
}
