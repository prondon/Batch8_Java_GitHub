package day16_arrayList;

import java.util.Arrays;

public class StringToCharArray {
	public static void main(String[] args) {

		String str = "TechCircle";

		char letters[] = new char[str.length()];

		System.out.println(letters.length); // 10 elements in the letters array

		System.out.println(Arrays.toString(letters)); // [, , , , , , , , , ]

		letters[0] = 'T';
		letters[0] = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {
			letters[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(letters));

		char letters2[] = str.toCharArray();  // using the .toCharArray() method
		
		System.out.println(Arrays.toString(letters2));
	}
}
