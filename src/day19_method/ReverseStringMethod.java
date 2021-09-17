package day19_method;

import java.util.Arrays;

public class ReverseStringMethod {
	public static void main(String[] args) {

// Index              012		
		String str = "ABC";

//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(0));

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		reverseString(str);

		reverseString("12345");

		reverseString("TechCircle");

		String names[] = { "Opal", "Nadia", "Pedro", "Mergen", "Zamira", "Famira", "Qasir" };

		// loop the names array and reverse all the names

		for (int i = 0; i < names.length; i++) {
			reverseString(names[i]);
		}
		
		int numArr1[] = {1,3,5,7,9};
		int numArr2[] = {2,4,6,8};	
		int numArr3[] = new int[numArr1.length+numArr2.length];
			
		int position = 0;
		
		for(int i=0;i<numArr1.length;i++) {
			numArr3[position]=numArr1[i];
			position++;
		}
		
		for(int i=0;i<numArr2.length;i++) {
			numArr3[position]=numArr2[i];
			position++;
		}
		
		System.out.println(Arrays.toString(numArr3));
		
	}

	public static void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();	
	}	
	
}
