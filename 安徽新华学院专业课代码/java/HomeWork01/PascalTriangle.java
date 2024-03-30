package com.gt.HomeWork01;

import java.util.Scanner;

/**
 * @author Gt_boy
 * @description: TODO:杨辉三角
 * @date 2024/3/17 13:35
 */
public class PascalTriangle{
    public static void main(String[] args) {
        PascalTriangleDemo();
    }

    public static void PascalTriangleDemo(){
//        n是要输出杨辉三角的行数
        int n = new Scanner(System.in).nextInt();
        if (n<1){
            return;
        }
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d",arr[i][j]);
            }
            System.out.println();
        }
    }

}
