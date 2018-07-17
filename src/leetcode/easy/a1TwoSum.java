package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yyang
 * @create 2018/7/17.
 * @Describe leetcode 简单第一题
 * 给出一个数组 找出和为targets的两个数
 */
public class a1TwoSum {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 2, 4, 6, 7, 8, 9};
		int target = 5;
		try {
			int[] result = twoSum(nums, target);
			System.out.println(result[0]+" "+result[1]);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
		Map<Integer, Integer> map = new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[]{i, map.get(complement)};
			}
		}
		throw new IllegalAccessException("no two sum solution");
	}
}
