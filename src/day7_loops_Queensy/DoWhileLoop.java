package day7_loops_Queensy;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		int count, number;

		System.out.println("Enter a number");

		Scanner keyboard = new Scanner(System.in);

		number = keyboard.nextInt();

		keyboard.close();

		count = 1;

		do {

			System.out.print(count + ", ");
			count++;

		} while (count <= number);

		System.out.println();
		System.out.println("Buckle my shoe");

		System.out.println(count);
	}

}
