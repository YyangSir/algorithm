package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/8/2.
 * @Describe 移除有序数组中的重复项 返回数组长度
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 */
public class a8RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 5, 5, 6, 7, 9};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}
}
