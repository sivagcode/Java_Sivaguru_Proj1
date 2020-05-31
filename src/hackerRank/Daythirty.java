package hackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

	public class Daythirty {

	    //private static final Scanner scanner = new Scanner();

	    public static void main(String[] args) {
	        int N = 3;
	        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if (N%2!=0){
	        System.out.println("weird");
	        }
	        else if (N%2==0 && (N>=2||N<=5)){
	            System.out.println("not weird");
	        }
	        else if (N%2==0 && (N>=6||N<=20)){
	            System.out.println("weird");
	        }
	        else if (N%2==0 && N>20){
	            System.out.println("not weird");
	        }
	       // scanner.close();
	    }
	}


