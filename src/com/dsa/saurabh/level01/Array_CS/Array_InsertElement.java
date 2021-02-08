package com.dsa.saurabh.level01.Array_CS;

public class Array_InsertElement {

    static int[] values = {5, 8, 12, 7, 6};

    private static void fillArray(int[] arr, int[] values) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = values[i];
        }

    }

    private static void insertAtStart(int[] arr, int value) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
    }

    private static void insertAtGivenPosition(int[] arr, int value, int position) {
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
    }


    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("Empty array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        fillArray(arr, values);
        insertAtStart(arr, 65);
        insertAtGivenPosition(arr, 33, 2);
        System.out.println("Filled array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
