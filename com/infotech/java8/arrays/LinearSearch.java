package com.infotech.java8.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int i = linearSearch(arr, target);
        if (i != -1) {
            System.out.println("target found");
        } else {
            System.out.println("target not found");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) {
                return j;
            }
        }
        return -1;
    }
}
