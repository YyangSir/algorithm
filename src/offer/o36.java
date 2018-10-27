package offer;

import java.util.ArrayList;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 和为S的两个数字/和为S的连续正数序列
 * 左右夹逼
 * 滑动窗口
 * 滑动窗口的方法：用两个数字 start 和 end 分别表示序列的最小值和最大值，首先将 start 初始化为1，end 初始化为2。
 * 如果从start到end的和大于sum，我们就从序列中去掉较小的值(即增大start),
 * 相反，只需要增大end。
 * 终止条件为：一直增加begin到(1+sum)/2并且end小于sum为止
 */
public class o36 {
    public static void main(String[] args) {
        System.out.println(FindNumbersWithSum(new int[]{2, 3, 4, 5, 7}, 8));
        System.out.println(FindContinuousSequence(100));

    }

    public static ArrayList FindNumbersWithSum(int[] array, int sum) {
        //左右夹逼
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) {
            return res;
        }
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            if (array[i] + array[j] == sum) {
                res.add(array[i]);
                res.add(array[j]);
                break;
            } else if (array[i] + array[j] < sum) {
                i++;
            }else {
                j--;
            }
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        if (sum < 3) {
            return res;
        }
        int start = 1;
        int end = 2;
        int mid = (1 + sum) / 2;

        while (start < mid) {
            int s = totalSum(start, end);
            if (s == sum) {
                res.add(getSequence(start, end));
                end++;
            } else if (s < sum) {
                end++;
            }else {
                start++;
            }
        }
        return res;
    }

    private static ArrayList<Integer> getSequence(int start, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = start; i < end; i++) {
            temp.add(i);
        }
        return temp;
    }

    private static int totalSum(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }
}
