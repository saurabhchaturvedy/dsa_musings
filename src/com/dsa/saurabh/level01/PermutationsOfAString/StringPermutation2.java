package com.dsa.saurabh.level01.PermutationsOfAString;

public class StringPermutation2 {


    private  void permutations(String str,int low,int high)
    {
        if(low==high)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=low; i<=high; i++)
            {
                String swap = swap(str, low, i);
                permutations(swap,low+1,high);
            }
        }
    }

    private String swap(String str,int i,int j)
    {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        String str = "ABC";

        StringPermutation2 stringPermutation2 = new StringPermutation2();
        stringPermutation2.permutations(str,0,(str.length()-1));
    }
}
