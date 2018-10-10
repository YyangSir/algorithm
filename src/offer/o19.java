package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yyang
 * @create 2018/10/10
 * @Describe 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 *
 * 使用两个队列一个存放节点，一个存放值。先将根节点加入到队列中，然后遍历队列中的元素，
 * 遍历过程中，访问该元素的左右节点，再将左右子节点加入到队列中来。
 * 注意Queue创建的方式：Queue<TreeNode> queue = new LinkedList<TreeNode>();
 * 用add将元素添加到队列中，用remove来移除并返回队首元素
 */
public class o19 {
    public static void printTree(TreeNode root) {
        List<Integer> list = PrintFromTopToBottom(root);
        list.forEach(System.out::print);
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            root = queue.remove();
            res.add(root.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
        return res;
    }
}
