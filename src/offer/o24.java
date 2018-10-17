package offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yyang
 * @create 2018/10/17
 * @Describe 字符串的排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列
 */
public class o24 {
    public static void main(String[] args) {
        Permutation("abc");
        res.forEach(s -> {
            System.out.print(s);
            System.out.println();
        });
    }

    static ArrayList<String> res = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        if (str == null) {
            return res;
        }
        PermutationHelper(str.toCharArray(), 0);
        Collections.sort(res);
        return res;
    }

    public static void PermutationHelper(char[] str, int i) {
        if (i == str.length - 1) {
            res.add(String.valueOf(str));
        }else {
            for (int j = i; j < str.length; j++) {
                if (j != i && str[i] == str[j]) {
                    continue;
                }
                swap(str, i, j);
                PermutationHelper(str, i + 1);
                swap(str, i, j);
            }
        }
    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
