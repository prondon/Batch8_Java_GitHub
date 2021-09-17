package homework_Week5;

import java.util.Arrays;

public class Task9 {
	public static void main(String[] args) {

//	Write a Java program to sort a numeric array and a string array.
//	int[] my_array1 = {
//	           1789, 2035, 1899, 1456, 2013,
//	           1458, 2458, 1254, 1472, 2365,
//	           1456, 2165, 1457, 2456};
//
//	String[] my_array2 = {
//	           "Java",
//	            
//	           "JDBC",
//	           "SQL",
//	           "Junit",
//	           "Selenium",
//	           "Jenkins",
//	        "Cucumber",
//	         "Agile",
//	          "SDLC",
//	           "WebDriver"

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 456, 2165, 1457, 2456 };

		Arrays.sort(my_array1);

		System.out.println(Arrays.toString(my_array1));

		String[] my_array2 = { "Java", "JDBC", "SQL", "Junit", "Selenium", "Jenkins", "Cucumber", "Agile", "SDLC",
				"WebDriver" };

		Arrays.sort(my_array2);

		System.out.println(Arrays.toString(my_array2));

	}
}
