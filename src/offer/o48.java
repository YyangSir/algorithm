package offer;

/**
 * @author Yyang
 * @create 2018/12/2
 * @Describe 链表中环的入口结点
 */
public class o48 {
    public static void main(String[] args) {

    }

    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead.next == null || pHead.next.next == null) {
            return null;
        }
        ListNode slow = pHead.next;
        ListNode fast = pHead.next.next;
        while (fast != null) {
            if (fast == slow) {
                fast = pHead;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return null;
    }
}
