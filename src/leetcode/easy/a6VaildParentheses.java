package leetcode.easy;

import java.util.Stack;

/**
 * @author Yyang
 * @create 2018/7/27.
 * @Describe 判断输入的字符串括号是否匹配
 * (){}[]->true (}{}->false
 */
public class a6VaildParentheses {
	public static void main(String[] args) {
		System.out.println(isVaild("(){}[]"));
	}

	public static boolean isVaild(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != c) {
				//最后栈为非空时也会返回FALSE
				return false;
			}
		}
		return stack.isEmpty();
	}
}
