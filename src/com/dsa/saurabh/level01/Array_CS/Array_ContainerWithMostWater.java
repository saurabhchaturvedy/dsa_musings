package com.dsa.saurabh.level01.Array_CS;
//5
class Array_ContainerWithMostWater {
    public static int maxArea(int[] height) {

        int low = 0;
        int high = height.length - 1;
        int max = 0;

        while (low < high) {
            int lh = height[low];
            int rh = height[high];

            int min_height = Math.min(lh, rh);
            int length = high - low;
            int max_area = length * min_height;
            max = Math.max(max_area, max);
            if (lh < rh) low++;
            else high--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }
}