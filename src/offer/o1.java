package offer;

/**
 * @author Yyang
 * @create 2018/9/17
 * @Describe 二位数组中的查找
 * 二维数组是有序的，从右上角来看，向左数字递减，向下数字递增。
 * 因此从右上角开始查找，
 *
 * 当要查找数字比右上角数字大时，下移；
 * 当要查找数字比右上角数字小时，左移；
 * 如果出了边界，则说明二维数组中不存在该整数
 */
public class o1 {
    public static void main(String[] args) {
        System.out.println(find(3, new int[][]{{0, 1, 2, 5}, {2, 3, 4, 7}, {4, 4, 4, 8}, {5, 7, 7, 9}}));
    }

    public static boolean find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int m = array[0].length - 1;
        int n = 0;
        int temp = array[n][m];

        while (target != temp) {
            if (m > 0 && n < array.length - 1) {
                if (target > temp) {
                    n++;
                } else if (target < temp) {
                    m--;
                }
                temp = array[n][m];
            }else {
                return false;
            }
        }
        return true;
    }
}
