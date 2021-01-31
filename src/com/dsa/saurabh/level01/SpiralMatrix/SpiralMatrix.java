package com.dsa.saurabh.level01.SpiralMatrix;

public class SpiralMatrix {


    private static void spiralMatrix(int[][] array) {
        int top = 0;
        int left = 0;
        int right = array[0].length - 1;
        int bottom = array.length - 1;

        while (true) {
            if (left > right) {
                break;
            }

            for (int i = left; i <= right; i++) {
                System.out.print(array[top][i] + " ");
            }
            top++;
            System.out.println();

            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                System.out.print(array[i][right] + " ");
            }

            right--;
            System.out.println();

            if (left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                System.out.print(array[bottom][i] + " ");
            }

            bottom--;
            System.out.println();

            if (top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                System.out.print(array[i][left] + " ");
            }

            left++;
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        spiralMatrix(array);
    }
}
