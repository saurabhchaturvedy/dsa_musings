package com.dsa.saurabh.level01.PeakElement;

public class PeakElement {


    private static int peakElement(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (mid > 0 && mid < array.length - 1) {
                if (array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
                    return mid;
                } else if (array[mid - 1] > array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (mid == 0) {
                    if (array[mid] > array[mid + 1])
                        return 0;
                    else return 1;
                } else {
                    if (array[mid - 1] > array[mid - 2]) {
                        return mid - 1;
                    } else {
                        return mid - 2;
                    }
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1,2,1,3,5,6,4};

        System.out.println(peakElement(array));

    }
}
