package offer;

/**
 * @author Yyang
 * @create 2018/10/13
 * @Describe 二叉搜索树的后序遍历序列
 * 二叉搜索树: 左子树<根<=右子树
 * 对于后序遍历来说，序列数组的最后一个元素一定是根节点,
 * 根据这个元素，将前面的数组分为左、右两个部分，左侧部分都比该元素小，
 * 右侧部分都比该元素大，如果右侧部分有比该根节点小的元素，那么就不是后序遍历，如此递归进行。
 */
public class o20 {
    public static void main(String[] args) {
        int[] sequence = new int[]{1, 2, 3, 5, 6, 4};
        System.out.println(VerifySquenceOfBST(sequence));
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        }
        return judge(sequence, 0, sequence.length - 1);
    }

    public static boolean judge(int[] sequence, int start, int root) {
        if (start > root) {
            return true;
        }
        int i = start;
        while (i < root && sequence[i] < sequence[root]) {
            i++;
        }
        for (int j = i; j < root; j++) {
            if (sequence[j] < sequence[root]) {
                return false;
            }
        }
        return (judge(sequence, start, i - 1)) && (judge(sequence, i, root - 1));
    }
}
