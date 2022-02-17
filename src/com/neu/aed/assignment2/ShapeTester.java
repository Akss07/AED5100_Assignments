package com.neu.aed.assignment2;

/**
 * Question 3
 */
public class ShapeTester {
    public static void main(String[] args) {
        ShapeClass s = new ShapeClass();
        Rectangle r = new Rectangle(2.0,3.0);
        Circle c = new Circle(4.0);
         r.setName("Rectangle");
         c.setName("Circle");
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}
