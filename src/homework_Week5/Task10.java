package homework_Week5;

import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {

//	Task 10:
//		 Write a Java program to find index of Jenkins before sorting and after sorting.
//		String[] my_array2 = {
//		           "Java",
//		            
//		           "JDBC",
//		           "SQL",
//		           "Junit",
//		           "Selenium",
//		           "Jenkins",
//		        "Cucumber",
//		         "Agile",
//		          "SDLC",
//		           "WebDriver"
//		        
//		       };
		String[] my_array2 = { "Java", "JDBC", "SQL", "Junit", "Selenium", "Jenkins", "Cucumber", "Agile", "SDLC",
				"WebDriver" };

		String lookingFor = "Jenkins";

		System.out.println("Original array: " + Arrays.toString(my_array2));

		for (int i = 0; i < my_array2.length; i++) {
			if (my_array2[i] == lookingFor) {
				System.out.println("Index of " + lookingFor + " is " + i + " before sorting");
			}
		}

		Arrays.sort(my_array2);

		System.out.println("Sorted array: " + Arrays.toString(my_array2));

		for (int i = 0; i < my_array2.length; i++) {
			if (my_array2[i] == lookingFor) {
				System.out.println("Index of " + lookingFor + " is " + i + " after sorting");
			}
		}
	}
}
