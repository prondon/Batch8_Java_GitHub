package day15_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
	public static void main(String[] args) {

		// Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("White");
		colors.add("Blue");

		System.out.println("ArrayList is " + colors);
		System.out.println();

		System.out.println("List printed with Advanced For Loop:");

		for (String america : colors) {
			System.out.println(america);

			// Write a Java program to update specific array elements by given element.
			// replace panda -> bear
			// Also, print the position index in which panda was modified at
		}
		String lookingFor = "panda";
		String replaceWith = "bear";

		List<String> animals = new ArrayList<>(Arrays.asList("dog", "cat", "rabbit", "panda", "pidgeon", "panda"));

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).equals(lookingFor)) {
				animals.set(i, replaceWith);

				System.out.println("The position index of the modification is " + i);
			}
		}
		System.out.println(animals);
	}
}
