package leetcode.easy;

/**
 * @author Yyang
 * @create 2018/8/11.
 * @Describe 查找子串 kmp算法实现
 */
public class b1ImplementStrStr {
	public static void main(String[] args) {

	}

	public static int strStr(String haystack,String needle) {
		int start = 0;
		int i = 0;
		int hSize = haystack.length();
		int nSize = needle.length();
		if (hSize < nSize) {
			return -1;
		}
		if (nSize == 0) {
			return 0;
		}

		int[] kmpTable = kmp(needle);
		while (start <= hSize - nSize) {
			if (haystack.charAt(start + i) == needle.charAt(i)) {
				if (++i == nSize) {
					return start;
				}
			} else {
				start = start + i - kmpTable[i];
				i = i > 0 ? kmpTable[i] : 0;
			}
		}
		return -1;
	}

	public static int[] kmp(String s) {
		int sSize = s.length();
		int i = 2;
		int j = 0;

		int[] kmpTable = new int[sSize];
		kmpTable[0] = -1;
		if (sSize > 1) {
			kmpTable[1] = 0;
		}
		while (i < sSize) {
			if (s.charAt(i-1) == s.charAt(j)) {
				kmpTable[i++] = ++j;
			} else if (j > 0) {
				j = kmpTable[j];
			} else {
				kmpTable[i++] = 0;
			}
		}
		return kmpTable;
	}
}
