package com.dsa.saurabh.level01.SlidingWindow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class FirstNegativeNumberWindowSizeK {


    private static Queue<Integer> firstNegativeNumberWindowSizeK(int[] arr, int k) {
        int i = 0;
        int j = 0;
        Queue<Integer> queue = new LinkedList<>();

        while (j < arr.length) {
            if (arr[j] < 0)
                queue.offer(new Integer(arr[j]));

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (queue.isEmpty()) {
                    queue.offer(0);
                } else {
                    if (arr[j] == queue.peek()) {
                        queue.poll();
                    }
                    i++;
                    j++;
                }
            }
        }
        return queue;
    }

    public static void main(String[] args) {

        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;
        Queue<Integer> queue = firstNegativeNumberWindowSizeK(arr, 2);
        Stream.of(queue).map(x -> x + " ").forEach(System.out::print);

    }
}
