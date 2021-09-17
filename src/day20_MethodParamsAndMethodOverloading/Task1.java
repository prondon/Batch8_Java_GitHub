package day20_MethodParamsAndMethodOverloading;

public class Task1 {
	public static void main(String[] args) {

		// 1. create a function that can check if the given integer is positive,
		// negative or zero

		System.out.println(checkIntegers(10));

		System.out.println(checkIntegers(-10));

		System.out.println(checkIntegers(0));
		
		System.out.println(checkIntegers2(10));

		System.out.println(checkIntegers2(-10));

		System.out.println(checkIntegers2(0));

	}

	public static String checkIntegers(int num) {

		String msg = "";

		if (num > 0) {
			msg = "Positive";
		} else if (num < 0) {
			msg = "Negative";
		} else if (num == 0) {
			msg = "Zero";
		}
		return msg;
	}

	// My solution:

	public static String checkIntegers2(int num) {

		if (num > 0) {
			return "Positive";
		}

		if (num < 0) {
			return "Negative";
		}

		if (num == 0) {
			return "Zero";
		}

		return null;

	}

}
