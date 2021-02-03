package com.dsa.saurabh.level01.Recursion;

public class Recursion_TowerOfHanoi {

    static int count = 0;

    private static void towerOfHanoi(int disks, char start, char end, char helper) {
        count++;
        if (disks == 1) {
            System.out.println("Move disk " + disks + " from " + start + " to " + end);
            return;
        }

        towerOfHanoi(disks - 1, start, helper, end);
        System.out.println("Move disk " + disks + " from " + start + " to " + end);
        towerOfHanoi(disks - 1, helper, end, start);

    }


    public static void main(String[] args) {

        int noOfDisks = 4;
        towerOfHanoi(noOfDisks, 'A', 'C', 'B');
        System.out.println("No. of steps : " + count);  //  2^n - 1 steps n= number of disks

    }
}
