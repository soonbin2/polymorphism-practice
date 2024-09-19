package com.ohgiraffers.practice;

import java.util.Scanner;

public class practice {

        private Scanner scanner;

        public practice() {
            scanner = new Scanner(System.in);
        }

        public void run() {
            Shape shape = createShape();
            if (shape != null) {
                shape.draw();
                System.out.println("면적: " + shape.area());
            }
            scanner.close();
        }

        private Shape createShape() {
            System.out.print("도형의 종류를 입력하세요 (circle, rectangle, triangle): ");
            String shapeType = scanner.nextLine();

            switch (shapeType.toLowerCase()) {
                case "circle":
                    return createCircle();
                case "rectangle":
                    return createRectangle();
                case "triangle":
                    return createTriangle();
                default:
                    System.out.println("잘못된 도형 종류입니다.");
                    return null;
            }
        }

        private Circle createCircle() {
            System.out.print("반지름을 입력하세요: ");
            double radius = scanner.nextDouble();
            return new Circle(radius);
        }

        private Rectangle createRectangle() {
            System.out.print("너비를 입력하세요: ");
            double width = scanner.nextDouble();
            System.out.print("높이를 입력하세요: ");
            double height = scanner.nextDouble();
            return new Rectangle(width, height);
        }

        private Triangle createTriangle() {
            System.out.print("밑변을 입력하세요: ");
            double base = scanner.nextDouble();
            System.out.print("높이를 입력하세요: ");
            double height = scanner.nextDouble();
            return new Triangle(base, height);
        }

    }
