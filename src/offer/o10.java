package offer;

/**
 * @author Yyang
 * @create 2018/9/24
 * @Describe 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class o10 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7};
        reOrderArray(A);
        for (int a : A) {
            System.out.print(a + " ");
        }
    }

    public static void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                //array[j]为偶数 array[j+1]为奇数
                if ((array[j] & 0x1) == 0 && (array[j + 1] & 0x1) != 0) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
