package com.dsa.saurabh.level01.Stack;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Stack_NearestGreaterToRight {


    private static void nearestElementToRight(int[] arr) {

        Stack<Integer> S = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            // Keep removing top element from S while the top
            // element is greater than or equal to arr[i]
            while (!S.empty() && S.peek() >= arr[i]) {
                S.pop();
            }

            // If all elements in S were greater than arr[i]
            if (S.empty()) {
                System.out.print("_, ");
            } else //Else print the nearest smaller element
            {
                System.out.print(S.peek() + ", ");
            }

            // Push this element
            S.push(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4};
        nearestElementToRight(array);
    }
}
