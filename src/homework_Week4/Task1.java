package homework_Week4;

public class Task1 {
	public static void main(String[] args) {

//		Write an efficient Java program to return the maximum occurring character
//		in the input string, e.g., if the input string is "Java" then the function should return 'a'

		// Irfan's solution:

		String str = "Mississippi";

		String uniqueChars = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			String currentChars = Character.toString(str.charAt(i));

			if (!uniqueChars.contains(currentChars)) {

				uniqueChars += currentChars; // this creates a set of unique characters
			}

		}
		System.out.println("Unique Characters: " + uniqueChars);

		int max = 0;
		char maxOccurringChar = ' ';

		for (int i = 0; i <= uniqueChars.length() - 1; i++) { // outer loop with "Misp"

			System.out.println(uniqueChars.charAt(i));

			char lookingFor = uniqueChars.charAt(i);
			int num = 0;
			for (int j = 0; j <= str.length() - 1; j++) { // inner loop with original String
															// "Mississippi""

				char found = str.charAt(j);
				System.out.println("Looking for <" + lookingFor + "> found < " + found + ">");

				if (lookingFor == found) {
					num++;
				}
			}

			if (num > max) {
				max = num;
				maxOccurringChar = lookingFor;
			}
		}
		System.out.println(maxOccurringChar + " occurred " + max + " times");
	}
}
