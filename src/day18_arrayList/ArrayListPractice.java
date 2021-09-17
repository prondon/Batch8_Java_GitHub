package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
public static void main(String[] args) {
	
	ArrayList <String> names = new ArrayList<>(); // create/declare AND implement an empty ArrayList
	
	System.out.println(names.size());  // 0 with no elements yet
	
	names.add("Elira");  // .add(); method to add elements to existing ArrayList
	names.add("Mergen");
	names.add("Famira");
	
	System.out.println(names.size());  // 3 elements
	
	System.out.println(names.get(2));  // returns value/element at index position 2
	System.out.println(names.get(1));  // .get(); this method reads data
	System.out.println(names.get(0));
	
	names.remove(0);  // .remove() method removes data along with index position; causing a resizing
					  // of the ArrayList and change of index for remaining data
	names.remove(0);

	System.out.println(names.size());  // size was reduced due to .remove(); method above  
//	System.out.println(names.get(1)); 
	System.out.println(names.get(0));
	
	
	names.add("Dina");
	names.add("Hannah");
	
	System.out.println(names.get(2));  
	System.out.println(names.get(1));  
	System.out.println(names.get(0));
	
	names.add("Zamira");
	names.add("Nadia");
	
	System.out.println(names.get(4));  // Nadia
	names.set(0, "Pedro");  // .set(); method will update a value at a specific index position
	System.out.println(names.get(0));
	
	names.set(0, "Pedro".toUpperCase());
	System.out.println(names.get(0));
	
	
	// Create ArrayList of fruits, Method 1 using .add(); method
	
	ArrayList <String> fruits = new ArrayList<>();
	
	fruits.add("Apples");
	fruits.add("Bananas");
	fruits.add("Peaches");
	fruits.add("Strawberries");
	fruits.add("Grapes");
	
	System.out.println(fruits);
	
	// Create ArrayList of fruits, Method 2 using Arrays.asList(); method
	
	ArrayList <String> fruits2 = new ArrayList<>(Arrays.asList("Apples","Bananas","Peaches","Strawberries","Grapes"));
	System.out.println(fruits2);
	
	System.out.println(fruits.get(0).equals(fruits2.get(0)));
}
}
