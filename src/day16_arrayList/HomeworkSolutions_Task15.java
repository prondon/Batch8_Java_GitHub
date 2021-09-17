package day16_arrayList;

// import java.util.Arrays;

public class HomeworkSolutions_Task15 {
	public static void main(String[] args) {

// index                0         1              2
//	int [][] arr2D= {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
// index              0 1 2   0 1 2 3 4   0  1  2  3  4 	

// Task 1:
//	9 10 11 12 13	
//  4 5 6 7 8
//	1 2 3

		// hard-coded which is not recommended:
//	System.out.print(arr2D[2][0]+" ");
//	System.out.print(arr2D[2][1]);
//	System.out.println();
//	
//	System.out.print(arr2D[1][0]+" ");
//	System.out.print(arr2D[1][1]);
//	System.out.println();
//	
//	System.out.print(arr2D[0][0]+" ");
//	System.out.print(arr2D[0][1]+" ");
//	System.out.print(arr2D[0][2]);
//	System.out.println();

// index          0 1  2  3  4	
//	int nums[] = {9,10,11,12,13};
//	
//	for(int i= 4; i>=0; i--) {
//		//System.out.println(i);
//		System.out.println(nums[i]);
//	}

//	for(int i= nums.length-1; i>=0; i--) {
//		//System.out.println(i);
//		System.out.println(nums[i]);
//	}

// Task 1:
//	9 10 11 12 13	
//  4 5 6 7 8
//	1 2 3

// index                0         1              2
		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };
// index              0 1 2   0 1 2 3 4   0  1  2  3  4 	

		for (int i = arr2D.length - 1; i >= 0; i--) {
			// System.out.println(i);
			// System.out.println(Arrays.toString(arr2D[i]));

			for (int k = 0; k < arr2D[i].length; k++) {
				System.out.print(arr2D[i][k] + " "); // +" " to add a space and get correct format
			}
			System.out.println(); // new line after each iteration
		}
// ==============================================================================================

// Task 2:
//	3 2 1
//	8 7 6 5 4	
//  13 12 11 10 9		
		System.out.println();

		int[][] arr2D2 = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };

		for (int i = 0; i < arr2D2.length; i++) {  // outer loop which accesses the individual arrays 
												   // in the entire 2D array
		//	System.out.println(Arrays.toString(arr2D2[i]));
			for (int k = arr2D2[i].length - 1; k >= 0; k--) {
				System.out.print(arr2D[i][k] + " "); // +" " to add a space and get correct format
			}
			System.out.println(); // new line after each iteration
		}

// Task 3:
//  13 12 11 10 9
//  8 7 6 5 4
//  3 2 1			
		
		System.out.println();

		int[][] arr2D3 = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };
		

		for (int i =arr2D3.length-1;i>=0; i--) {  
	
			for (int k = arr2D3[i].length - 1; k >= 0; k--) {
				System.out.print(arr2D3[i][k] + " "); 
			}
			System.out.println();
		}
		
	}
}
