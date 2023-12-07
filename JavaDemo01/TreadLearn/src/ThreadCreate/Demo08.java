package ThreadCreate;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/27 19:10
 */
public class Demo08 {
    public static void main(String[] args) {
//        func2();
//        func03();
        func04();
    }

    /**
     * 三角形和
     */
    public static void func01(){
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        double a;
        double b;
        double c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
//        System.out.printf("%f,%f,%f",a,b,c);
        double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.2f",S);

        scan.close();
    }

    /**
     *
     */
    public static void func02(){
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int month;
        int day;
        int temp = 0;
        month =  scan.nextInt();
        day = scan.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                temp = 31;
                break;
            case 11:
            case 4:
            case 6:
            case 9:
                temp = 30;
                break;
            case 2:
                temp = 28;
        }

        if (day <= temp){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        scan.close();
    }

    public static void func03(){
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int month;
        month =  scan.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 11:
            case 4:
            case 6:
            case 9:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
        }
        scan.close();
    }

    public static void func04(){
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = scan.nextInt();
        for (int j = 0; j < i; j++) {
            list.add(scan.nextInt());
        }
        System.out.println(list);
        int maxGap = 0;
        int temp = 0;
        for (int j = 0; j < list.size()-1; j++) {
                temp = list.get(j+1)-list.get(j);
                if(temp >= maxGap){
                    maxGap = temp;
                }
        }

        System.out.println(maxGap);
        scan.close();
    }


}
