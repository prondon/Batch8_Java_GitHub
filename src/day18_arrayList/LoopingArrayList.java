package day18_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopingArrayList {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Darima");
		names.add("Opal");
		names.add("Dina");
		names.add("Zamira");
		names.add("Ariuna");
		names.add("Erkin");
		names.add("Qasir");

		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));
		System.out.println(names.get(6));

		System.out.println("For Loop");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("While Loop");

		int i = 0;

		while (i < names.size()) {
			System.out.println(names.get(i));
			i++;
		}

		System.out.println("Do While Loop");

		int count = 0;

		do {
			System.out.println(names.get(count));
			count++;
		} while (count < names.size());

		System.out.println("For Each Loop");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("Iterator");

		Iterator<String> iter = names.iterator(); // create Iterator object

//		iter.next();
//		iter.next();
//		iter.next();
//		
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
		
		while (iter.hasNext()) {  // .hasNext(); method on the iter variable gives a boolean result;	
								  // if true, execute the subsequent code block
			System.out.println(iter.next()); // note .next(); method instead of .get(); method; 
											 // .next(); method moves the cursor to the next element
		}
	}

}
