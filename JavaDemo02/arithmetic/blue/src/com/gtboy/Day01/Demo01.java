package com.gtboy.Day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/28 11:59
 */
public class Demo01 {
    public static void main(String[] args) {
//        func01();
//        func02();
//        func03();
//        func04();
//        func05();
//        func06();
//        func07();
//        func08();
//        func09();
        func11();
    }

    public static void func01() {
        int baseNum = 2023;
        boolean flag = true;
        char[] temp = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        while (flag) {
            String H_num = Integer.toString(baseNum, 16);
            char[] chars = H_num.toCharArray();
            ArrayList<Character> characters = new ArrayList<>();
            for (char aChar : chars) {
                characters.add(aChar);
            }
            for (int i = 0; i < temp.length; i++) {
                if (characters.contains(temp[i])) {
                    baseNum++;
                    break;
                } else if (i == 9) {
                    flag = false;
                    System.out.println(baseNum);
//                    System.out.println(characters);
                }
            }
        }
    }

    public static void func02() {
        int[] lists = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77};
        ArrayList<Integer> box = new ArrayList<>();
        int count = 0;
        int temp = 0;
        for (int list : lists) {
            box.add(list);
        }
        for (int i = 0; i < box.size() - 1; i++) {
            for (int j = i + 1; j < box.size(); j++) {
                temp = box.get(i) * box.get(j);
                if (temp >= 2022) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    public static void func03() {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int n = scan.nextInt();
        int res = (day + n) % 7;
        res = res == 0 ? 7 : res;
        System.out.println(res);
    }


    /**
     * 清理水域有难度，二维数组，加上枚举
     */
    public static void func04() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();
        boolean[][] area = new boolean[n][m];
        for (int x = 0; x < t; x++) {
            int r1 = scan.nextInt();
            int c1 = scan.nextInt();
            int r2 = scan.nextInt();
            int c2 = scan.nextInt();
            for (int y = r1 - 1; y <= r2 - 1; y++) {
                for (int z = c1 - 1; z <= c2 - 1; z++) {
//                    System.out.println(y);
//                    System.out.println(z);
                    area[y][z] = true;
                }
            }
        }
//        System.out.println(Arrays.toString(area));
//        for (int i = 0; i < area.length; i++) {
//            for (int j = 0; j < area[i].length; j++) {
//                System.out.println(area[i][j]);
//            }
//        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!area[i][j]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }


    /**
     * 这段代码的目的是将整数表示的Excel列序号转换为对应的列名称。在Excel中，列的名称采用一种类似于26进制的表示方式，即从A到Z是一组，然后从AA到ZZ是下一组，以此类推。
     * <p>
     * 取余操作和除以26的过程实际上就是在进行进制转换的操作。下面我来解释一下：
     * <p>
     * 取余操作：
     * <p>
     * 当 n 对 26 取余时，得到的余数表示当前列在26个字母中的索引。例如，如果余数为0，表示该列是字母表的第一个字母A；如果余数为1，表示该列是字母表的第二个字母B；以此类推。余数的范围是0到25，因此要对结果减一（--n % 26）是为了将余数映射到0到25的范围。
     * 除以26操作：
     * <p>
     * 由于Excel列的表示方式是类似于26进制，每个位置上的值范围是0到25，所以在进行进制转换时，要将 n 除以 26，以确定下一个位置的值。这相当于从低位到高位逐步计算进制转换的过程。
     * 通过这样的操作，循环进行取余和除以26，就可以得到整数 n 对应的Excel列名称。最终，得到的字符串是从右向左构建的，而Excel列名称是从左向右表示的，所以在构建字符串的过程中，通过将当前字符拼接到已有字符串的前面，最终得到正确的Excel列名称。
     */
    public static void func05() {
        int n = 2022;
        String s = "";
        while (n > 0) {
//            System.out.println(--n%26);
            int temp = --n % 26;
//            System.out.println(temp);
            s = (char) (temp + 'A') + s;
//            System.out.println(s);
            n /= 26;
            System.out.println(n);
        }
        System.out.println(s);
    }

    /**
     * 有的数转换为二进制之后，正好有3个数位为1。例如7转换为二进制为111，有3个数位为1：又如
     * 11转换为二进制为1011，有3个数位为1。满足条件的前几个数依次为：7,11,13,14,19,21,
     * 请问，第23个满足条件的数是多少？
     */
    public static void func06() {
        int total = 0;
        int count = 0;
        int baseNum = 0;
        while (!(total == 23)) {
            String twoCode = "";
            baseNum++;
            twoCode = Integer.toString(baseNum, 2);
            char[] chars = twoCode.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1') {
                    System.out.println("十进制" + baseNum);
                    System.out.println(Arrays.toString(chars));
                    count++;
                }
            }
            System.out.println("计数" + count);
            if (count == 3) {
                total++;
                count = 0;
            } else {
                count = 0;
            }
        }

        System.out.println(total + ":" + baseNum);
    }


    public static void func07() {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6=0, count7=0, count8=0, count9 = 0;
        char[] chars = number.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '0':
                    count0++;
                    break;
                case '1':
                    count1++;
                    break;
                case '2':
                    count2++;
                    break;
                case '3':
                    count3++;
                    break;
                case '4':
                    count4++;
                    break;
                case '5':
                    count5++;
                    break;
                case '6':
                    count6++;
                    break;
                case '7':
                    count7++;
                    break;
                case '8':
                    count8++;
                    break;
                case '9':
                    count9++;
                    break;

            }
        }
        System.out.println(count0+" "+count1+" "+count2+" "+count3+" "+count4+" "+count5+" "+count6+" "+count7+" "+count8+" "+count9);
    }

    public static void func08(){
        HashMap<Integer, String> box = new HashMap<>();
        box.put(0,"low");
        box.put(1,"mid");
        box.put(2,"high");

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt()%3;
        System.out.println(box.get(P));
    }

    public static void func09(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
//        用循环可以实现一一行输入n个
//        用来数组输入的
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int topLocation = 0;
        int extent = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
                int temp = (arr[i-1]-arr[i])*(arr[i+1]-arr[i]);
                if (temp>extent){
                    extent = temp;
                }
            }
        }
        if (extent==0) {
            System.out.println(extent);
        } else {
            System.out.println(extent);
        }

//        System.out.println(Arrays.toString(arr));
        sc.close();
    }



    public static void func10(){
        System.out.println(2023/(3*3*4));
    }

    public static void func11(){
        Scanner sc = new Scanner(System.in);
//        信号塔的位置
        int[] X = new int[110];
        int[] Y = new int[110];
//        区域的长宽
        int W = sc.nextInt();
        int H = sc.nextInt();
//        信号塔的个数
        int n = sc.nextInt();
//        覆盖半径
        int R = sc.nextInt();
//        信号塔的坐标
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

//        记录点数
        int res = 0;
        for (int i = 0; i <=W; i++) {
            for (int j = 0; j <=H; j++) {
                if (useInfunc11(i,j,n,X,Y,R)){
                   res++;
                }
            }
        }
        System.out.println(res);
    }

    public static boolean useInfunc11(int x,int y,int n,int[] X,int[] Y,int R){
        for (int i = 0; i <n; i++) {
            int distance_pow2 = (x-X[i])*(x-X[i])+(y-Y[i])*(y-Y[i]);
            if (distance_pow2 <= R*R){
//                只要有一个信号塔能够覆盖此点就直接返回，这就就直接避免了范围重复的问题
                return true;
            }
        }
        return false;
    }


}
 