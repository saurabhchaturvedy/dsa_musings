package com.dsa.saurabh.level01.Graphs.BreadthFirstSearch;

public class NearestDistance {

    static int[][] answer;

    private static void nearestCellDistance(int[][] array) {
        answer = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int minDistance = Integer.MAX_VALUE;

                for (int x = 0; x < array.length; x++) {
                    for (int y = 0; y < array[0].length; y++) {
                        if (array[x][y] == 1) {
                            int distance = Math.abs(x - i) + Math.abs(y - j);
                            minDistance = Math.min(minDistance, distance);
                        }
                    }
                }
                answer[i][j] = minDistance;
            }
        }

    }


    public static void main(String[] args) {
        int matrix1[][] = new int[][]{
                {0, 1, 0},
                {0, 0, 0},
                {1, 0, 0}
        };
        nearestCellDistance(matrix1);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
