package day7_loops_Queensy;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {

		// Initialization;
		
		// while (Condition) {
	    //   Body_Statement;
		//   including the Update;
		// }
		
		int count, number;

		System.out.println("Enter a number");

		Scanner keyboard = new Scanner(System.in);

		number = keyboard.nextInt();

		keyboard.close();
		
		count = 1;

		while (count <= number) {   // once the condition is false, you will be kicked out of the while
									// loop
			System.out.print(count + ", ");
			count++;  // update the count variable with an incrementer, increasing by 1 in each loop
		}
		System.out.println();
		System.out.println("Buckle my shoe.");
		
		System.out.println(count); // value of variable count outside of the loop
		
		/* ICU describes the parts of a While Loop
		 * 
		 * I - Initialization
		 * C - Condition
		 * U - Update
		 * 
		 * */
		
		
		
	}
}
