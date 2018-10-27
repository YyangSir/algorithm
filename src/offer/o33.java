package offer;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 两个链表的第一个公共结点
 */
public class o33 {
    public static void main(String[] args) {

    }

    public static ListNode FindFirstCommonNode(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null || listNode2 == null) {
            return null;
        }
        int count1 = 1;
        int count2 = 1;

        ListNode p1 = listNode1;
        ListNode p2 = listNode2;

        while (p1.next != null) {
            p1 = p1.next;
            count1++;
        }
        while (p2.next != null) {
            p2 = p2.next;
            count2++;
        }
        if (count1 > count2) {
            int dif = count1 - count2;
            while (dif != 0) {
                p1 = p1.next;
                dif--;
            }
        }else {
            int dif = count2 - count1;
            while (dif != 0) {
                p2 = p2.next;
                dif--;
            }
        }

        while (listNode1 != null && listNode2 != null) {
            if (listNode1 == listNode2) {
                return listNode1;
            }
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        return null;
    }
}
