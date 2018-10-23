package offer;

/**
 * @author Yyang
 * @create 2018/10/23
 * @Describe 整数中1出现的次数
 * 将数字转成字符串，直接判断
 */
public class o28 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            s.append(i);
        }
        String s1 = s.toString();
        for (int i = 0; i < s1.length(); i++) {
            if ('1' == s1.charAt(i)) {
                res++;
            }
        }
        return res;
    }
}
