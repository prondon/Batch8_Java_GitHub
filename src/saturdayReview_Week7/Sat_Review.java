package saturdayReview_Week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sat_Review {
	public static void main(String[] args) {

		// Create a 2D ArrayList with 2 rows such that the the first row is a list of
		// people
		// second row is a list of the city each person lives in

		// Brian, Karen, Graham
		// Fairfax, Ashburn, Reston

		// Brian, Graham, Karen
		// Fairfax, Reston, Ashburn

		// Sort the 2d ArrayList by name of person

		List<String> names = new ArrayList<>(Arrays.asList("Brian", "Karen", "Graham"));
		List<String> cities = new ArrayList<>(Arrays.asList("Fairfax", "Ashburn", "Reston"));

		List<String> sortedNames = new ArrayList<>((List<String>) ((ArrayList<String>) names).clone());
//		sortedNames = (List<String>) ((ArrayList<String>) names).clone();
		Collections.sort(sortedNames);

		List<String> sortedCities = new ArrayList<>();

		for (int i = 0; i < sortedNames.size(); i++) {

			for (int j = 0; j < names.size(); j++) {
				if (sortedNames.get(i).equals(names.get(j))) {
					sortedCities.add(cities.get(j));

				}
			}
		}

		System.out.println(sortedNames);
		System.out.println(sortedCities);

		// Task 2:

		// Count the number of vowels in this string.

		String sentence = "The utility package contains all the classes and interfaces";
		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int count = 0;

		for (int i = 0; i < sentence.length(); i++) {

			for (int j = 0; j < vowels.size(); j++) {

				if (sentence.charAt(i) == vowels.get(j)) {
					count++;
				}
			}
		}
		System.out.println("The number of vowels is: " + count);

		// Find the third vowel, and count how many times it occurs in the String

		String phrase = "The utility package contains all the classes and interfaces";
		List<Character> vowels2 = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		List<Character> found = new ArrayList<>();
		int count2 = 0;

		for (int i = 0; i < phrase.length(); i++) {

			for (int j = 0; j < vowels2.size(); j++) {
				found.add(vowels2.get(j));
			}

		}

		for (int i = 0; i < phrase.length(); i++) {

			if (phrase.charAt(i) == found.get(2)) {
				count2++;
			}
		}
		System.out.println("The third vowel is " + found.get(2) + " and it occurs " + count2 + " times");
	}
}
