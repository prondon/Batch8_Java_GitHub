package day9_nestedLoop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {

//		This program uses for loop, if/else if statement, break, scanner tool, and random tool

		Random random = new Random(); // this tool will be used to create a random number

		int secretNumber = random.nextInt(10); // max limit set to 10 for this integer

//		System.out.println(secretNumber);

		int attempt = 3;

		Scanner scan = new Scanner(System.in);

		for (int i = attempt; i >= 1; i--) { // for (int attempt = 3; attempt >= 1; attempt--) {
			  								 // this for loop dictates number of iterations/attempts
			System.out.println("Please guess a number!");

			int num = scan.nextInt();

			if (num == secretNumber) { // if/else if statement
				System.out.println("Congrats!");
				break; // stop iterations since secretNumber was guessed correctly
			} else if (num > secretNumber) {
				System.out.println("Too high!"); // gives player a hint
			} else {
				System.out.println("Too low!"); // gives player a hint
			}

		}

		scan.close();
		System.out.println("Thanks for Playing! Game Over"); // print this statement after the loop
															 // stopped iterating
	}
}
