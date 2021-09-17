package day15_arrayList;

import java.util.ArrayList;

public class ArrayListOperations {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(); // declares AND initializes a String type empty
													 // ArrayList called list1

		list1.add("A"); // we append value "A" and so forth to the ArrayList
		list1.add("B");
		list1.add("C");
		list1.add("D");

		ArrayList<String> list2 = new ArrayList<>(); // list 2

		list2.add("E");
		list2.add("F");

		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();

		list1.addAll(2, list2); // .addAll() method inserts list2 right before position 2 and shifts
								// the remaining elements down; modifies list1 to combine with list2
								// at a specific position
		System.out.println(list1);  // returns combines list
		
		

		ArrayList<String> list3 = new ArrayList<>();
	

		list3.add("A"); // we append value "A" and so forth to the ArrayList
		list3.add("B");
		list3.add("C");
		list3.add("D");

		ArrayList<String> list4 = new ArrayList<>();

		list4.add("E");
		
		list3.addAll(list4); // .addAll() method can also be used without specifying an index position
							 // and the addition will occur after the final position of the original
						     // ArrayList

		System.out.println(list3);  // returns combines list

	}
}
