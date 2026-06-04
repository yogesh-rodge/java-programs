package com.infotech.java8.arrays;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
/*        for (int[] a : arr){
            for (int x: a){
                System.out.println(x);
            }
        }*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

}
