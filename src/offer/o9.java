package offer;

/**
 * @author Yyang
 * @create 2018/9/24
 * @Describe 整数的 n 次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 指数为负时，可以先对指数求绝对值，算出次方的结果后再取倒数
 * 当底数为0，指数为负时，会出现对0求倒数情况，要特殊处理
 * 0的0次方在数学上没有意义，因此无论输出0还是1都是可以接受的
 * 在计算次方的时候，除了简单的遍历，我们可以使用递归的思想，如下公式，来减少计算量
 * 偶数a^n=a^(n/2)*a^(n/2)
 * 奇数a^n=^(n/2)*a^(n/2)*a
 */
public class o9 {
    public static void main(String[] args) {
        System.out.println(PowerUnsignedExponent(0.2, 3));
    }

    public static double PowerUnsignedExponent(double base, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        //右移除2
        double res = PowerUnsignedExponent(base, n >> 1);
        res *= res;
        //判断奇数偶数
        if ((n & 0x1) == 1) {
            res *= base;
        }
        return res;
    }
}
