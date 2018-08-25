package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/8/25.
 * @Describe 给出一个排序数组和一个数target 返回target应该插入数组的位置下标index
 */
public class b2SearchInsertPostition {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 5, 6, 7, 9};
		System.out.println(searchInsert(nums, 6));
	}

	public static int searchInsert(int[] nums,int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) >> 1;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return low;
	}
}
