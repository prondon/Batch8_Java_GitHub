package homework_Week5;

public class Task15a {
	public static void main(String[] args) {

		/*
		 * Task 15a: Input: int[][] arr2D = { {1,2,3} , {4,5,6,7,8} , {9,10,11,12,13} };
		 * output: 9 10 11 12 13 
		 *         4 5 6 7 8 
		 *         1 2 3
		 */

		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };

		for (int i = arr2D.length - 1; i >= 0; i--) {
			
			for (int j = 0; j < arr2D[i].length; j++) {
				
				System.out.println(arr2D[i][j]);
				
			}
		}
	}
}