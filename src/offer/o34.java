package offer;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 数字在排序数组中出现的次数
 * 查找 k+0.5和 k-0.5的位置相减
 */
public class o34 {
    public static void main(String[] args) {
        System.out.println(GetNumberOfK(new int[]{1, 2, 4, 5, 5, 5, 5, 6, 7}, 5));
    }

    public static int GetNumberOfK(int[] array, int k) {
        return biSearch(array, k + 0.5) - biSearch(array, k - 0.5);
    }

    public static int biSearch(int[] array, double k) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
