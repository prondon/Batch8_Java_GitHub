package day9_nestedLoop;

import java.util.Scanner;

public class Timer {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Timer");

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your wait time in minutes");

		for (int i = scan.nextInt(); i >= 1; i--) {

			System.out.println(i - 1);
			System.out.println("+++++++++++++++++++++++");
			for (int j = 59; j >= 0; j--) {
				System.out.println("Second " + j);

				Thread.sleep(1000); // hover over and choose Add throws declaration
				                    // (time) is in milliseconds

			}
		}

		System.out.println("Time's up");
		scan.close();  // Irfan closes the scanner at the end of his code
	}
}
