package offer;

/**
 * @author Yyang
 * @create 2018/9/28
 * @Describe 二叉树的镜像
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class o15 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        Mirror(root);
        //todo 从上向下打印二叉树
        o19.printTree(root);
    }

    public static void Mirror(TreeNode root) {
        if (root == null) {
            //当前节点为空，直接返回
            return;
        }
        if (root.left == null || root.right == null) {
            //当前节点没有叶子节点，直接返回
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //递归交换叶子节点
        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }
}
