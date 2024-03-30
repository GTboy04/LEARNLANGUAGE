package com.gt.HomeWork03.Simple;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2024/3/29 18:12
 */
public class Rectangle {

    public double height;
    public double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double getPer() {
        return (height+width)*2;
    }

    private double getArea() {
        return height*width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("rectangle.getHeight() = " + rectangle.getHeight());
        System.out.println("rectangle.getWidth() = " + rectangle.getWidth());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        System.out.println("rectangle.getPer() = " + rectangle.getPer());
    }
}
