package day17_wrapperClassAndLocalDate;

public class WrapperClassPractice {
	public static void main(String[] args) {

		Integer a = 10;

		byte b = a.byteValue();

		System.out.println(b);

		double d = a.doubleValue();

		System.out.println(d);

		long l = a.longValue();

		System.out.println(l);

		String num = "123";
		System.out.println(num + 7); // 1237; simply returns a concatenation

		int value = Integer.parseInt(num);  // this method extracts the numeric value and converts
											// to Integer data type

		System.out.println(value);
		System.out.println(value + 7); // proves that this an actual numeric value

		int result = value + 7;

		System.out.println(result);  // 130

		num = Integer.toString(result);

		System.out.println(num.charAt(1));  // 3

		String str2 = "25";

		byte valueB = Byte.parseByte(str2); // valueB is now holding numeric value of 25

		System.out.println(valueB);

		// Add 100 to the valueB and assign the result to the str2

		// My solution:

//		int result2 = valueB+100;
//		
//		str2 = Integer.toString(result2);
//		
//		System.out.println(str2);

		byte result2 = (byte) (valueB + 100);

		System.out.println(result2 + " as byte");

		str2 = Byte.toString(result2);

		System.out.println(str2 + " as String");

	}
}
