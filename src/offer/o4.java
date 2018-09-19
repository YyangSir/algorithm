package offer;

/**
 * @author Yyang
 * @create 2018/9/18
 * @Describe 重建二叉树
 * 根据前序和中序序列（不含有重复的数字），构建一棵二叉树
 * 前序遍历的第一个数是树的根节点 这个数把中序遍历的数组分成左右两颗子树
 * 以此类推
 */
public class o4 {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reConstructBinaryTree(pre, in);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        return ConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public static TreeNode ConstructBinaryTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe || is > ie) {
            return null;
        }
        // 取前序遍历的第一个数字，就是当前的根结点
        int value = preorder[ps];
        int index = is;
        while (index <= ie && inorder[index] != value) {
            index++;
        }
        if (index > ie) {
            throw new RuntimeException("invalid input");
        }
        TreeNode node = new TreeNode(value);
        node.left = ConstructBinaryTree(preorder, ps + 1, ps + index - is
                , inorder, is, index - 1);
        node.right = ConstructBinaryTree(preorder, ps + index - is + 1, pe,
                inorder, index + 1, ie);
        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
