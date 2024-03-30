package com.gt.HomeWork03;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2024/3/29 18:12
 */
public class Rectangle {

    public double height;
    public double width;

    public double per;

    public double area;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.per = getPer();
        this.area = getArea();
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
        System.out.println("rectangleWidth = " + rectangle.width);
        System.out.println("rectangleHeight = " + rectangle.height);
        System.out.println("rectanglePer = " + rectangle.per);
        System.out.println("rectangleArea = " + rectangle.area);
    }
}
