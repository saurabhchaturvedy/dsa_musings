package com.dsa.saurabh.level01.Graphs.NearestDistanceCell1;

import java.util.Arrays;

public class NearestDistance {


    private static void nearestCellDistance(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j]==1) {
                    dfs(array, 0, i, j);
                }
            }
        }
    }

    private static void dfs(int[][] array, int count, int i, int j) {

        if (i < 0 || i > array.length-1 || j < 0 || j > array[i].length-1 || array[i][j] < count) {
            return;
        }

        array[i][j] = count;
        dfs(array, count + 1, i, j + 1);
        dfs(array, count + 1, i + 1, j);
        dfs(array, count + 1, i, j - 1);
        dfs(array, count + 1, i - 1, j);

    }


    public static void main(String[] args) {
        int array[][] = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0}
        };

        nearestCellDistance(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
