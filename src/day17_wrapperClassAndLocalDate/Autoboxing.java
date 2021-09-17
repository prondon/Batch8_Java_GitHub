package day17_wrapperClassAndLocalDate;

public class Autoboxing {
	public static void main(String[] args) {

//	Autoboxing --> convert primitive to object
//						   boolean      Boolean
//						   byte         Byte
//						   char			Character
//						   short		Short
//						   int			Integer
//						   long			Long
//						   float		Float
//						   double		Double

		int num = 100;
		Integer num2 = num;

		System.out.println(num);
		System.out.println(num2);

		short s = 300;
		Short objShort = s;

		System.out.println(objShort);
	}
}
