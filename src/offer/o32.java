package offer;

/**
 * @author Yyang
 * @create 2018/10/25
 * @Describe 数组中的逆序对
 * 归并排序
 */
public class o32 {
    public static void main(String[] args) {
        System.out.println(InversePairs(new int[]{7, 5, 6, 4}));
    }

    public static int InversePairs(int[] array) {
        int len = array.length;
        if (array == null || len == 0) {
            return 0;
        }
        return mergeSort(array, 0, len - 1);
    }

    public static int mergeSort(int[] array, int start, int end) {
        if (start == end) {
            return 0;
        }
        int mid = (start + end) / 2;
        int letf_count = mergeSort(array, start, mid);
        int rigth_count = mergeSort(array, mid + 1, end);
        int i = mid;
        int j = end;
        int[] copy = new int[end - start + 1];
        int copy_index = end - start;
        int count = 0;
        while (i >= start && j >= mid + 1) {
            if (array[i] > array[j]) {
                copy[copy_index--] = array[i--];
                count += j - mid;
                if (count > 1000000007) {
                    count %= 1000000007;
                }
            }else {
                copy[copy_index--] = array[j--];
            }
        }
        while (i >= start) {
            copy[copy_index--] = array[i--];
        }
        while (j >= mid + 1) {
            copy[copy_index--] = array[j--];
        }
        i = 0;
        while (start <= end) {
            array[start++] = copy[i++];
        }
        return (letf_count + rigth_count + count) % 1000000007;
    }
}
