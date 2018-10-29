package offer;

/**
 * @author Yyang
 * @create 2018/10/29
 * @Describe 把字符串转换成整数
 * 遍历字符串中的每个字符 当前字符减去’0’得到当前的数字
 */
public class o42 {
    public static void main(String[] args) {
        System.out.println(StrToInt("534"));
    }

    public static int StrToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int flag = 1;
        if (s.charAt(0) == '-') {
            flag = -1;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return 0;
            }
            res = res * 10 + (s.charAt(i) - '0');
        }
        return flag * res;
    }
}
