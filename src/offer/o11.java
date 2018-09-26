package offer;


/**
 * @author Yyang
 * @create 2018/9/25
 * @Describe 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class o11 {
    public static void main(String[] args) {
        ListNode head = create(6);
        head = FindKthToTail(head, 2);
        while (head != null) {
            System.out.print(head.value+" ");
            head = head.next;
        }
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode temp = head;
        for (int i = 0; i < k - 1; i++) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                return null;
            }
        }
        ListNode pa = head;
        ListNode pb = head;
        for (int i = 0; i < k - 1; i++) {
            pa = pa.next;
        }
        while (pa.next != null) {
            pa = pa.next;
            pb = pb.next;
        }
        return pb;
    }

    public static ListNode create(int n) {
        if (n == 1) {
            return new ListNode(1);
        }
        ListNode head = new ListNode(n);
        head.next = create(n - 1);
        return head;
    }
    public static class ListNode {
        public int value;
        public ListNode next;


        public ListNode(int value) {
            this.value = value;
        }
    }
}

