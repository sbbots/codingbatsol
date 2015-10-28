package com.sbbots.codingbatsol.array2;

import java.util.Arrays;

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
	
	/*
	 * Given an array of ints, return true if the value 3 appears in the array
	 * exactly 3 times, and no 3's are next to each other.
	 * 
	 * haveThree({3, 1, 3, 1, 3}) → true 
	 * haveThree({3, 1, 3, 3}) → false
	 * haveThree({3, 4, 3, 3, 4}) → false
	 */
	public boolean haveThree(int[] nums) {

		int count = 0;
		boolean found3 = false;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 3 && !found3) {
				found3 = true;
				count++;
				continue;
			} else {
				found3 = false;
			}

			if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) {
				return false;
			}
		}
		return (count == 3);
	}
	
	/*
	 * Given an array of ints, return true if every 2 that appears in the array
	 * is next to another 2./*
	 * 
	 * twoTwo({4, 2, 2, 3}) → true 
	 * twoTwo({2, 2, 4}) → true 
	 * twoTwo({2, 2, 4, 2}) → false
	 */

	public boolean twoTwo(int[] nums) {

		int len = nums.length;
		int count = 0;

		int i = 0;
		while (i < len) {

			if (nums[i] == 2) {
				if (((i > 0 && nums[i - 1] == 2) || ((i < len - 1) && nums[i + 1] == 2))) {
					i++;
					continue;
				} else {
					return false;
				}
			}
			i++;
		}
		return true;
	}
	
	/*
	 * Return true if the group of N numbers at the start and end of the array
	 * are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are
	 * the same for n=0 and n=2, and false for n=1 and n=3. You may assume that
	 * n is in the range 0..nums.length inclusive.
	 * 
	 * sameEnds({5, 6, 45, 99, 13, 5, 6}, 1) → false 
	 * sameEnds({5, 6, 45, 99, 13, 5, 6}, 2) → true 
	 * sameEnds({5, 6, 45, 99, 13, 5, 6}, 3) → false
	 */	
	public boolean sameEnds(int[] nums, int len) {

		int length = nums.length;
		int i = 0;

		if (len < 1) {
			return true;
		}
		while (i < len && i < length) {
			if (nums[i] == nums[length - len + i]) {
				i++;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Return true if the array contains, somewhere, three increasing adjacent
	 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
	 * 
	 * tripleUp({1, 4, 5, 6, 2}) → true 
	 * tripleUp({1, 2, 3}) → true 
	 * tripleUp({1, 2, 4}) → false
	 */
	public boolean tripleUp(int[] nums) {

		int counter = 0;
		int i = 0;
		while (i < nums.length - 1) {

			if (nums[i + 1] == nums[i] + 1) {
				counter++;
				if (counter == 2) {
					return true;
				}

			} else {
				counter = 0;
			}
			i++;
		}

		return false;
	}
	
	/*
	 * Given start and end numbers, return a new array containing the sequence
	 * of integers from start up to but not including end, so start=5 and end=10
	 * yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
	 * start number. Note that a length-0 array is valid. (See also: FizzBuzz
	 * Code)
	 * 
	 * fizzArray3(5, 10) → {5, 6, 7, 8, 9} 
	 * fizzArray3(11, 18) → {11, 12, 13, 14, 15, 16, 17} 
	 * fizzArray3(1, 3) → {1, 2}
	 */
	public int[] fizzArray3(int start, int end) {

		int[] arr = new int[end - start];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + start;
		}
		return arr;
	}
	
	/*
	 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns
	 * {2, 5, 3, 6}. You may modify and return the given array, or return a new
	 * array.
	 * 
	 * shiftLeft({6, 2, 5, 3}) → {2, 5, 3, 6} 
	 * shiftLeft({1, 2}) → {2, 1}
	 * shiftLeft({1}) → {1}
	 */
	public int[] shiftLeft(int[] nums) {

		int[] arr = new int[nums.length];

		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = nums[i];
		}
		if (arr.length > 0) {
			arr[nums.length - 1] = nums[0];
		}
		return arr;
	}
	
	/*
	 * For each multiple of 10 in the given array, change all the values
	 * following it to be that multiple of 10, until encountering another
	 * multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
	 * 
	 * tenRun({2, 10, 3, 4, 20, 5}) → {2, 10, 10, 10, 20, 20} 
	 * tenRun({10, 1, 20, 2}) → {10, 10, 20, 20} 
	 * tenRun({10, 1, 9, 20}) → {10, 10, 10, 20}
	 */
	public int[] tenRun(int[] nums) {

		int len = nums.length;
		int multiple = 10;

		for (int i = 0; i < len; i++) {

			if (nums[i] % 10 == 0) {
				multiple = nums[i];
				i++;
				while (i < len && nums[i] % 10 != 0) {

					nums[i] = multiple;
					i++;
				}
				i--;
			}
		}
		return nums;
	}
	
	/*
	 * Given a non-empty array of ints, return a new array containing the
	 * elements from the original array that come before the first 4 in the
	 * original array. The original array will contain at least one 4. Note that
	 * it is valid in java to create an array of length 0.
	 * 
	 * pre4({1, 2, 4, 1}) → {1, 2} 
	 * pre4({3, 1, 4}) → {3, 1} 
	 * pre4({1, 4, 4}) → {1}
	 */
	public int[] pre4(int[] nums) {
		int i = 0;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				break;
			}
		}
		nums = Arrays.copyOf(nums, i);
		return nums;
	}
	
	
	/*
	 * Given a non-empty array of ints, return a new array containing the
	 * elements from the original array that come after the last 4 in the
	 * original array. The original array will contain at least one 4. Note that
	 * it is valid in java to create an array of length 0.
	 * 
	 * post4({2, 4, 1, 2}) → {1, 2} 
	 * post4({4, 1, 4, 2}) → {2} 
	 * post4({4, 4, 1, 2, 3}) → {1, 2, 3}
	 */
	public int[] post4(int[] nums) {

		int i = 0;
		int len = nums.length;
		for (i = len - 1; i > -1; i--) {
			if (nums[i] == 4) {
				break;
			}
		}
		
		int[] arr = new int[len - i - 1];
		for (int j = 0; j < arr.length && (i + j + 1) < nums.length; j++) {

			arr[j] = nums[i + j + 1];
		}
		/*
		 * OR
		 * nums = Arrays.copyOfRange(nums,i+1, len);
		 * return nums;
		 */
		
		return arr;
	}

	/*
	 * We'll say that an element in an array is "alone" if there are values
	 * before and after it, and those values are different from it. Return a
	 * version of the given array where every instance of the given value which
	 * is alone is replaced by whichever value to its left or right is larger.
	 * 
	 * notAlone({1, 2, 3}, 2) → {1, 3, 3} 
	 * notAlone({1, 2, 3, 2, 5, 2}, 2) → {1, 3, 3, 5, 5, 2} 
	 * notAlone({3, 4}, 3) → {3, 4}
	 */
	public int[] notAlone(int[] nums, int val) {

		int i = 0;
		int len = nums.length;
		for (i = 0; i < len; i++) {

			if ((i > 0 && i < len - 1)
					&& (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val)) {
				nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
			}
		}

		return nums;
	}

}
