package hackerRank;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I'm a good boy";
		char[] strarr = str.toCharArray();
		int len = strarr.length;
		//System.out.print(len);
		
		for(int i=len-1; i>=0; i--) {
			//if(i>=0) {
				System.out.print(strarr[i]);
			//}
			
				
		}
		
				

	}

}
