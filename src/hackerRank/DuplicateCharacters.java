package hackerRank;

public class DuplicateCharacters {

public static void main(String[] args) {
String str = "Sakkeett";
char[] chr = str.toCharArray();
int len = str.length();
for(int i=0; i<len; i++) {
	for(int j=i+1; j<len; j++) {
		if(chr[i]==chr[j]) {
			System.out.println(chr[j]);
			//break;
		}
	}
}


	}

}
