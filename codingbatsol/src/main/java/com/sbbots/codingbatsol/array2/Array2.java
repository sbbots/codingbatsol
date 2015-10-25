package com.sbbots.codingbatsol.array2;

public class Array2 {

	public static void main(String[] args) {

		// Instantiate the object and call the required methods.

	}

	/*
	 * Return the sum of the numbers in the array, except ignore sections of
	 * numbers starting with a 6 and extending to the next 7 (every 6 will be
	 * followed by at least one 7). Return 0 for no numbers.
	 * 
	 * sum67({1, 2, 2}) → 5 
	 * sum67({1, 2, 2, 6, 99, 99, 7}) → 5 
	 * sum67({1, 1, 6, 7, 2}) → 4
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

	/*
	 * Given an array of ints, return true if the array contains a 2 next to a 2
	 * somewhere.
	 * 
	 * has22({1, 2, 2}) → true 
	 * has22({1, 2, 1, 2}) → false
	 * has22({2, 1, 2}) → false
	 */

	public boolean has22(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the array contains no 1's and no
	 * 3's.
	 * 
	 * lucky13({0, 2, 4}) → true
	 * lucky13({1, 2, 3}) → false
	 * lucky13({1, 2, 4}) → false
	 */

	public boolean lucky13(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
		}
		return true;

	}

}
