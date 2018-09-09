package bat.list;

/**
 * @author Yyang
 * @create 2018/9/5
 * @Describe 在 O(1) 时间删除链表节点
 */
public class deleteNode {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.next = node1;
        node1.next = node2;
        ListNode result = deleteNode(node, node1);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static ListNode deleteNode(ListNode head, ListNode toBeDelete) {
        // 如果输入参数有空值就返回表头结点
        if (head == null || toBeDelete == null) {
            return head;
        }
        // 如果删除的是头结点，直接返回头结点的下一个结点
        if (head == toBeDelete) {
            return head.next;
        }
        // 下面的情况链表至少有两个结点
        // 在多个节点的情况下，如果删除的是最后一个元素
        if (toBeDelete.next == null) {
            // 找待删除元素的前驱
            ListNode tmp = head;
            while (tmp.next != toBeDelete) {
                tmp = tmp.next;
            }
            // 删除待结点
            tmp.next = null;
        }else {
            // 将下一个结点的值输入当前待删除的结点
            toBeDelete.value = toBeDelete.next.value;
            // 待删除的结点的下一个指向原先待删除引号的下下个结点，即将待删除的下一个结点删除
            toBeDelete.next = toBeDelete.next.next;

        }
        // 返回删除节点后的链表头结点
        return head;

    }
}
