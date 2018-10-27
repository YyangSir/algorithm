package offer;

/**
 * @author Yyang
 * @create 2018/10/27
 * @Describe 二叉树的深度
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class o35 {
    public static void main(String[] args) {

    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left) + 1;
        int right = TreeDepth(root.right) + 1;
        return left > right ? left : right;
    }
}
