package offer;

/**
 * @author Yyang
 * @create 2018/12/13
 * @Describe 二叉搜索树的第k个结点
 */
public class o55 {
    public static void main(String[] args) {

    }

    static int index = 0;
    public static TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot != null) {
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null) {
                return node;
            }
            index++;
            if (index == k) {
                return pRoot;
            }
            node = KthNode(pRoot.right, k);
            if (node != null) {
                return node;
            }
        }
        return null;
    }
}
