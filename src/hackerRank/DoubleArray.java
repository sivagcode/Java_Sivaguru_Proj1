package hackerRank;

public class DoubleArray {

		  public static void main(String[] args) {
		    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		    //myNumbers.length is 2 arrays in this case so length of myNumbers=2
		    for (int i = 0; i < myNumbers.length; i++) {
		    //Inner loop executes completely as per loop condition and then goes back to outer loop increment again and then again executes inner loop completely.. the outer & inner continues to  
		      for(int j = 0; j < myNumbers[i].length; j++) {
		        System.out.println(myNumbers[i][j]);
		      }
		    }
		  }
		}

