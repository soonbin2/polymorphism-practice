package com.ohgiraffers.practice;

public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public void draw() {
        System.out.println("삼각형을 그렸고 삼각형의 밑변은 " +base +"이고 높이는 " + height+"입니다.");
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
