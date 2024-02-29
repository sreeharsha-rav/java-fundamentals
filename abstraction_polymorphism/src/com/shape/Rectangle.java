package com.shape;

public class Rectangle implements Polygon {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calcArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
    }
}
