package homework_Week5;

public class Task15b {
	public static void main(String[] args) {

		/*
		 * Task 15b: Input: int[][] arr2D = { {1,2,3} , {4,5,6,7,8} , {9,10,11,12,13} };
		 * output: 3 2 1 
		 * 		   8 7 6 5 4 
		 * 		   13 12 11 10 9
		 */

		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };

		for (int i = 0; i < arr2D.length; i++) {

			for (int j = arr2D[i].length - 1; j >= 0; j--) {

				System.out.println(arr2D[i][j]);
				
			}
		}
	}
}
