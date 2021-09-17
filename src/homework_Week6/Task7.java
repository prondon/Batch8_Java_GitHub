package homework_Week6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
	public static void main(String[] args) {

		/*
		 * 1. write a program that can set the last element of the Integer arraylist to
		 * zero 
		 * ex: list = [1,2,3,4,5]; output: [1,2,3,4,0];
		 */

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		list.set(list.size() - 1, 0);

		System.out.println(list);
	}

}
