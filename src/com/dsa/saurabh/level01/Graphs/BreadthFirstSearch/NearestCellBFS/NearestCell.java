package com.dsa.saurabh.level01.Graphs.BreadthFirstSearch.NearestCellBFS;

import java.util.LinkedList;
import java.util.Queue;

public class NearestCell {


    private void nearestCell(int[][] array) {

        int x = array.length;
        int y = array[0].length;

        int[][] answer = new int[x][y];

        Queue<Coordinate> coordinateQueue = new LinkedList<>();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (array[i][j] == 1) {
                    coordinateQueue.offer(new Coordinate(i, j));
                }
            }
        }

        int minDistance = 0;

        while (!coordinateQueue.isEmpty()) {
            int size = coordinateQueue.size();

            for (int i = 0; i < size; i++) {
                Coordinate poll = coordinateQueue.poll();
                answer[poll.getRow()][poll.getCol()] = minDistance;

                int rightRow = poll.getRow();
                int rightCol = poll.getCol() + 1;
                if ((rightRow >= 0 || rightRow < x) && (rightCol >= 0 || rightCol < y)) {
                    if (array[rightRow][rightCol] == 0) {
                        coordinateQueue.offer(new Coordinate(rightRow, rightCol));
                        array[rightRow][rightCol] = 1;
                    }
                }

                int downRow = poll.getRow() + 1;
                int downCol = poll.getCol();
                if ((downRow >= 0 || downRow < x) && (downCol >= 0 || downCol < y)) {
                    if (array[downRow][downCol] == 0) {
                        coordinateQueue.offer(new Coordinate(downRow, downCol));
                        array[downRow][downCol] = 1;
                    }
                }

                int leftRow = poll.getRow();
                int leftCol = poll.getCol() - 1;
                if ((leftRow >= 0 || leftRow < x) && (leftCol >= 0 || leftCol < y)) {
                    if (array[leftRow][leftCol] == 0) {
                        coordinateQueue.offer(new Coordinate(leftRow, rightCol));
                        array[leftRow][leftCol] = 1;
                    }
                }

                int upRow = poll.getRow() - 1;
                int upCol = poll.getCol();
                if ((upRow >= 0 || upRow < x) && (upCol >= 0 || upCol < y)) {
                    if (array[upRow][upCol] == 0) {
                        coordinateQueue.offer(new Coordinate(upRow, upCol));
                        array[upRow][upCol] = 1;
                    }
                }

            }

            minDistance++;
        }

    }


    public static void main(String[] args) {
        int matrix1[][] = new int[][]{
                {0, 1, 0},
                {0, 0, 0},
                {1, 0, 0}
        };

        NearestCell nearestCell = new NearestCell();
        nearestCell.nearestCell(matrix1);
    }
}
