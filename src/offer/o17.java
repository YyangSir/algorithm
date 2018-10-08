package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Yyang
 * @create 2018/9/28
 * @Describe 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数
 * <p>
 * 用一个栈stack保存数据，用另外一个栈temp保存依次入栈最小的数
 * 比如，stack中依次入栈
 * 5, 3, 4, 10, 2, 12, 1, 8
 * 则temp依次入栈
 * 5, 3, 3，3, 2, 2, 1, 1
 * 每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则用最小元素入栈。
 */
public class o17 {

    public static void main(String[] args) {
        push(5);
        push(1);
        push(2);
        push(3);
        pop();
        System.out.println(min());

        doPush(5);
        doPush(1);
        doPush(2);
        doPush(1);
        doPush(3);
        doPop();
        System.out.println(getMin());
    }

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();
    static int min = Integer.MAX_VALUE;

    //标准版
    public static void push(int node) {
        stack.push(node);
        if (node < min) {
            temp.push(node);
            min = node;
        } else {
            temp.push(min);
        }
    }

    //当栈为空时pop 和top抛异常
    public static void pop() {
        stack.pop();
        temp.pop();
    }

    public static int top() {
        int t = stack.pop();
        stack.push(t);
        return t;
    }

    public static int min() {
        int t = temp.pop();
        temp.push(t);
        return t;
    }

    //优化版 mins存储的事 data 最小值的索引

    static List<Integer> data = new ArrayList<>();
    static List<Integer> mins = new ArrayList<>();

    public static void doPush(int num) {
        data.add(num);
        if (mins.size() == 0) {
            mins.add(0);
        }else {
            int min = getMin();
            if (num < min) {
                mins.add(data.size() - 1);
            }
        }
    }

    public static int doPop() {
        int popIndex = data.size() - 1;
        int minIndex = mins.get(mins.size() - 1);
        if (popIndex == minIndex) {
            mins.remove(mins.size() - 1);
        }
        return data.remove(popIndex);
    }

    public static int getMin() {
        int minIdex = mins.get(mins.size() - 1);
        return data.get(minIdex);
    }
}
