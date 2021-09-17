package day20_MethodParamsAndMethodOverloading;

public class Task4 {
	public static void main(String[] args) {

		/*
		 * 4. create a function that can print a string without the duplicated
		 * characters "aaabbbccc" abc
		 */

		System.out.println(noDuplicates("aaabbbccc"));

		String actualResult = noDuplicates("aaabbbccc");

		String expectedResult = noDuplicates("abc");

		if (actualResult.equals(expectedResult)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

	public static String noDuplicates(String str) {

		String uniqueChar = "";

		for (int i = 0; i < str.length(); i++) {
			String currentChar = Character.toString(str.charAt(i));

			if (!uniqueChar.contains(currentChar)) {
				uniqueChar += currentChar;
			}
		}
		return uniqueChar;
	}

}
