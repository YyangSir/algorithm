package offer;

/**
 * @author Yyang
 * @create 2018/9/26
 * @Describe 反转链表
 * 输入一个链表，反转链表后，输出新链表的表头
 */
public class o12 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = ReverseList(head);
        while (result != null) {
            System.out.print(result.val+" ");
            result = result.next;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
