package leetcode.easy;


/**
 * @author Yyang
 * @create 2018/8/26
 * @Describe 从给定数组中算出和最大的子数组
 * Divide and Conquer
 */
public class b3MaxiumSubarray {
    public static void main(String[] args) {
        int[] nums = {1, 3, -2, 4, 5, 6, -9, -5};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        return maxSubArraySum(nums,0,len-1);
    }

    public static int maxSubArraySum(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int middle = (left + right) >> 1;

        int left_mss = maxSubArraySum(nums, left, middle);
        int right_mss = maxSubArraySum(nums, middle + 1, right);

        int leftSum = Integer.MIN_VALUE;
        int rigthSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = middle + 1; i <= right; i++) {
            sum += nums[i];
            rigthSum = Integer.max(sum, rigthSum);
        }
        sum = 0;

        for (int i = middle; i >= left; i--) {
            sum += nums[i];
            leftSum = Integer.max(sum, leftSum);
        }
        int res = Integer.max(left_mss, right_mss);
        return Integer.max(res, leftSum + rigthSum);
    }
}
