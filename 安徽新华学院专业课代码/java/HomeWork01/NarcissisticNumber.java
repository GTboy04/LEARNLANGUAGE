package com.gt.HomeWork01;

import java.util.Scanner;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2024/3/9 23:26
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.print("请输入位数：");
        int n = new Scanner(System.in).nextInt();
        getNarcissisticNumber(n);
    }
    public static void getNarcissisticNumber(int n){
        int[] arr = new int[n];
        int temp = 0;
        int powSum = 0;
        for (int i = (int) Math.pow(10,n-1); i < (int)Math.pow(10,n); i++) {
            temp = i;
            for (int j = 0; j < n; j++) {
                arr[j] = temp%10;
                temp = temp/10;
            }
            for (int x = 0; x < n; x++) {
                powSum = powSum + (int)Math.pow(arr[x],n);
            }
            if (powSum == i){
                System.out.println(i);
            }else {
                powSum = 0;
            }
        }
    }
}

