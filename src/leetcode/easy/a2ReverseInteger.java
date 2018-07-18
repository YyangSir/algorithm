package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/7/18.
 * @Describe 反转整数 123->321
 * 考虑int溢出
 * 时间复杂度O(log(x))
 * 空间复杂度O(1)
 */
public class a2ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(3210));
	}
	public static int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			rev = rev * 10 + pop;
		}
		return rev;
	}
}
