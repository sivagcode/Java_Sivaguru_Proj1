package hackerRank;

public class Palindrome {
	static String str = "bob";
	static String str3 = "";
	//private static char[] strarr = str.toCharArray();
	static int len = str.length();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			for(int i=len-1; i>=0; i--) {
			str3 = str3 + str.charAt(i);
			}	
						
		if (str.equals(str3)) {
					System.out.println("Palindrome");
				} 
				else {
					System.out.println("not a Palindrome");
				}
			
				
				
	


}


	}

