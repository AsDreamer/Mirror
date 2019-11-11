package com.bittch;

import java.io.File;
import java.util.Arrays;

public class BubbleSort2 {
    // 我们的算法类不允许产生任何实例
    private BubbleSort2(){}
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++)
                if (arr[j]>arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                }
        }
    }

    public static void main(String[] args) {
        int[] arr= {10,9,8,7,6,5,4,3,2,1};
        BubbleSort2.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    }

