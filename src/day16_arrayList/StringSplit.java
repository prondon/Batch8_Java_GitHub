package day16_arrayList;

import java.util.Arrays;

public class StringSplit {
	public static void main(String[] args) {

		String task = "Write a Java program."; // the commonality in this String sentence are the spaces;
												// 4 words, 3 spaces
		int spaceCount = 0;

		char letters[] = task.toCharArray();

		System.out.println("CharArray: " + Arrays.toString(letters));

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == ' ') {
				spaceCount++;
			}
		}
//		System.out.println(spaceCount);

		int wordCount = spaceCount + 1;
		System.out.println("Number of words is " + wordCount);

		// String Split will return a String array

		String arr[] = task.split(" ");
		System.out.println("Split: " + Arrays.toString(arr));
		System.out.println("Number of words is " + arr.length);  // .length(); method returns numbers
																 // of elements

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String task2 = "Write a Java program that can print the unique characters in the array of integers";

		String arr2[] = task2.split("the");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Number of phrases is " + arr2.length);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
