package homework_Week6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {

		// write a program that can remove the digits and letters from an array list of
		// characters

		ArrayList<Character> list = new ArrayList<>(
				Arrays.asList('a', 'b', '$', '1', '2', '$', 'C', 'D', '$', '3', '4'));

		for (int i = 0; i < list.size(); i++) {
			
			if (Character.isLetter(list.get(i))) {

				list.remove(i);
			
			}
		}
		System.out.println(list);

	}
}
