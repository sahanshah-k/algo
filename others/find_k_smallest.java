package others;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class find_k_smallest {

    public List<Integer> func(int[] arr, int k) {
        var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < k; i ++) {
            maxHeap.add(arr[i]);
        }
        for (int i =k; i < arr.length; i ++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.stream().toList();
    }

}
