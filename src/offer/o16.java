package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yyang
 * @create 2018/9/28
 * @Describe 顺时针打印矩阵
 * 先得到矩阵的行和列数，然后依次旋转打印数据，
 * 一次旋转打印结束后，往对角分别前进和后退一个单位。
 * 要注意单行和单列的情况
 */
public class o16 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        List<Integer> list = printMatrix(matrix);
        list.forEach(System.out::print);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 && col == 0) {
            return res;
        }
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;
        while (left <= right && top <= bottom) {
            //上：从左到右
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            //右：从上到下
            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            //下：从右到左
            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            //左：从下到上
            if (left != right) {
                //防止单列情况
                for (int i = bottom - 1; i > top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
