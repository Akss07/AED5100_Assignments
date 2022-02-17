package com.neu.aed.assignment2;

/**
 * Question 2
 */
public class ShapeMain {
    public static void main(String[] args) {
        Triangle t = new Triangle("Triangle","Red",5.00,10.00);
        Triangle ts = new Triangle("Triangle","Orange",10.00);
        System.out.println(t.printShape());
        System.out.println("Area of triangle is " + t.getArea());
        System.out.println("Perimeter of triangle is " + t.getPerimeter());
        System.out.println(ts.printShape());
        System.out.println("Area of triangle when only side is given " + ts.getArea());
        System.out.println("Perimeter of triangle with only side " + ts.getPerimeter());

        Rhombus r = new Rhombus("Rhombus", "Blue",5.00,2.00);
        Rhombus rs = new Rhombus("Rhombus", "Yellow",5.00);
        System.out.println(r.printShape());
        System.out.println("Area of Rhombus is " + r.getArea());
        System.out.println("Perimeter of Rhombus is " + r.getPerimeter());
        System.out.println("*****************");
        System.out.println(rs.printShape());
        System.out.println("Area of Rhombus is " + rs.getArea());
        System.out.println("Perimeter of Rhombus is " + rs.getPerimeter());
    }
}
