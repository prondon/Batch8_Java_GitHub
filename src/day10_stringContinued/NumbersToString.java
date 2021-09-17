package day10_stringContinued;

public class NumbersToString {
public static void main(String[] args) {
	
	int num = 100;
	
	int num2 = num+5;
	System.out.println(num2);  // 105
	
	String num3 = ""+num;  // convert a number/integer to a String; convert from one data type to 
						   // another; similar to String num3 = "100";
	System.out.println(num3);
	
	System.out.println(num3.length());  // 3; the string "100" has 3 characters
	
	System.out.println(num3.charAt(0));  // 1; the character at index position 0 is 1
	
	System.out.println(num3+5);  // 1005; "100" + 5
//				   01234		
	double price = 10.99;
	
	String price2 = ""+price;
	System.out.println(price2.length());  // 5; the string "10.99" has 5 characters
	System.out.println(price2.indexOf('.'));  // 2; the '.' is at index position 2
	System.out.println(price2.charAt(2));
	
}
}
