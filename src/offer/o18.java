package offer;

import java.util.Stack;

/**
 * @author Yyang
 * @create 2018/10/9
 * @Describe 栈的压入弹出序列
 */
public class o18 {
    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        System.out.println(IsPopOrder(pushA, popA));
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length != popA.length || pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.empty();
    }
}
