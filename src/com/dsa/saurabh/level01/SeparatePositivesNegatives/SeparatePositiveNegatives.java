package com.dsa.saurabh.level01.SeparatePositivesNegatives;

public class SeparatePositiveNegatives {



    private static int[] separate(int[]array,int low,int high)
    {
        int pIndex = low;

        for(int i=low; i<=high; i++)
        {
            if(array[i]%2==0) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }

        return array;
    }

    private static void swap(int[]array,int x,int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }


    public static void main(String[] args) {
        int[]array = {3,2,5,8,6,9};

        int[] separate = separate(array, 0, array.length - 1);

        for(int i=0; i< separate.length; i++)
        {
            System.out.print(separate[i]+" ");
        }


    }
}
