package homework_Week6;

import java.util.ArrayList;

public class Task6 {
	public static void main(String[] args) {

		/*
		 * write a program that can return the sum of all the digits from a string ex:
		 * input: “a1b2c3” output: 6 (1+2+3= 6) input: “Today’s date is 04/27/2020"
		 * output: 17 (0+4+2+7+2+0+2+0=17)
		 */

		String str = "a1b2c3";
		String str2 = "Today’s date is 04/27/2020";

		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		int total1 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				String currentChar = Character.toString(str.charAt(i));
				list.add(currentChar);

			}
		}

		for (int i = 0; i < list.size(); i++) {
			int value = Integer.parseInt(list.get(i));
			total1 += value;
		}

		System.out.println(total1);

		int total2 = 0;

		for (int i = 0; i < str2.length(); i++) {
			if (Character.isDigit(str2.charAt(i))) {
				String currentChar = Character.toString(str2.charAt(i));
				list2.add(currentChar);

			}
		}
		
		for (int i = 0; i < list2.size(); i++) {
			int value = Integer.parseInt(list2.get(i));
			total2 += value;
		}

		System.out.println(total2);

	}
}
