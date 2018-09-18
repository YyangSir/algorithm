package offer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Yyang
 * @create 2018/9/17
 * @Describe 从头到尾打印链表
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class o3 {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.next = node1;
        node1.next = node2;
        printListFromTailToHead(node).forEach(System.out::println);
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        ListNode head = listNode;
        ListNode cur = listNode.next;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = head;
            head = cur;
            cur = temp;
        }
        listNode.next = null;
        ArrayList<Integer> res = new ArrayList<>();
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        return res;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
