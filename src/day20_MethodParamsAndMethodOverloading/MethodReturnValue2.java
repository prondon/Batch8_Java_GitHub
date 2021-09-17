package day20_MethodParamsAndMethodOverloading;

public class MethodReturnValue2 {
	public static void main(String[] args) {

		add2Num(1, 3);

		System.out.println(add3Num(1, 2, 3));

		int result = add3Num(1, 2, 3);

		System.out.println(result);

		if (passwordValidation("Password@1")) {
			System.out.println("You can now access your account.");
		}

	}

	public static void add2Num(int num1, int num2) { // when void, no value is returned
		System.out.println(num1 + num2);
	}

	public static int add3Num(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static boolean passwordValidation(String password) {
		boolean is8Digit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpecialCharacter = false;

		boolean isValid = false;

		if (password.length() >= 8) {

			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);

				if (Character.isDigit(ch)) {
					is8Digit = true;
				}
				if (Character.isUpperCase(ch)) {
					hasUpperCase = true;
				}
				if (Character.isLowerCase(ch)) {
					hasLowerCase = true;
				}
				if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
					hasSpecialCharacter = true;
				}
			}
			if (is8Digit && hasUpperCase && hasLowerCase && hasSpecialCharacter) {
				System.out.println("Welcome!!  Password is valid!!");
				isValid = true;
			} else {
				System.out.println("Password invalid");
			}
		} else {
			System.out.println("Password must be at least 8 characters long");
		}
		return isValid;
	}
}
