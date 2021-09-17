package day20_MethodParamsAndMethodOverloading;

public class MethodParameters {
	public static void main(String[] args) {

		sayHello("Pedro");
		
		sayHello("Nadia");
		
		sayHello("Opal");

	}

	public static void sayHello() {
		System.out.println("Hello");
	}

	public static void sayHello(String name) {  // the method name can remain the same/duplicated since
											    // a parameter was added to the new method
		System.out.println("Hello, " + name);
	}

}
