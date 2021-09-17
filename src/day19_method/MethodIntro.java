package day19_method;

public class MethodIntro {
	public static void main(String[] args) {

//  In Java, the main method is the starting point of 

		sayHello6Times(); // inside the main method, you can call another method; creating a method
							// allows you to retain and reuse code
		sayHello6Times();

		int num1 = 5;
		int num2 = 10;
//		int result = num1+num2;

		add2Number(num1, num2);

		add2Number(10, 20);

		add2Number(3, 9);

		printFlag();
		System.out.println();
		printFlag();
		System.out.println();
		printFlag();
		System.out.println();
		printFlag();
		System.out.println();
		printFlag();
		System.out.println();

	}

	public static void add2Number(int num1, int num2) {
		int result = num1 + num2;
		// System.out.println(result);
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

	public static void sayHello6Times() { // access modifier is public static; void since no value
											// is returned; the method name is sayHello6imes; no
											// parameters; code block that prints "Hello" six times
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	public static void printFlag() {
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");

	}
}
