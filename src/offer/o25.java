package offer;

/**
 * @author Yyang
 * @create 2018/10/18
 * @Describe 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class o25 {
    public static void main(String[] args) {
        System.out.println(MoreThanHalfNum_Solution(new int[]{1, 2, 2, 2, 6, 7, 2, 2, 2, 9, 9}));
    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        int res = array[0];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == res) {
                count++;
            }else {
                count--;
            }
            if (count == 0) {
                res = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == res) {
                count++;
            }
        }
        return count > array.length / 2 ? res : 0;
    }
}
