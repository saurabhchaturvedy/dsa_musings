package com.dsa.saurabh.level01.PrintAllDiagonals;

import java.util.Arrays;

public class PrintAllDiagonals {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
		int rows = arr.length;
		int cols = arr[0].length;
		System.out.println("No. of rows : " + rows + " No. of columns : " + cols);

//		[1, 2, 3, 4]
//		[5, 6, 7, 8]
//		[9, 10, 11, 12]
//	    [13, 14, 15, 16]

		// For first half

//		00
//		10 01
//		20 11 02

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arr[i - j][j] + " ");
			}
		}
		System.out.print(' ');

		// Second half i,j pattern
//		33
//		23 32
//		13 22 31

		int columnShift = 0;
		for (int i = rows - 1; i > 0; i--) { // 3 // 14(31) 11(22) 8(13)
			columnShift++; // // 3
			for (int j = columnShift; j < rows; j++) {
				System.out.print(arr[rows + columnShift - j - 1][j] + " ");
			}
		}
	}
}
