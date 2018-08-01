package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/8/1.
 * @Describe leetcode第21题 合并两个有序列表
 */
public class a7MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(5, null)));
		ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(7, null)));
		ListNode result = mergeTwoLists(l1, l2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
		if (listNode1 == null) {
			return listNode2;
		}
		if (listNode2 == null) {
			return listNode1;
		}
		if (listNode1.val < listNode2.val) {
			listNode1.next = mergeTwoLists(listNode1.next, listNode2);
			return listNode1;
		}else {
			listNode2.next = mergeTwoLists(listNode2.next, listNode1);
			return listNode2;
		}
	}
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
