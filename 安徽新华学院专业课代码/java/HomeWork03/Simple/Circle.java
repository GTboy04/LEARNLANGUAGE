package com.gt.HomeWork03.Simple;


public class Circle {
    public static final double PI = 3.14;
    public double r;

    public Circle(double r) {
        this.r = r;
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


    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("circle.getR() = " + circle.getR());
        System.out.println("circle.getPer() = " + circle.getPer());
        System.out.println("circle.getArea() = " + circle.getArea());
    }
}
