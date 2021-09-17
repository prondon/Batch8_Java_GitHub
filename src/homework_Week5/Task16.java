package homework_Week5;

public class Task16 {
	public static void main(String[] args) {

		/*
		 * Task 16: Who has the highest salary? String[] employeeNames = {"Nadia",
		 * "Darima", "Erkin" , "Opal", "Farima"}; index numbers: 0 1 2 3 4
		 * 
		 * int[] employeeSalary = {1000000, 110000, 105000, 120000, 125000};
		 * 
		 * Opal : $100000 .... who has the highest salary who has the minimum salary
		 */

		String[] employeeNames = { "Nadia", "Darima", "Erkin", "Opal", "Farima" };
		int[] employeeSalary = { 1000000, 110000, 105000, 120000, 125000 };

		String highEmployee = "";
		int highSalary = 0;

		String lowEmployee = "";
		int lowSalary = 0;

		for (int i = 0; i < employeeSalary.length; i++) {
			if (employeeSalary[i] > highSalary) {
				highSalary = employeeSalary[i];
				highEmployee = employeeNames[i];
			}
			lowSalary = highSalary;
			if (employeeSalary[i] < lowSalary) {
				lowSalary = employeeSalary[i];
				lowEmployee = employeeNames[i];

			}
		}
		System.out.println(highEmployee + ": " + highSalary + " .... has the highest salary");
		System.out.println(lowEmployee + ": " + lowSalary + " .... has the lowest salary");
	}
}
