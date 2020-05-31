package leetCode;

public class StringisAlphanumeric {
	
	public static boolean isAN(String s) {
		return s !=null && s.matches("^[a-zA-Z0-9]*$");
	}

	public static void main (String[] args) {
		String s = "ABC123";
		System.out.println("Is String Alphanumeric: " + isAN(s));
	}
	
}
