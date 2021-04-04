package com.dsa.saurabh.level01.Tries;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {


    private static int solve(int N,int T, int[][]tasks)
    {
        int previousPoint=0;
        int timeSpent=0;
        int remainingTime=0;
        int possibleTaskExecuted=0;
        for(int i=0; i<N; i++)
        {
            int timeS[] = calculateTime(tasks[i],previousPoint);
            if(i==0) {
                possibleTaskExecuted++;
            }
            timeSpent = timeS[0];
            if(timeSpent<remainingTime) {
                remainingTime = T - timeSpent;
                possibleTaskExecuted++;
            }

        }

        return possibleTaskExecuted;
    }

    private static int[] calculateTime(int[] task,int previousPoint) {
        int[]arr = new int[2];

       int travelTime = previousPoint - task[0];
       previousPoint = task[0];
       arr[0] = travelTime + task[1];
       arr[1] = previousPoint;
       return arr;

    }

    public static void main(String[] args) {
        int[][]arr = {{2,8},{4,0},{5,1}};
        int N=3;
        int T=16;

        int solve = solve(N, T, arr);
        System.out.println("time spent is "+solve);
    }
}
