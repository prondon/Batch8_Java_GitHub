package homework_Week6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
	public static void main(String[] args) {

		/*
		 * 2. write a program that can multiply each odd number by 2 
		 * ex: list = [1,2,3,4,5]; output: [2,2,6,4,10]
		 * 
		 */

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 2 == 1) {
				int num = list.get(i);
				num *= 2;
				list.set(i, num);
			}
		}
		
		System.out.println(list);
	}
}
