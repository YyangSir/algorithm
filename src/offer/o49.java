package offer;

/**
 * @author Yyang
 * @create 2018/12/3
 * @Describe 删除链表中重复的结点
 */
public class o49 {
    public static void main(String[] args) {

    }

    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode head = new ListNode(-1);
        head.next = pHead;

        ListNode frist = pHead;
        ListNode second = frist.next;
        while (second != null) {
            if (second.next != null && second.val == second.next.val) {
                while (second.next != null && second.val == second.next.val) {
                    second = second.next;
                }
                frist.next = second.next;
            }else {
                frist = frist.next;
            }
            second = second.next;
        }
        return head.next;
    }
}
