package day15_arrayList;

public class Autoboxing {
	public static void main(String[] args) {

		Integer i = new Integer(10); // Non-primitive variable i; creates an Integer object with value
										// 10; creation of an object uses a constructor with input
										// parameters

		int i1 = i; // i1 is a Primitive variable with value 10

		System.out.println("Value of i: " + i);
		System.out.println("Value of i1: " + i1);

		// Even though i and i1 have the same value, the Non-primitive variable can be
		// manipulated with various methods when called; this is not true for primitive
		// variables such as int

		Character gfg = 'a';  // initialize a Character object with value 'a'; note: Non-primitive 
							  // variables are capitalized and colored blue in Eclipse; 
							  // this is Autoboxing of char 'a'

		char ch = gfg;  // Primitive variables are colored orange and lower case in Eclipse;
						// this is unboxing of the character stored in gfg

		System.out.println("Value of gfg " + gfg);
		System.out.println("Value of ch: " + ch);

	}
}
