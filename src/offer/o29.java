package offer;

import java.util.Arrays;

/**
 * @author Yyang
 * @create 2018/10/23
 * @Describe 把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 */
public class o29 {
    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3, 32, 321}));
    }

    public static String PrintMinNumber(int[] numbers) {
        int len = numbers.length;
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return String.valueOf(numbers[0]);
        }
        StringBuilder res = new StringBuilder();
        String[] str = new String[len];
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (o1, o2) -> {
            String c1 = o1 + o2;
            String c2 = o2 + o1;
            return c1.compareTo(c2);
        });
        for (int i = 0; i < len; i++) {
            res.append(str[i]);
        }
        return res.toString();
    }
}
