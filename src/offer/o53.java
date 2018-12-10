package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yyang
 * @create 2018/12/10
 * @Describe 把二叉树打印成多行
 */
public class o53 {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode treeNode) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();

        if (treeNode == null) {
            return res;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        int start = 0, end = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            temp.add(node.val);
            start++;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (start == end) {
                start = 0;
                res.add(temp);
                temp = new ArrayList<>();
                end = queue.size();
            }
        }
        return res;
    }
}
