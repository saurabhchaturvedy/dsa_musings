package com.dsa.saurabh.level01.Heaps_CS;

import java.util.*;
import java.util.stream.Collectors;

public class Heap_SortCharsByFrequency {


    private List<Character> sortedCharsByFrequency(String str) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            characterCountMap.put(str.charAt(i), characterCountMap.getOrDefault(str.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>((n1, n2) -> {
            if (n1.getValue() != n2.getValue()) {
                return n2.getValue() - n1.getValue();
            } else {
                return n1.getKey() - n2.getKey();
            }
        });

        priorityQueue.addAll(characterCountMap.entrySet());

        List<Character> characterList = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            Map.Entry<Character, Integer> poll = priorityQueue.poll();
            characterList.add(poll.getKey());
        }

        return characterList;
    }

    private List<Character> sortedCharsByFrequencyStreams(String str) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            characterCountMap.put(str.charAt(i), characterCountMap.getOrDefault(str.charAt(i), 0) + 1);
        }
        return characterCountMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(x -> x.getKey()).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        String str = "raabbbiiiittttt";
        Heap_SortCharsByFrequency heap_sortCharsByFrequency = new Heap_SortCharsByFrequency();
        System.out.println(heap_sortCharsByFrequency.sortedCharsByFrequency(str));

        System.out.println(heap_sortCharsByFrequency.sortedCharsByFrequencyStreams(str));
    }
}
