package offer;

/**
 * @author Yyang
 * @create 2018/10/22
 * @Describe 连续子数组的最大和
 *
 */
public class o27 {
    public static void main(String[] args) {
        System.out.println(FindGreatestSumOfSubArray(new int[]{1, 2, 43, -5, 6, 7 - 2, -9, -4, 6, 7}));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int cur = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            cur = cur > 0 ? cur + array[i] : array[i];
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}
