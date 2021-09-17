package day20_MethodParamsAndMethodOverloading;

public class Task5 {
	public static void main(String[] args) {

		/*
		 * 5. write a method that can print out the full name of a person in regular
		 * format ex: fullName("teChCirCle", "SCHOOL"); output: "Techcircle School"
		 */

		System.out.println(fullName("teChCirCle", "SCHOOL"));

	}

	public static String fullName(String str1, String str2) {

		String firstName = Character.toString(str1.charAt(0)).toUpperCase().concat(str1.substring(1).toLowerCase());

		String lastName = Character.toString(str2.charAt(0)).toUpperCase().concat(str2.substring(1).toLowerCase());

		return firstName.concat(" ").concat(lastName);

	}

}
