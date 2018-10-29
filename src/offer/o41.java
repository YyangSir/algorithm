package offer;

/**
 * @author Yyang
 * @create 2018/10/29
 * @Describe 不用加减乘除做加法
 */
public class o41 {
    public static void main(String[] args) {
        System.out.println(add(5, 3));
    }

    public static int add(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        int sum;
        int carry = 0;

        while (num2 != 0) {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
