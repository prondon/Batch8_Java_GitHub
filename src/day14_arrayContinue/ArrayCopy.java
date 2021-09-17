package day14_arrayContinue;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {

		int a[] = { 1, 8, 3 };

		int b[] = new int[a.length];

//		b = a;
//		
//		System.out.println(a);  // returns memory location
//		System.out.println(b);
//		
//		System.out.println(a[0]==b[0]);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		b[0] = a[0];  
		b[1] = a[1];
		b[2] = a[2];

		System.out.println(a[0] == b[0]);

	}
}
