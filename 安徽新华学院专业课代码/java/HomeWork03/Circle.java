package com.gt.HomeWork03;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2024/3/29 18:20
 */
public class Circle {
    public static final double PI = 3.14;
    public double r;
    
    public double per;
    
    public double area;

    public Circle(double r) {
        this.r = r;
        this.per = getPer();
        this.area = getArea();
    }

    public double getR() {
        return r;
    }

    private double getPer() {
        return 2*r*PI;
    }

    private double getArea() {
        return PI*Math.pow(r,2);
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", per=" + per +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("circleR = " + circle.r);
        System.out.println("circlePer = " + circle.per);
        System.out.println("circleArea = " + circle.area);
        System.out.println("circle.toString() = " + circle.toString());
    }
}
