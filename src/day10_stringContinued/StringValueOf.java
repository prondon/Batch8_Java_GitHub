package day10_stringContinued;

public class StringValueOf {
	public static void main(String[] args) {

		double price = 10.99;

		String price2 = String.valueOf(price); // converts double to a String

		System.out.println(price2.indexOf('.'));

		System.out.println(price2.replace("10", "10,000"));

		// One reason for converting from one data type to another is for comparison
		// purposes

	}
}
