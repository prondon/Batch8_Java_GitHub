package day19_method;

import java.util.Arrays;

public class ArrayUtil {

	public static void combine2Arrays(int numArr1[], int numArr2[]) {
//		int numArr1[] = {1,3,5,7,9};
//		int numArr2[] = {2,4,6,8};	

		int numArr3[] = new int[numArr1.length + numArr2.length];

		int position = 0;

		for (int i = 0; i < numArr1.length; i++) {
			numArr3[position] = numArr1[i];
			position++;
		}

		for (int i = 0; i < numArr2.length; i++) {
			numArr3[position] = numArr2[i];
			position++;
		}

		System.out.println(Arrays.toString(numArr3));
	}
}
