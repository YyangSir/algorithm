package offer;

/**
 * @author Yyang
 * @create 2018/12/5
 * @Describe 对称的二叉树
 */
public class o51 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    public static boolean isSymmetrical(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if (left.val == right.val) {
            return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
        }
        return false;
    }
}
