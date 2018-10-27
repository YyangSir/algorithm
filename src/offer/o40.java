package offer;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 求1+2+3+…+n
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * 递归和短路代替
 */
public class o40 {
    public static void main(String[] args) {
        System.out.println(Sum_Solution(100));
    }

    public static int Sum_Solution(int n) {
        int sum = n;
        boolean t=(n > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }
}
