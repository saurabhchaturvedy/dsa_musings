package com.dsa.saurabh.level01.Heaps_CS;

import java.util.*;

public class Heap_TopKFrequentElements {


    private List<Integer> topKFrequentElementsMaxHeap(int[] array, int k) {
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            numberFrequencyMap.put(array[i], numberFrequencyMap.getOrDefault(array[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((n1, n2) -> n2.getValue() - n1.getValue());
        priorityQueue.addAll(numberFrequencyMap.entrySet());


        List<Integer> elementList = new ArrayList<>();
        for (int i = 0; i < k && !priorityQueue.isEmpty(); i++) {
            elementList.add(priorityQueue.poll().getKey());
        }

        return elementList;
    }


    private List<Integer> topKFrequentElementsMinHeap(int[] array, int k) {
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            numberFrequencyMap.put(array[i], numberFrequencyMap.getOrDefault(array[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((n1, n2) -> n1.getValue() - n2.getValue());


        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(entry);
            } else {
                if (entry.getValue() > priorityQueue.peek().getValue()) {
                    priorityQueue.poll();
                    priorityQueue.offer(entry);
                }
            }
        }


        List<Integer> elementList = new ArrayList<>();
        for (int i = 0; i < k && !priorityQueue.isEmpty(); i++) {
            elementList.add(priorityQueue.poll().getKey());
        }

        return elementList;
    }


    public static void main(String[] args) {
        int[] arr = {8, 10, 7, 8, 11, 30, 11, 8, 38, 11, 2, 45, 2, 8};
        int k = 3;
        Heap_TopKFrequentElements heap_topKFrequentElements = new Heap_TopKFrequentElements();
        List<Integer> integers = heap_topKFrequentElements.topKFrequentElementsMaxHeap(arr, k);
        System.out.println(integers);
        List<Integer> integers2 = heap_topKFrequentElements.topKFrequentElementsMinHeap(arr, k);
        System.out.println(integers2);
    }
}
