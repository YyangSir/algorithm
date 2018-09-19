package offer;


import java.util.Stack;

/**
 * @author Yyang
 * @create 2018/9/19
 * @Describe 用两个队列实现栈
 * push 都在 stack1中进行
 * pop动作在 stack2中进行 当 stack2不为空直接 pop
 *  当stack2为空时 把 stack1中的元素 pop 到 stack2中 在 从 stack2 中 pop
 */
public class o5 {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(pop());
    }

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        int node;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                node = stack1.pop();
                stack2.push(node);
            }
        }
        return stack2.pop();
    }
}
