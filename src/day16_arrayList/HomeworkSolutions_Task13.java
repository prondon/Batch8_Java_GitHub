package day16_arrayList;

import java.util.Arrays;

public class HomeworkSolutions_Task13 {
	public static void main(String[] args) {

//	Task 13:
//	Write a Java program to find the duplicate values of an array of integer values.

		// Nadia's solution:

		int[] my_array1 = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < my_array1.length; i++) {
			for (int j = i + 1; j < my_array1.length; j++) {
				// System.out.println("looking for <"+my_array1[i]+"> found
				// <"+my_array1[j]+">");
				if (my_array1[j] == my_array1[i]) {
					System.out.print(my_array1[i] + " ");
				}
			}
		}

		System.out.println();

		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };

		Integer num = 55;

		String num2 = num.toString();

		System.out.println(num2);
		System.out.println(num2.charAt(0)); // 5

		int num3 = 99;

		String num4 = "" + num3; // one way to convert primitive int to String
		String num5 = String.valueOf(num3); // // second way to convert primitive int to String

		System.out.println(num4);
		System.out.println(num5);

		String uniqueElements = "";

		for (int i = 0; i < my_array.length; i++) {
			if (!uniqueElements.contains(String.valueOf(my_array[i]))) {
				uniqueElements += String.valueOf(my_array[i]).concat(",");
			} else {
				System.out.print(my_array[i] + " ");
			}
		}
		System.out.println();
		System.out.println(uniqueElements);

		uniqueElements = uniqueElements.substring(0, uniqueElements.length() - 1); // remove comma (,)
		System.out.println(uniqueElements);

		String numbers[] = uniqueElements.split(",");

		System.out.println(Arrays.toString(numbers));

		int uniqueNumbersArr[] = new int[numbers.length];

//		uniqueNumbersArr[0]=Integer.parseInt(numbers[0]);

		for (int i = 0; i < uniqueNumbersArr.length; i++) {
			uniqueNumbersArr[i] = Integer.parseInt(numbers[i]);
		}

		System.out.println("***" + Arrays.toString(uniqueNumbersArr));

		uniqueNumbersArr[0] = 9;
//		uniqueNumbersArr[0] = "9";  will not work since value is a String

		int myNumber = Integer.parseInt("9");

		System.out.println(myNumber);
		System.out.println(myNumber + 1);

//		String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

		String[] my_array2 = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		for (int i = 0; i < my_array2.length; i++) {
			for (int k = i + 1; k < my_array2.length; k++) {
				if (my_array2[i] == my_array2[k]) {
					System.out.print(my_array2[i] + " ");
				}
			}
		}
	}
}
