package offer;

import java.util.Arrays;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 扑克牌顺子
 */
public class o38 {
    public static void main(String[] args) {
        System.out.println(isContinuous(new int[]{0, 4, 5, 6, 8,}));
    }

    public static boolean isContinuous(int[] numbers) {
        int zero = 0;
        int dis = 0;
        if (numbers.length != 5) {
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < 4; i++) {
            if (numbers[i] == 0) {
                zero++;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }
            if (numbers[i + 1] - numbers[i] > 1) {
                dis += numbers[i + 1] - numbers[i] - 1;
            }
        }
        if (zero >= dis) {
            return true;
        }else {
            return false;
        }
    }
}
