package day15_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		System.out.println("For Loop");

		for (int i = 0; i < arrlist.size(); i++) { // .size() method used to get the length/number
												   // of elements in an ArrayList
			System.out.println(arrlist.get(i)); // .get() method retrieves an element from a
												// specified position in the ArrayList
		}
		System.out.println("Advanced For Loop");

		for (Integer num : arrlist) {
			System.out.println(num);
		}

		System.out.println("While Loop");

		int count = 0; // initialize
		while (count < arrlist.size()) { // condition
			System.out.println(arrlist.get(count));
			count++; // update
		}

		// Looping ArrayList using iterator
		System.out.println("Iterator");

		Iterator<Integer> iter = arrlist.iterator();  // call .iterator() method
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
