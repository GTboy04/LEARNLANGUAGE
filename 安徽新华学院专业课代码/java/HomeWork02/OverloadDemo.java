package com.gt.HomeWork02;

import java.util.Scanner;

/**
 * @author Gt_boy
 * @description: TODO:实现重载
 * @date 2024/3/23 13:38
 */
public class OverloadDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        SysConvert(100);
        System.out.println("-------------------");
        SysConvert("100");
        System.out.println("-------------------");
        SysConvert(1000,2);

    }
    public static void SysConvert(int num){
        System.out.println("将十进制数转成2,8,16进制并输出");
        String BinarySystem = Integer.toString(num, 2);
        String OctSystem = Integer.toString(num, 8);
        String HexSystem = Integer.toString(num, 16);
//        valueOf(String,int)根据第二个参数指的进制在string中提取对应的进制数转换成十进制的Integer对象
        Integer i = Integer.valueOf("10101", 2);
        System.out.println("BinarySystem = " + BinarySystem);
        System.out.println("OctSystem = " + OctSystem);
        System.out.println("HexSystem = " + HexSystem);
    }

    public static void SysConvert(String num){
        System.out.println("将输入的二进制转换为十进制");
        int i = Integer.parseInt(num, 2);
        System.out.println("i = " + i);
    }

    public static void SysConvert(int num, int radix){
        System.out.println("根据要求将十进制转化成对应的进制数");
        String SysNum = Integer.toString(num, radix);
        System.out.println("string = " + SysNum);
    }
}




