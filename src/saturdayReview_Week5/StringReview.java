package saturdayReview_Week5;

public class StringReview {
	public static void main(String[] args) {

		String str = "     Hello";

		int charCount = str.length();

		System.out.println(charCount);

		char firstChar = str.charAt(0);

		System.out.println(firstChar);

		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf('l', 3)); // Since there are two instances of 'l', you can ask
													// Java to start searching from a specific index
													// position

		int num1 = 4;
		int num2 = 10;

		if (num1 == num2) {
			System.out.println("They're equal");
		}

		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str); // the original variable is not updated in this code
		System.out.println("code is updated here");
		str = str.trim();
		System.out.println(str);
	}
}
