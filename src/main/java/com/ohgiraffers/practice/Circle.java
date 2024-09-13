package com.ohgiraffers.practice;

public class Circle implements Shape{
    private double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그렸고 원의 반지름은  " + radius+ "입니다.");
    }

    @Override
    public double area() {
        return Math.PI *radius *radius;
    }
}
