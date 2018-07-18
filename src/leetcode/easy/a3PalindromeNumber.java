package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/7/19.
 * @Describe 判断回文数
 * 反转一半数字比较与前面的数字是否相同
 * 时间复杂度O(logn)
 * 空间复杂度O(1)
 */
public class a3PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(12233221));
	}
	public static boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int revertedNumber = 0;
		//反转一半数字
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x = x / 10;
		}
		//x的数字个数为奇数 需要除10
		return x == revertedNumber || x == revertedNumber / 10;
	}
}
