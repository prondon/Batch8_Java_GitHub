package day20_MethodParamsAndMethodOverloading;

public class UserStoryValidation {
	public static void main(String[] args) {

		if (AC1().equals("pass") && AC2().equals("pass")) {
			System.out.println("Test Case passed");
		} else {
			System.out.println("Test Case failed");
		}

	}

	public static String AC1() {

		String result = "pass";

		return result;
	}

	public static String AC2() {

		String result = "pass";

		return result;
	}
}
