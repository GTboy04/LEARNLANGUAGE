package com.gt.HomeWork02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2024/3/23 14:52
 */
public class ArraySortTest {
    public static void main(String[] args) {
        Integer[] arr = {3,1,4,1,5,9,2,6};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }

}
