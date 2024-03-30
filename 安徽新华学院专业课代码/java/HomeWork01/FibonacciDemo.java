package com.gt.HomeWork01;

import java.util.Scanner;

/**
 * @author Gt_boy
 * @description: TODO: 斐波那契数列
 * @date 2024/3/17 13:11
 */
public class FibonacciDemo {
    public static void main(String[] args) {
        GetFibonacci();
    }

    public static void GetFibonacci(){
//        n表示要输出几位的斐波那契数列
        System.out.println("输入斐波那契数列的项数");
        int n = new Scanner(System.in).nextInt();
        /**
         * prevNum表示前一个数字
         * nextNum表示下一数字
         * temp存储临时变量用的
         * 斐波那契数列从第三位开始等于前两位相加，但是如果在第一位的前面在添加一位0
         * 0    1   1   2   3   5, ……可以发现从第二位开始就能够使用前两位相加的方法来进行规律运算了
         * 所以一开始设
         * prevNum = 0
         * nextNum = 1
         */
        int prevNum = 0;
        int nextNum = 1;
        int temp = 0;
        /**
         * 在循环中先存住nextNum的值在对nextNum进行修改
         * 计算完nextNum后将temp赋值给prevNum
         */
        for (int i = 0; i < n; i++) {
            System.out.println("nextNum = " + nextNum);//1  1   2   3
            temp = nextNum;                            //1  1   2   3
            nextNum += prevNum;               //1  2   3   5
            prevNum = temp;                            //1  1   2   3
        }
    }
}
