package day14_arrayContinue;

public class Task {
	public static void main(String[] args) {

		String[] months = new String[12];

		months[0] = "january";
		months[1] = "february";
		months[2] = "march";
		months[3] = "april";
		months[4] = "may";
		months[5] = "june";
		months[6] = "july";
		months[7] = "august";
		months[8] = "september";
		months[9] = "october";
		months[10] = "november";
		months[11] = "december";

		String month = "january";

		System.out.println(Character.toString(month.charAt(0)).toUpperCase() + month.substring(1));

		//Irfan's solution:
		
		String str = "january";
		String str2 = str.toUpperCase();
//		System.out.println(str);
//		System.out.println(str2);

		String str3 = str2.substring(0, 1).concat(str.substring(1));
		System.out.println(str3);
		
	
		
		
	}
}
