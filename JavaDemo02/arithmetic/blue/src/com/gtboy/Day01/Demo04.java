package com.gtboy.Day01;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/29 1:22
 */
public class Demo04 {
    public static void main(String[] args) {
        int res = 6;
        for (int i = 22; i < Integer.MAX_VALUE; ++i) {
            if (helper(i) && ++res == 23) {
                System.out.print(i);
                break;
            }
        }
    }

    private static boolean helper(int n) {
        int t = 3;
        while (n > 0) {
            if ((n & 1) == 1) t--;
            n >>= 1;
        }
        return t == 0;
    }
}

