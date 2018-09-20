package offer;

/**
 * @author Yyang
 * @create 2018/9/20
 * @Describe 旋转数组中最小的数字
 * 二分法查找
 * array[mid] > array[high]: 最小值在 mid 右边->low=mid+1
 * array[mid] == array[high]:最小值不确定 -> high=high+1
 * array[mid] < array[high]: 最小是是 mid 或在 mid 左边->high=mid
 */
public class o6 {
    public static void main(String[] args) {
        System.out.println(minNumberInRotateArray(new int[]{5, 6, 7, 8, 9, 1, 2, 4}));
    }

    public static int minNumberInRotateArray(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
            } else if (array[mid] == array[high]) {
                high = high - 1;
            }else {
                high = mid;
            }

        }
        return array[low];
    }
}
