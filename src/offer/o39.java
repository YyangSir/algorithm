package offer;

import java.util.LinkedList;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 孩子们围成的圈
 * 环形链表 %link.size()
 */
public class o39 {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(10, 3));
    }
    public static int LastRemaining_Solution(int n, int m) {
        if (n < 1 | m < 1) {
            return -1;
        }
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            link.add(i);
        }
        int index = -1;
        while (link.size() > 1) {
            index = (index + m) % link.size();
            link.remove(index);
            index--;
        }
        return link.get(0);
    }
}
