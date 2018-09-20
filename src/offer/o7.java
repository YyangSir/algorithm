package offer;

/**
 * @author Yyang
 * @create 2018/9/20
 * @Describe 斐波那契数列
 * 动态规划解决
 */
public class o7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Fibonacci(i));
        }
    }

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = 0;
        int fn2 = 1;

        for (int i = 2; i <= n; i++) {
            fn2 = fn2 + fn1;
            fn1 = fn2 - fn1;
        }
        return fn2;
    }
}
