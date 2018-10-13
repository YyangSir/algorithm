package offer;

/**
 * @author Yyang
 * @create 2018/9/27
 * @Describe 树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构
 * 递归思想，如果根节点相同则递归调用IsSubtree()，
 * 如果根节点不相同，则判断root1的左子树和roo2是否相同，再判断右子树和root2是否相同;
 * 注意节点为空的条件，HasSubTree中，只要有树为空就返回false;
 * IsSubtree中，要先判断root2，如果root2为空，则说明第二棵树遍历完了，即匹配成功。
 */
public class o14 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(HasSubtree(root,root2));
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        return IsSubtree(root1, root2) ||
                HasSubtree(root1.left, root2) ||
                HasSubtree(root1.right, root2);
    }

    public static boolean IsSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return IsSubtree(root1.left, root2.left) &&
                    IsSubtree(root1.right, root2.right);
        }else {
            return false;
        }
    }

}
