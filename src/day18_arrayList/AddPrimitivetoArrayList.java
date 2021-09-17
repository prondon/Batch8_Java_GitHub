package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddPrimitivetoArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> scores = new ArrayList<>();

		scores.add(10);
		scores.add(20);
		scores.add(22);
		scores.add(33);

		System.out.println(scores.get(0));
		System.out.println(scores.get(0).doubleValue()); // you can easily Integer's class method,
															// .doubleValue();

		// Create Character list and add digits & letters

		ArrayList<Character> digitsLetters = new ArrayList<>(Arrays.asList
				('1', '2', '3', 'a', 'b', 'c'));
		System.out.println(digitsLetters);

		System.out.println(digitsLetters.get(0)); // 1
		System.out.println(Character.isDigit(digitsLetters.get(0))); // true

		System.out.println(digitsLetters.size()); // 6

		System.out.println(digitsLetters.get(5)); // c
		System.out.println(digitsLetters.get(digitsLetters.size() - 1));  // dynamic way of finding the
																		  // character in the final 
																		  // position of the ArrayList

	}
}
