package offer;

/**
 * @author Yyang
 * @create 2018/10/14
 * @Describe 复制复杂链表
 */
public class o22 {
    public static void main(String[] args) {

    }

    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //复制节点 A->B->C 变成 A->A'->B->B'->C->C'
        RandomListNode head = pHead;
        while (head != null) {
            RandomListNode node = new RandomListNode(head.label);
            node.next = head.next;
            head.next = node;
            head = node.next;
        }
        //复制random
        head = pHead;
        while (head != null) {
            head.next.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }
        //拆分
        head = pHead;
        RandomListNode chead = head.next;
        while (head != null) {
            RandomListNode node = head.next;
            head.next = node.next;
            node.next = node.next == null ? null : node.next.next;
            head = head.next;
        }
        return chead;
    }
}
