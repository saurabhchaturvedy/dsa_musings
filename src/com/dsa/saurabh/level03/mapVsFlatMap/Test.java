package com.dsa.saurabh.level03.mapVsFlatMap;

import java.util.Arrays;

public class Test {


    static int[] getsegments(int N, int K, int[] array, int[] queue) {
        int size = 0;

        int[] result = new int[queue.length];
        int segmentCount = 0;
        int i=0;
        while (size < queue.length && i!=array.length) {
            int x = queue[size];
            for (i = 0; i < array.length; i++) {
                int currentPivot = array[x - 1];
                if (currentPivot >= array[i]) {
                    segmentCount++;
                }
            }

            result[size] = segmentCount;
            segmentCount = 0;
            size++;
        }
        return result;
    }


    public static void main(String[] args) {
        int N = 4;
        int K = 2;

        int[] array = {4, 2, 1, 3};
        int[] queue = {1, 4};
        int[] getsegments = getsegments(N, K, array, queue);
        System.out.println("Answers :");
        Arrays.stream(getsegments).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
