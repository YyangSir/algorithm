package offer;

/**
 * @author Yyang
 * @create 2018/10/31
 * @Describe 正则表达式匹配
 */
public class o45 {
    public static void main(String[] args) {

    }

    public static boolean match(char[] str, char[] patten) {
        int sindex = 0;
        int pindex = 0;
        return matchCore(str, sindex, pindex, patten);
    }

    private static boolean matchCore(char[] str, int sindex, int pindex, char[] patten) {
        if (sindex >= str.length && pindex == patten.length) {
            return true;
        }
        if (pindex >= patten.length && sindex < str.length) {
            return false;
        }
        if (pindex + 1 < patten.length && patten[pindex + 1] == '*') {
            if (sindex < str.length && str[sindex] == patten[pindex] || patten[pindex] == '.') {
                return matchCore(str, sindex, pindex + 2, patten) ||
                        matchCore(str, sindex + 1, pindex + 2, patten) ||
                        matchCore(str, sindex + 1, pindex, patten);
            }else {
                return matchCore(str, sindex, pindex + 2, patten);
            }
        }
        if (sindex < str.length && (str[sindex] == patten[pindex] || patten[pindex] == '.')) {
            return matchCore(str, sindex + 1, pindex + 1, patten);
        }
        return false;
    }
}
