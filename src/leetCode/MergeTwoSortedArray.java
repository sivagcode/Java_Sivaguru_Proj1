package leetCode;

import java.util.Arrays;

public class MergeTwoSortedArray {
	static int [] arr1 = {1,4,6,8};
	static int [] arr2 = {3,5,6,7,9};
	static int a1 = arr1.length;
	static int a2 = arr2.length;
	static int a3 = a1 + a2;
	static int [] arr3 = new int [a3];
	
	
	public static void main(String [] args) {
	int i=0;
	int j=0;
	int k=0;
		while (i<a1 && j<a2) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];				
			}
			else {
				arr3[k++]=arr2[j++];
			}
		}
		
		while (i<a1) {
			arr3[k++] = arr1[i++];
		}
		while(j<a2) {
			arr3[k++] = arr2[j++];
		}
		
		//To take print out of Int Array use the function below.
		System.out.println("arr3: " +Arrays.toString(arr3));
		
	}
}
