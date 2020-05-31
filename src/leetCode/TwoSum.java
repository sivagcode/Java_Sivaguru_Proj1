package leetCode;

public class TwoSum {
	/*static int[] nums = {2,7,11,15};
	static int target = 9;*/
	
public static int twoSum(int[] nums, int target){
	int a = 0;
	for(int i = 0; i<nums.length; i++) {
		for(int j = i+1; j<nums.length; j++) {
			if (nums [j] == target - nums [i]) {
				a= nums [i] + nums [j];
				return a;
				//return new int[] {i,j}; (for leetcode solution)
			}
		}
		
	}
	
	throw new IllegalArgumentException("No two sum solution");
}
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
	System.out.println("Two Sum solution: " + twoSum(nums, target));
		
		
	}

}
