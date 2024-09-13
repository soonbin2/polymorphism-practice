package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 다형성 주제
        *   여러 종류의 도형을 그릴 수 있는 프로그램을 작성하려고 합니다.
        * 도형에는 원(Circle), 사각형(Rectangle), 삼각형(Triangle)이 있습니다.
        * 각 도형은 그리기(draw)와 넓이(area)를 계산하는 메서드를 가지고 있습니다.
        * 또한, 모든 도형은 공통된 인터페이스를 구현해야 합니다.
        *
        *
        * 1. Shape 인터페이스 - 모든 도형이 구현해야 할 인터페이스를 작성한다.
        * 2. Circle 클래스: Shape 인터페이스를 구현하는 원 클래스입니다. 원의 반지름을 멤버 변수로 가지며,
        * draw와 area 메서드를 구현합니다.
        * 3. Rectangle 클래스: Shape 인터페이스를 구현하는 사각형 클래스입니다. 사각형의 너비와 높이를 멤버 변수로 가지며,
        *  draw와 area 메서드를 구현합니다.
        * 4. Triangle 클래스: Shape 인터페이스를 구현하는 삼각형 클래스입니다. 삼각형의 밑변과 높이를 멤버 변수로 가지며,
        * draw와 area 메서드를 구현합니다.
        * 5. Application 클래스: 사용자로부터 도형의 종류를 입력받습니다. (Options: circle, rectangle, triangle)
          도형 종류에 따라 필요한 매개변수를 입력받습니다.
          원의 경우, 반지름을 입력받습니다.
          사각형의 경우, 너비와 높이를 입력받습니다.
          삼각형의 경우, 밑변과 높이를 입력받습니다.
          입력된 정보를 바탕으로 해당 도형 객체를 생성하고, draw와 area 메서드를 호출하여 결과를 출력합니다.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("도형을 입력하세요. (circle, rectangle, triangle) :");
        String shapeType = scanner.nextLine().toLowerCase();

        Shape shape = null;

        switch (shapeType) {
            case "circle":
                System.out.println("원의 반지름을 입력하세요 : ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case "rectangle":
                System.out.println("사각형의 너비를 입력하세요 : ");
                double width = scanner.nextDouble();
                System.out.println("사각형의 높이를 입력하세요 : ");
                double height = scanner.nextDouble();
                shape = new Rectangle(width, height);
                break;

            case "triangle":
                System.out.println("삼각형의 밑면을 입력하세요 : ");
                double base = scanner.nextDouble();
                System.out.println("삼각형의 높이를 입력하세요 : ");
                double triangleHeight = scanner.nextDouble();
                shape = new Triangle(base, triangleHeight);
                break;

            default:
                System.out.println("도형이 존재하지 않습니다.");
                System.exit(1);
        }

        if (shape != null) {
            shape.draw();
            System.out.println("넓이 : " + shape.area());
        }

        scanner.close();
    }
}


