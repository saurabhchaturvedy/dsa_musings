package com.dsa.saurabh.level01.Graphs.MazeSolving;

public class MazeBuilder {


    private static int[][] maze = {
            {1, 1, 1, 0 },
            {1, 2, 0, 0 },
            {1, 1, 0, 1 },
            {1, 1, 0, 3 },
            {1, 1, 1, 1 }
    };

    private int startRowindex;
    private int startColumnIndex;
    private int rows;
    private int cols;

    public void setUpMaze() {

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    this.setStartRowindex(i);
                    this.setStartColumnIndex(j);
                }
            }
        }

    }

    public static int[][] getMaze() {
        return maze;
    }

    public static void setMaze(int[][] maze) {
        MazeBuilder.maze = maze;
    }

    public int getStartRowindex() {
        return startRowindex;
    }

    public void setStartRowindex(int startRowindex) {
        this.startRowindex = startRowindex;
    }

    public int getStartColumnIndex() {
        return startColumnIndex;
    }

    public void setStartColumnIndex(int startColumnIndex) {
        this.startColumnIndex = startColumnIndex;
    }

    public int getRows() {
        return maze.length;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return maze[0].length;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}
