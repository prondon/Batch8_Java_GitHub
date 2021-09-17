package homework_Week6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {
	public static void main(String[] args) {

		// write a program that find the unique names from an arraylist of string

		ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Mary", "John", "Bob", "Susan", "Bob"));

		for (int i = 0; i < names.size(); i++) {
			int count = 0;
			for (int k = 0; k < names.size(); k++) {
				if (names.get(i) == names.get(k)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(names.get(i) + " ");
			}
		}
	}
}
