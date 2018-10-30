package offer;

/**
 * @author Yyang
 * @create 2018/10/30
 * @Describe 数组中重复的数字
 */
public class o43 {
    public static void main(String[] args) {
        int[] duplication = new int[5];
        duplicate(new int[]{2, 3, 4, 5, 5, 6, 6}, 7, duplication);
        System.out.println(duplication[0]);
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (i != numbers[i]) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }else {
                    int temp = numbers[numbers[i]];
                    numbers[numbers[i]] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return false;
    }
}
