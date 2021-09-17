package day8_loopReview;

public class DoWhileLoop {

	public static void main(String[] args) {

//		Do-While loop always runs the code block at least once since the code is executed BEFORE the
//      condition is checked

//		int num = 5;
//
//		do {
//			System.out.println("Hello");    code block
//		} while (false);     the code block above will only run 1 time since the condition is false

//		int num = 5;
//
//		do {
//			System.out.println("Hello");
//		} while (true);      the code block above will run forever since the condition is true
//		

//		int num = 5;
//
//		do {
//			System.out.println("Hello");
//			num++;
//		} while (num <= 10);
//
//		System.out.println("This is line 30, value of num is " + num);

		// Task:
		// Print 90 to 65 using the do-while loop

		int i = 90;

		do {
			System.out.println(i);
			i--;
		} while (i >= 65);

	}

}
