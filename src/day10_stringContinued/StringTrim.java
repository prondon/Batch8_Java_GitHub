package day10_stringContinued;

public class StringTrim {
	public static void main(String[] args) {

		String str = "Hello Java";
		System.out.println(str.length()); // 10

		str = str.trim();
		System.out.println(str.length());  // 10; .trim(); method only removes extra blank spaces at 
										   // beginning and end of your String; it is good practice 
										   // to trim your data; does not remove inside/middle spaces

		String str2 = "Hello Java       ";
		System.out.println(str2.length()); // 17; returns total characters including the spaces

		str2 = str2.trim();
		System.out.println(str2.length());  // 10

		
		String str3 = "                             Hello Java          ";
		System.out.println(str3.length()); // 49; returns total characters including the spaces

		str3 = str3.trim();
		System.out.println(str3.length()); // 10
		
		
		
		
		
		
		
	}
}
