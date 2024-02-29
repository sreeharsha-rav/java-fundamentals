package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class TestShape {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        square.calcArea();
        square.calcPerimeter();

        System.out.println("=====================================");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        rectangle.calcArea();
        rectangle.calcPerimeter();

        System.out.println("=====================================");
    }
}
