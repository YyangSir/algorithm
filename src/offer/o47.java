package offer;

import java.util.HashMap;

/**
 * @author Yyang
 * @create 2018/11/24
 * @Describe 字符流中第一个不重复的字符
 */
public class o47 {
    static HashMap<Character, Integer> map = new HashMap<>();
    static StringBuilder s = new StringBuilder();
    public static void main(String[] args) {
        String str = "google";
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(FirstAppearingOnce());
    }

    public static char FirstAppearingOnce() {
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return '#';
    }
}
