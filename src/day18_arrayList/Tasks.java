package day18_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Tasks {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Darima");
		names.add("Opal");
		names.add("Dina");
		names.add("Zamira");
		names.add("Ariuna");
		names.add("Erkin");
		names.add("Qasir");
		names.add("Famira");
		names.add("Nadia");
		names.add("Mergen");
		names.add("Pedro");
		names.add("Elira");

		// Create a list of names that ends with letter a

		ArrayList<String> list = new ArrayList<>();
		char endsWith = 'a';

		for (String name : names) {
			if (name.charAt(name.length() - 1) == endsWith) { // name.endsWith("a"); will also work
				list.add(name);
			}
		}
		System.out.println(list);

		// Irfan's Solution:

		ArrayList<String> list1 = new ArrayList<>();

		for (int i = 0; i < names.size(); i++) {

//			String name2 = names.get(i);

			if (names.get(i).charAt(names.get(i).length() - 1) == 'a') {
				list1.add(names.get(i));
			}
		}
		System.out.println(list1);

//			if (name2.endsWith("a")) {
//				list.add(name2);
//			}

		// Create list of random numbers that contains 20 elements.

		ArrayList<Integer> nums = new ArrayList<>();

		int maxSize = 20;

		Random random = new Random();

		for (int i = 0; i < maxSize; i++) {

			nums.add(random.nextInt(100));
		}
		System.out.println(nums);
	}
}
