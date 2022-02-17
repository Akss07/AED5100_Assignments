package com.neu.aed.assignment2;

/**
 * Question 2
 */
public class Rhombus extends Shape{
    private double d1;
    private double d2;

    public Rhombus(String name, String color, double d1, double d2) {
        super(name, color);
        this.d1 = d1;
        this.d2 = d2;
    }

    /**
     * @param name
     * @param color
     * @param d1
     * considering both diagonals are equal
     */
    public Rhombus(String name, String color, double d1) {
        super(name, color);
        this.d1 = d1;
        this.d2 = d1;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    @Override
    public double getArea() {
        double area = (d1 * d2)/2;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2)));
        return perimeter;
    }
}
