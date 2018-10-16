package offer;

/**
 * @author Yyang
 * @create 2018/10/16
 * @Describe 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 *
 * 在二叉搜索树中，左子结点的值总是小于父结点的值，右子节点的值总是大于父结点的值。
 * 中序遍历
 * 每次遍历节点的左孩子、右孩子，把左孩子指向转换链表的尾节点，并把末尾指针的右孩子指向自己。
 * 右孩子指向节点的右孩子。如果没有右孩子就返回。
 */
public class o23 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);

        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(16);

        TreeNode result = Convert(root);
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" ");
            result = result.right;
        }
    }

    static TreeNode head = null;
    static TreeNode end = null;
    public static TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }

    public static void ConvertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        Convert(pRootOfTree.left);
        if (end == null) {
            head = pRootOfTree;
            end = pRootOfTree;
        }else {
            end.right = pRootOfTree;
            pRootOfTree.left = end;
            end = pRootOfTree;
        }
        Convert(pRootOfTree.right);
    }
}
