package com.ohgiraffers.practice;

public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width =width;
        this.height=height;
    }


    @Override
    public void draw() {
        System.out.println("사각형을 그렸고 사각형의 너비는 " + width + "이고 높이는 " + height + "입니다.");
    }

    @Override
    public double area() {
        return width * height;
    }
}
