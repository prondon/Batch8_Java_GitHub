package day19_method;

public class HomeworkSolutions {
	public static void main(String[] args) {

		/*
		 * Password validation 1. 8 character at least 2. there must be a digit (isUpper
		 * isLowercase) 3. there must be a letter (at least one upper case & one lower
		 * case) 4. there must be special character
		 */

		String password = "Password@1";

		passwordValidation(password);

		passwordValidation("pass123@");

		passwordValidation("");

		passwordValidation("PASS@1");

		passwordValidation("PASS@1WORD");

	}

	public static void passwordValidation(String password) {
		boolean is8Digit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpecialCharacter = false;

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
			} else {
				System.out.println("Password invalid");
			}
		} else {
			System.out.println("Password must be at least 8 characters long");
		}

	}

}
