package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/8/5.
 * @Describe 移除值为val的元素 返回数组长度
 * 时间复杂度 O(n)
 * 空间复杂度 O(1)
 */
public class a9RemoveElement {
	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 5, 6, 7, 5, 6, 7};
		int val = 6;
		System.out.println(removeElemnet(nums, val));
	}

	public static int removeElemnet(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;

	}
}
