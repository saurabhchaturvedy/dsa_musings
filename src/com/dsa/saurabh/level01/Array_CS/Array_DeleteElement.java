package com.dsa.saurabh.level01.Array_CS;
//7
public class Array_DeleteElement {

    static int[] array = {8, 4, 1, 3, 7, 6};
    int count = array.length;

    private void deleteFromEnd(int[] arr) {
        if (arr.length == 0) return;
        count--;
    }

    private void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void deleteFromAPosition(int[] array, int position) {
        if (position <= 0 || position > array.length) return;

        for (int i = position - 1; i < count-1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    private void deleteAValue(int[] array, int value) {
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == value) {
                break;
            }
        }

        if (i == count) return;

        for (int j = i; j < (count - 1); j++) {
            array[i] = array[i + 1];
        }
        count--;
    }


    public static void main(String[] args) {
        Array_DeleteElement array_deleteElement = new Array_DeleteElement();
        array_deleteElement.deleteFromEnd(array);
        array_deleteElement.print();
        array_deleteElement.deleteFromAPosition(array, 3);
        System.out.println();
        array_deleteElement.print();
        array_deleteElement.deleteAValue(array, 7);
        System.out.println();
        array_deleteElement.print();
    }
}
