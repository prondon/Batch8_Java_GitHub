package homework_Week6;

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {

		// 4. Write java program that can add a char after last index of a char array

		char letters[] = { 'w', 'x', 'y' };
		char letters2[] = new char[letters.length + 1];

		for (int i = 0; i < letters.length; i++) {
			letters2[i] = letters[i];
		}

		letters2[letters.length] = 'z';

		System.out.println(Arrays.toString(letters2));

	}
}
