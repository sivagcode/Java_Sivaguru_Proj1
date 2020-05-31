package leetCode;

public class Palindrome {
	static String str1 = "test";
	static String str2 = "";
	static int len = str1.length();
	
	public static void main (String[] args) {
		for(int i = len-1; i>=0; i--) {
		str2=str2+str1.charAt(i);
		}
		
		if (str1.equals(str2)) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("The String is not a Palindrome");
		}
	

}
	
}
