package offer;

import java.util.ArrayList;

/**
 * @author Yyang
 * @create 2018/10/13
 * @Describe 二叉树中和为某一值的路径
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class o21 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        ArrayList<ArrayList<Integer>> list = FindPath(root, 8);
        list.forEach(l -> l.forEach(System.out::print));
        System.out.println();
    }

    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> temp = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return res;
        }
        target -= root.val;
        temp.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(temp));
        }else {
            FindPath(root.left, target);
            FindPath(root.right, target);
        }
        temp.remove(temp.size() - 1);
        return res;
    }
}
