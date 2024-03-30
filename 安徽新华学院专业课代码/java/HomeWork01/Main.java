package com.gt.HomeWork01;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2024/3/17 21:00
 */
public class Main {
    public static void main(String[] args) {
        int numRows =15; // 设置要打印的行数

        // 生成并打印杨辉三角
        generateAndPrintTriangle(numRows);
    }

    // 生成并打印杨辉三角
    public static void generateAndPrintTriangle(int numRows) {
        // 生成杨辉三角形
        int[][] triangle = generate(numRows);

        // 打印杨辉三角形
        printTriangle(triangle);
    }

    // 生成杨辉三角
    public static int[][] generate(int numRows) {
        int[][] triangle = new int[numRows][];

        // 逐行生成杨辉三角形
        for (int i = 0; i < numRows; i++) {
            // 创建当前行的数组
            triangle[i] = new int[i + 1];

            // 设置当前行的首尾元素为1
            triangle[i][0] = triangle[i][i] = 1;

            // 设置当前行的中间元素
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }

    // 打印杨辉三角形
    public static void printTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            // 在每行前打印空格使得杨辉三角形居中显示
            for (int k = 0; k < triangle.length - i - 1; k++) {
                System.out.print("\t");
            }

            // 打印当前行的元素
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%d ",triangle[i][j]);
            }

            System.out.println(); // 换行
        }
    }
}

