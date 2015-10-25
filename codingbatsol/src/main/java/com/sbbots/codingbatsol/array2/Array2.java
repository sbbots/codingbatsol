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
	
	/*
	 * Given an array of ints, return true if the sum of all the 2's in the
	 * array is exactly 8.
	 * 
	 * sum28({2, 3, 2, 2, 4, 2}) → true 
	 * sum28({2, 3, 2, 2, 4, 2, 2}) → false
	 * sum28({1, 2, 3, 4}) → false
	 */
	public boolean sum28(int[] nums) {

		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				total += 2;
			}
		}
		return total == 8;
	}

	/*
	 * Given an array of ints, return true if the number of 1's is greater than
	 * the number of 4's
	 * 
	 * more14({1, 4, 1}) → true 
	 * more14({1, 4, 1, 4}) → false 
	 * more14({1, 1}) → true
	 */
	public boolean more14(int[] nums) {

		int count1 = 0;
		int count4 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1++;
			}
			if (nums[i] == 4) {
				count4++;
			}
		}

		return count1 > count4;
	}

	/*
	 * Given a number n, create and return a new int array of length n,
	 * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which
	 * case just return a length 0 array. You do not need a separate
	 * if-statement for the length-0 case; the for-loop should naturally execute
	 * 0 times in that case, so it just works. The syntax to make a new int
	 * array is: new int[desired_length] (See also: FizzBuzz Code)
	 * 
	 * fizzArray(4) → {0, 1, 2, 3} 
	 * fizzArray(1) → {0} 
	 * fizzArray(10) → {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
	 */

	public int[] fizzArray(int n) {

		int[] newArr = new int[n];

		for (int i = 0; i < n; i++) {
			newArr[i] = i;
		}
		return newArr;
	}
	
}
