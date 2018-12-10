package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Yyang
 * @create 2018/12/5
 * @Describe 按之字形顺序打印二叉树
 */
public class o52 {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        int flag = 1;
        if (pRoot == null) {
            return res;
        }
        s2.push(pRoot);
        ArrayList<Integer> temp = new ArrayList<>();
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (flag % 2 != 0) {
                while (!s2.isEmpty()) {
                    TreeNode node = s2.pop();
                    temp.add(node.val);
                    if (node.left != null) {
                        s1.push(node.left);
                    }
                    if (node.right != null) {
                        s1.push(node.right);
                    }
                }
            }
            if (flag % 2 == 0) {
                while (!s1.isEmpty()) {
                    TreeNode node = s1.pop();
                    temp.add(node.val);
                    if (node.right != null) {
                        s2.push(node.right);
                    }
                    if (node.left!=null){
                        s2.push(node.left);
                    }
                }
            }
            res.add(new ArrayList<>(temp));
            temp.clear();
            flag++;
        }
        return res;
    }
}
