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
	
	/*
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 * only14({1, 4, 1, 4}) → true 
	 * only14({1, 4, 2, 4}) → false 
	 * only14({1, 1}) → true
	 */
	public boolean only14(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Given a number n, create and return a new string array of length n,
	 * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which
	 * case just return a length 0 array. Note: String.valueOf(xxx) will make
	 * the String form of most types. The syntax to make a new string array is:
	 * new String[desired_length] (See also: FizzBuzz Code)
	 * 
	 * fizzArray2(4) → {"0", "1", "2", "3"}
	 * fizzArray2(10) → {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"} 
	 * fizzArray2(2) → {"0", "1"}
	 */
	public String[] fizzArray2(int n) {

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = String.valueOf(i);
		}
		return arr;
	}
	
	/*
	 * Given an array of ints, return true if it contains no 1's or it contains
	 * no 4's.
	 * 
	 * no14({1, 2, 3}) → true 
	 * no14({1, 2, 3, 4}) → false 
	 * no14({2, 3, 4}) → true
	 */
	public boolean no14(int[] nums) {

		boolean fours = true;
		boolean ones = true;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				ones = false;
				continue;
			}
			if (nums[i] == 4) {
				fours = false;
				continue;
			}
		}

		return ones || fours;
	}

	/*
	 * We'll say that a value is "everywhere" in an array if for every pair of
	 * adjacent elements in the array, at least one of the pair is that value.
	 * Return true if the given value is everywhere in the array.
	 * 
	 * isEverywhere({1, 2, 1, 3}, 1) → true 
	 * isEverywhere({1, 2, 1, 3}, 2) → false 
	 * isEverywhere({1, 2, 1, 3, 4}, 1) → false
	 */
	public boolean isEverywhere(int[] nums, int val) {

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == val || nums[i + 1] == val) {
			} else {
				return false;
			}
		}
		return true;
	}

	/*
	 * Given an array of ints, return true if the array contains a 2 next to a 2
	 * or a 4 next to a 4, but not both.
	 * 
	 * either24({1, 2, 2}) → true 
	 * either24({4, 4, 1}) → true 
	 * either24({4, 4, 1, 2, 2}) → false
	 */

	public boolean either24(int[] nums) {

		boolean two = false;
		boolean fours = false;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 2 && nums[i + 1] == 2) {
				two = true;
				i++;
				continue;

			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				fours = true;
				i++;
				continue;
			}
		}
		/*
		 * Needed something nice to not explicitly tell it what to do. May be a
		 * boolean operator would help here. if (two && fours) { return false; }
		 * return two || fours;
		 */
		
		/*
		 * XOR - Exclusive OR, basically, excludes the possibility of both x and
		 * y. Arithmetically it is an addition of both then mod by 2 i.e.  (1+1)%2 = 0;
		 */
		return two ^ fours;
	}
	
	/*
	 * Given arrays nums1 and nums2 of the same length, for every element in
	 * nums1, consider the corresponding element in nums2 (at the same index).
	 * Return the count of the number of times that the two elements differ by 2
	 * or less, but are not equal.
	 * 
	 * matchUp({1, 2, 3}, {2, 3, 10}) → 2
	 * matchUp({1, 2, 3}, {2, 3, 5}) → 3
	 * matchUp({1, 2, 3}, {2, 3, 3}) → 2
	 */
	public int matchUp(int[] nums1, int[] nums2) {

		int count = 0;
		for (int i = 0; i < nums1.length; i++) {

			if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
				count++;
			}
		}

		return count;
	}
	
	/*
	 * Given an array of ints, return true if the array contains two 7's next to
	 * each other, or there are two 7's separated by one element, such as with
	 * {7, 1, 7}.
	 * 
	 * has77({1, 7, 7}) → true 
	 * has77({1, 7, 1, 7}) → true 
	 * has77({1, 7, 1, 1, 7}) → false
	 */
	public boolean has77(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			if ((nums[i] == nums[i + 1] && nums[i] == 7)
					|| (i < nums.length - 2 && (nums[i] == nums[i + 2] && nums[i] == 7))) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Given an array of ints, return true if there is a 1 in the array with a 2
	 * somewhere later in the array.
	 * 
	 * has12({1, 3, 2}) → true 
	 * has12({3, 1, 2}) → true 
	 * has12({3, 1, 4, 5, 2}) → true
	 */

	public boolean has12(int[] nums) {

		boolean found1 = false;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 2) {
				if (found1) {
					return true;
				}
			}
			if (nums[i] == 1) {
				found1 = true;
			}
		}
		return false;
	}	
	
	/*
	 * Given an array of ints, return true if the array contains either 3 even
	 * or 3 odd values all next to each other.
	 * 
	 * modThree({2, 1, 3, 5}) → true modThree({2, 1, 2, 5}) → false modThree({2,
	 * 4, 2, 5}) → true
	 */

	public boolean modThree(int[] nums) {

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				countOdd = 0;
				countEven++;
				if (countEven > 2) {
					return true;
				}
				continue;
			}
			if (nums[i] % 2 == 1) {
				countEven = 0;
				countOdd++;
				if (countOdd > 2) {
					return true;
				}
				continue;
			}
		}
		return false;
	}
	
}
