package day15_arrayList;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class ArrayListSimple {
	public static void main(String[] args) {
		
		ArrayList<String> gfg = new ArrayList<String>();  // ArrayList class of data type String with
														  // variable name gfg; empty ArrayList

		gfg.add("Geeks");  // this is the .add() method
		gfg.add("for");
		gfg.add("Geeks");
		
//		Arrays.asList("Geeks","for","Geeks");  // instead of using the .add() method, you can add this
											   // Arrays.asList () method directly between the 
											   // parenthesis on Line 9
											  
		System.out.println("ArrayList is: " + gfg);
		
		// create another collection:
		List<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		// create another ArrayList type Integer and initialize with previous ArrayList arr
		List<Integer> gfg2 = new ArrayList<Integer>(arr);
		
		System.out.println("ArrayList arr: "+arr);
		System.out.println("ArrayList gfg2: "+gfg2);
		
		

	}
}
