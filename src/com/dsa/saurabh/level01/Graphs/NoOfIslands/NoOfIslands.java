package com.dsa.saurabh.level01.Graphs.NoOfIslands;

public class NoOfIslands {


    private static int noOfIslands(int[][] archipelago) {
        int noOfIslands = 0;

        for (int i = 0; i < archipelago.length; i++) {
            for (int j = 0; j < archipelago[i].length; j++) {
                noOfIslands = noOfIslands + dfs(archipelago, i, j);
            }
        }
        return noOfIslands;
    }

    private static int dfs(int[][] archipelago, int i, int j) {
        if (i < 0 || i > archipelago.length-1 || j < 0 || j > archipelago.length-1 || archipelago[i][j] == 0)
            return 0;

        archipelago[i][j] = 0;
        dfs(archipelago, i, j + 1);
        dfs(archipelago, i + 1, j);
        dfs(archipelago, i, j - 1);
        dfs(archipelago, i - 1, j);

        return 1;
    }


    public static void main(String[] args) {

        int[][] archipelago = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1}
        };

        int i = noOfIslands(archipelago);
        System.out.println("No. of islands is : " + i);
    }
}
