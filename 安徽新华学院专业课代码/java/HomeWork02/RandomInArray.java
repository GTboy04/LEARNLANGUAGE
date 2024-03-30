package com.gt.HomeWork02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Gt_boy
 * @description: TODO:随机数组降序排序
 * @date 2024/3/23 14:17
 */
public class RandomInArray {
    public static void main(String[] args) {
//        int random = (int) (Math.random()*100+1);
//        System.out.println("random = " + random);

        Integer[] integers = GenerateIntArrRange100(8);

        int[] arr = new int[integers.length];

        for (int i = 0; i < integers.length; i++) {
            arr[i] = integers[i];
        }

        System.out.println(Arrays.toString(arr));


    }


    public static Integer[] GenerateIntArrRange100(int length) {
        Integer[] arr = new Integer[length];
        int random = 0;
        for (int i = 0; i < length; i++) {
            random = (int) (Math.random() * 100 + 1);
            arr[i] = random;
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return arr;
    }
}
