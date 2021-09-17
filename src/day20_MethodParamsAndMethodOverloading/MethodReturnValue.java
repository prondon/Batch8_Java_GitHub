package day20_MethodParamsAndMethodOverloading;

public class MethodReturnValue {
	public static void main(String[] args) {

//		getURL();

		System.out.println(getURL());
		
		String url = getURL();  // you can store the return value from the method created below to a 
		  					    // variable
		System.out.println(url);
		
	}

//	public static void getURL() {
//		System.out.println("google.com");
//	}

	public static String getURL() {
		return "google.com";
	}
}
