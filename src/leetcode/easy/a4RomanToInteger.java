package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yyang
 * @create 2018/7/19.
 * @Describe 罗马数字转阿拉伯数字
 * 前一个数比后一个数小就相加 反之相减
 */
public class a4RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInteger("VI"));
	}

	public static int romanToInteger(String s) {
		int res = 0;
		Map<Character, Integer> map = new HashMap<>(10);
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for (int i = 0; i < s.length() ; i++) {
			int n = map.get(s.charAt(i));
			if (i == s.length() - 1 || map.get(s.charAt(i)) <= map.get(s.charAt(i))) {
				res += n;
			} else {
				res -= n;
			}
		}
		return res;
	}
}
