package com.dsa.saurabh.level01.Heaps_CS;

import java.util.PriorityQueue;

public class Heap_ConnectRopesWithMinimumCost {


    private int connectRopesWithMinimumCost(int[] array) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
        }

        int minCost = 0;

        while (priorityQueue.size() > 1) {
            int tempCost = priorityQueue.poll() + priorityQueue.poll();
            minCost = minCost + tempCost;
            priorityQueue.offer(tempCost);
        }
        return minCost;
    }


    public static void main(String[] args) {
        int[] array = {3, 4, 7, 2};
        Heap_ConnectRopesWithMinimumCost heap_connectRopesWithMinimumCost = new Heap_ConnectRopesWithMinimumCost();
        System.out.println(heap_connectRopesWithMinimumCost.connectRopesWithMinimumCost(array));
    }
}
