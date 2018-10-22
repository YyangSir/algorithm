package offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Yyang
 * @create 2018/10/22
 * @Describe 最小的K个数
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 利用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆
 */
public class o26 {
    public static void main(String[] args) {
        List<Integer> list = GetLeastNumbers_Solution(new int[]{2, 4, 6, 78, 8, 2, 6}, 3);
        list.forEach(System.out::println);
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || k == 0 || k > input.length) {
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            }else {
                if (maxHeap.peek() > input[i]) {
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }
        for (Integer i : maxHeap) {
            res.add(i);
        }

        return res;
    }
}
