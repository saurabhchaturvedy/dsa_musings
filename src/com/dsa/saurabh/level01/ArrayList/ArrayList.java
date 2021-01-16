package com.dsa.saurabh.level01.ArrayList;

import java.util.Arrays;

public class ArrayList<E> {

    private static final int CAPACITY = 5;

    private int size;
    private Object[] holderArray;

    ArrayList() {
        this.holderArray = new Object[CAPACITY];
    }

    private void add(E e) {
        if (size == holderArray.length - 1) {
            ensureCapacity();
        }
        holderArray[size++] = e;
    }

    private E get(int index) {
        if (index < 1 || index >= size) {
            throw new IndexOutOfBoundsException("index : " + index + " size : " + size);
        }

        return (E) holderArray[index];
    }

    private Object remove(int index) {
        if (index < 1 || index >= size) {
            throw new IndexOutOfBoundsException("index : " + index + " size : " + size);
        }

        Object removedElement = holderArray[index];

        for (int i = index; i < size - 1; index++) {
            holderArray[i] = holderArray[i + 1];
        }

        size--;

        return removedElement;
    }

    private void display() {
        for (int i = 0; i < holderArray.length; i++) {
            if (holderArray[i] != null)
                System.out.print(holderArray[i] + " ");
        }
    }

    private void ensureCapacity() {

        int increasedCapacity = holderArray.length * 2;
        holderArray = Arrays.copyOf(holderArray, increasedCapacity);
    }

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(8);
        integerArrayList.add(9);
        integerArrayList.add(10);
        integerArrayList.add(12);
        integerArrayList.add(17);

        integerArrayList.display();
    }
}
