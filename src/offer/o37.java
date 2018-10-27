package offer;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 翻转单词顺序列/左旋转字符串
 */
public class o37 {
    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }

    public static String ReverseSentence(String s) {
        if (s.trim().length() == 0) {
            return s;
        }
        String[] temp = s.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i];
            if (i != 0) {
                res += " ";
            }
        }
        return res;
    }

    public static String LeftRotateString(String s, int n) {
        int len = s.length();
        if (len == 0) {
            return "";
        }
        n = n % len;
        String s1 = s.substring(n, len);
        String s2 = s.substring(0, n);
        return s1 + s2;
    }
}
