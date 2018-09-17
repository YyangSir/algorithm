package offer;

/**
 * @author Yyang
 * @create 2018/9/17
 * @Describe 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 从后往前遍历
 */
public class o2 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
    }

    public static String replaceSpace(String str) {
        StringBuilder res = new StringBuilder();
        int len = str.length() - 1;
        for (int i = len; i >=0; i--) {
            if (str.charAt(i) == ' ') {
                res.append("02%");
            }else {
                res.append(str.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}
