package day16_arrayList;

public class HomeworkSolutions_Task16 {
	public static void main(String[] args) {

		String[] employeeNames = { "Nadia", "Darima", "Erkin", "Opal", "Farima" };
//    // index numbers:      0        1          2       3         4
//
		int[] employeeSalary = { 1000000, 110000, 105000, 120000, 125000 };
		/*
		 * Opal : $100000 .... who has the highest salary who has the minimum salary
		 */

//		int max = 0;
//
//		int A = 10;
//
//		int B = 20;
//
//		if (A > B) {
//			max = A;
//
//		}

//		System.out.println(max);

		int position = 0; // declare a variable to hold the updated position
		int maxSalary = 0; // declare a variable to hold the highest salary

		for (int i = 0; i < employeeSalary.length; i++) {

			if (employeeSalary[i] > maxSalary) {
				maxSalary = employeeSalary[i]; // if true, you must update your maxSalary and position
				position = i;
			}
		}
		System.out.println(employeeNames[position] + " : $" + maxSalary);

		int minSalary = maxSalary;

		for (int i = 0; i < employeeSalary.length; i++) {

			if (employeeSalary[i] < minSalary) {
				minSalary = employeeSalary[i]; // if true, you must update your maxSalary and position
				position = i;
			}

		}
		System.out.println(employeeNames[position] + " : $" + minSalary);
	}
}
