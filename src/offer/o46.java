package offer;

/**
 * @author Yyang
 * @create 2018/11/4
 * @Describe 表示数值的字符串
 */
public class o46 {
    public static void main(String[] args) {
        System.out.println(isNumeric(new char[]{'2', 'e', '5'}));
    }

    public static boolean isNumeric(char[] str) {
        int len = str.length;
        boolean sign = false;
        boolean decimal = false;
        boolean hasE = false;
        for (int i = 0; i < len; i++) {
            if (str[i] == '+' || str[i] == '-') {
                if (!sign && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
                if (sign && str[i - 1] != 'e' || str[i - 1] != 'E') {
                    return false;
                }
                sign = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (i == len - 1) {
                    return false;
                }
                if (hasE) {
                    return false;
                }
                hasE = true;
            } else if (str[i] == '.') {
                if (hasE || decimal) {
                    return false;
                }
                decimal = true;
            } else if (str[i] < '0' || str[i] > '9') {
                return false;
            }

        }
        return true;
    }
}
