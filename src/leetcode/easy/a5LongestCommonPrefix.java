package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/7/23.
 * @Describe 求字符串数组最长的公共前缀
 * 时间复杂度O(Slogn)
 * 空间复杂度O(1)
 */
public class a5LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"leet","le","leetcode","leetc"}));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		int minLen = Integer.MAX_VALUE;
		for (String str : strs) {
			minLen = Math.min(minLen, str.length());
		}
		int low = 1;
		int high = minLen;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (isCommonPrefix(strs, middle)) {
				low = middle + 1;
			}else {
				high = middle - 1;
			}
		}
		return strs[0].substring(0, (low + high) / 2);
	}

	private static boolean isCommonPrefix(String[] strs, int len) {
		String str1 = strs[0].substring(0, len);
		for (int i = 0; i < strs.length; i++) {
			if (!strs[i].startsWith(str1)) {
				return false;
			}
		}
		return true;
	}
}

