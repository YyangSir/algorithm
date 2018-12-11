package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yyang
 * @create 2018/12/11
 * @Describe 序列化二叉树
 */
public class o54 {
    public static void main(String[] args) {

    }

    public static String Serialize(TreeNode root) {
        if (root == null) {
            return "#,";
        }
        StringBuilder str = new StringBuilder(root.val + ",");
        str.append(Serialize(root.left));
        str.append(Serialize(root.right));
        return str.toString();
    }

    public static TreeNode Deserialize(String strt) {
        String[] res = strt.split(",");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < res.length; i++) {
            queue.offer(res[i]);
        }
        return pre(queue);
    }

    public static TreeNode pre(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = pre(queue);
        node.right = pre(queue);
        return node;
    }
}
