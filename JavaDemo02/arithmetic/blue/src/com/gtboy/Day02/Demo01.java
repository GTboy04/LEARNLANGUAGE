package com.gtboy.Day02;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/12/1 10:49
 */
import java.util.Scanner;

public class Demo01 {

    static int w,h,r,n;
    static int X[]=new int[110];
    static int Y[]=new int[110];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res=0;
        w=sc.nextInt();
        h=sc.nextInt();
        n=sc.nextInt();
        r=sc.nextInt();
        for(int i=0;i<n;i++){
            X[i]=sc.nextInt();
            Y[i]=sc.nextInt();
        }
        for(int i=0;i<=w;i++){
            for(int j=0;j<=h;j++){
                if((check(i,j))==true){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
    //判断在圆上 圆内还是园外
    public static boolean check(int x,int y){
        for(int i=0;i<n;i++) {
            int t1 = x - X[i];
            int t2=y-Y[i];
            if(t1*t1+t2*t2<=r*r)
                return true;
        }
        return false;
    }
}
