package hackerRank;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num =11;
			boolean isPrime = true;
			for(int x=2; x<num; x++) { 
				if(num % x == 0) {
					isPrime = false;
					break;					
		}

	}
			if(isPrime) {
				System.out.println(num + " number is prime");
			}
			else {
				System.out.println(num +" number is not a prime");
			}


	}
}
