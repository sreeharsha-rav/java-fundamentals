package com.shape;

public class Square implements Polygon {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calcArea() {
        System.out.println("Area of Square: " + (side * side));
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
