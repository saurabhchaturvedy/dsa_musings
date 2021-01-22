package com.dsa.saurabh.level01.Graphs.MazeSolving;

public class MazeSolver {

    private int[][] maze;
    private boolean[][] visited;
    private int startRowindex;
    private int startColIndex;

    MazeSolver(int[][] maze, int rows, int cols, int startRowindex, int startColIndex) {
        this.maze = maze;
        this.startRowindex = startRowindex;
        this.startColIndex = startColIndex;
        this.visited = new boolean[rows][cols];
    }


    private void findWayOut() {
        try {
            dfs(this.startRowindex, this.startColIndex);
            System.out.println("Oh Blimey...we still can't find a way to get out..looks like there's no way out ");
        } catch (RuntimeException runtimeException) {
            System.out.println("Yay..We have found a way to get out of this deadly island !!");
        }
    }

    private void dfs(int i, int j) {

        if (maze[i][j] == 3) {
            throw new RuntimeException("Way to get out of the island has been found...");
        }

        int endOfMaze = maze.length - 1;

        if (visited[i][j]) {
            return;
        } else if (i < 0 || i >= endOfMaze) {
            return
                    ;
        } else if (j < 0 || j >= endOfMaze) {
            return;
        } else if (maze[i][j] == 1) {
            return;
        } else {
            visited[i][j] = true;
            dfs(i, j + 1);
            dfs(i + 1, j);
            dfs(i, j - 1);
            dfs(i - 1, j);
        }
    }

    public static void main(String[] args) {

        MazeBuilder mazeBuilder = new MazeBuilder();
        mazeBuilder.setUpMaze();
        MazeSolver mazeSolver = new MazeSolver(MazeBuilder.getMaze(), mazeBuilder.getRows(), mazeBuilder.getCols(), mazeBuilder.getStartRowindex(), mazeBuilder.getStartColumnIndex());
        mazeSolver.findWayOut();
    }
}
