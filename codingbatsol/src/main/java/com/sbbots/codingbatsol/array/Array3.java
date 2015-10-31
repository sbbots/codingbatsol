package com.sbbots.codingbatsol.array;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {

		// Instantiate the object and call the required methods.
		
		Array3 arrObj = new Array3();
		int[] arr = {5, 4, 9, 4, 9, 5};
		arr = arrObj.fix45(arr);
		System.out.println(Arrays.toString(arr));

	}

	/*
	 * Consider the leftmost and righmost appearances of some value in an array.
	 * We'll say that the "span" is the number of elements between the two
	 * inclusive. A single value has a span of 1. Returns the largest span found
	 * in the given array. (Efficiency is not a priority.)
	 * 
	 * maxSpan({1, 2, 1, 1, 3}) → 4 
	 * maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
	 * maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
	 */
	public int maxSpan(int[] nums) {

		int maxSpan = 0;
		int len = nums.length;
		int j = 0;

		for (int i = 0; i < len; i++) {

			while (j < len && nums[i] != nums[len - j - 1]) {
				j++;
			}
			maxSpan = Math.max(maxSpan, len - j - i);
			j = 0;
		}
		return maxSpan;
	}

	/*
	 * Return an array that contains exactly the same numbers as the given
	 * array, but rearranged so that every 3 is immediately followed by a 4. Do
	 * not move the 3's, but every other number may move. The array contains the
	 * same number of 3's and 4's, every 3 has a number after it that is not a 3
	 * or 4, and a 3 appears in the array before any 4.
	 * 
	 * fix34({1, 3, 1, 4}) → {1, 3, 4, 1} 
	 * fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4} 
	 * fix34({3, 2, 2, 4}) → {3, 4, 2, 2}
	 */
	public int[] fix34(int[] nums) {

		int len = nums.length;
		int j = 0;

		for (int i = 0; i < len; i++) {

			if (nums[i] == 3) {
				while (j < len && nums[len - j - 1] != 4) {
					j++;
				}
				int temp = nums[++i];
				nums[i] = nums[len - j - 1];
				nums[len - j - 1] = temp;
				j++;
			}
		}
		return nums;
	}	
	
	/*
	 * (This is a slightly harder version of the fix34 problem.) Return an array
	 * that contains exactly the same numbers as the given array, but rearranged
	 * so that every 4 is immediately followed by a 5. Do not move the 4's, but
	 * every other number may move. The array contains the same number of 4's
	 * and 5's, and every 4 has a number after it that is not a 4. In this
	 * version, 5's may appear anywhere in the original array.
	 * 
	 * fix45({5, 4, 9, 4, 9, 5}) → {9, 4, 5, 4, 5, 9} 
	 * fix45({1, 4, 1, 5}) → {1, 4, 5, 1} 
	 * fix45({1, 4, 1, 5, 5, 4, 1}) → {1, 4, 5, 1, 1, 4, 5}
	 */
	public int[] fix45(int[] nums) {

		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 4) {
				for (int j = 0; j < len; j++) {
					if (nums[j] == 5) {
						if (j > 0 && nums[j - 1] == 4) {
							continue;
						}
						int temp = nums[i + 1];
						nums[i + 1] = nums[j];
						nums[j] = temp;
						break;
					}
				}
			}
		}
		return nums;
	}

	
}
