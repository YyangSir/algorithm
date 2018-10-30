package offer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yyang
 * @create 2018/10/30
 * @Describe 构建乘积数组
 */
public class o44 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 5};
        int[] b = multiply(a);
        List<Integer> list = Arrays.stream(b)
                //自动包装
                .boxed()
                //转为集合类
                .collect(Collectors.toList());
        list.forEach(System.out::println);

    }

    public static int[] multiply(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int[] b = new int[a.length];
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        int temp = 1;
        for (int j = a.length - 2; j >= 0; j--) {
            temp *= a[j + 1];
            b[j] *= temp;
        }
        return b;
    }
}
