package homework_Week6;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {

		// 3. Write java program s that can add a String after the last index of a String array

		String words[] = { "I", "am", "a" };
		String words2[] = new String[words.length + 1];

		for (int i = 0; i < words.length; i++) {
			words2[i] = words[i];
		}

		words2[words.length] = "CHAMPION";

		System.out.println(Arrays.toString(words2));

	}
}
