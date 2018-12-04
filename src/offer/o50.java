package offer;

/**
 * @author Yyang
 * @create 2018/12/4
 * @Describe 二叉树的下一个结点
 */
public class o50 {
    public static void main(String[] args) {

    }

    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        while (pNode.next != null) {
            TreeLinkNode root = pNode.next;
            if (pNode == root.left) {
                return root;
            }
            pNode = root;
        }
        return null;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
