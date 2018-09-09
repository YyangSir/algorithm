package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/8/27
 * @Describe
 */
public class b4CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        String s = "1";
        if (n == 1) {
            return s;
        }
        int i = 1;
        while (i < n) {
            char[] chars = s.toCharArray();
            int num = 1;
            String a = "";
            for (int j = 0; j < chars.length; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                if (j + 1 < chars.length && chars[j] == chars[j + 1]) {
                    num ++;
                }else {
                    stringBuilder.append(num + String.valueOf(chars[j]));
                    num = 1;
                }
                a += stringBuilder.toString();
                s = a;
            }
            i++;

        }
        return s;
    }

}
