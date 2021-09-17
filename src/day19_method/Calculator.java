package day19_method;

public class Calculator {

	public static void main(String[] args) {

		addition(3, 6);

		addition(13, 16);

		addition(0, 16);

		subtraction(10, 3);

		multiplication(2, 20);

		division(100, 20);
		
	}

	public static void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void multiplication(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void division(int num1, int num2) {
		System.out.println(num1 / num2);
	}

}
