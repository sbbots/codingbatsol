package com.sbbots.codingbatsol.array2;

public class Array2 {

	public static void main(String[] args) {
		
		//Instantiate the object and call the required methods.
		
		
	}

	/*
	 * Return the sum of the numbers in the array, except ignore sections of
	 * numbers starting with a 6 and extending to the next 7 (every 6 will be
	 * followed by at least one 7). Return 0 for no numbers.
	 * 
	 * sum67({1, 2, 2}) → 5 sum67({1, 2, 2, 6, 99, 99, 7}) → 5 sum67({1, 1, 6,
	 * 7, 2}) → 4
	 */
	public int sum67(int[] nums) {

		int len = nums.length;
		int total = 0;
		boolean add = false;
		int excl = 0;

		for (int i = 0; i < len; i++) {

			total = total + nums[i];
			
			if (add) {
				excl = excl + nums[i];

				if (nums[i] == 7) {
					add = false;
				}
			}

			if (nums[i] == 6 && !add) {
				add = true;
				excl = excl + nums[i];
			}
		}

		return total - excl;

	}

}
