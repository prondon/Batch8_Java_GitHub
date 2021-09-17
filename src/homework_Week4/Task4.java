package homework_Week4;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		// Ask the user to enter a word.
		// if the word ends with "ly", print "really???" , otherwise, print "never mind"

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");

		String input = scan.next();

		String referenceData = "ly";

		if (referenceData.contains(input.substring(input.length() - 2))) {  // .equals("ly") with the
																			// substring or
																			// .endsWith("ly") with the
																			// original String will 
																			// both work as well
			System.out.println("really???");
		} else {
			System.out.println("never mind");
		}
		scan.close();
	}
}
