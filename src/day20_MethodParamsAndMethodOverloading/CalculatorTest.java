package day20_MethodParamsAndMethodOverloading;

public class CalculatorTest {

	public static void main(String[] args) {

		int result1 = Calculator.addition(10, 30);

		System.out.println(result1); // 40

		int result2 = Calculator.subraction(result1, 10);

		System.out.println(result2); // 30

		int result3 = Calculator.multiplication(result1, result2);

		System.out.println(result3); // 1200

		System.out.println(Calculator.multiplication(Calculator.addition(10, 30),
				Calculator.subraction(Calculator.addition(10, 30), 10)));
	}

}
