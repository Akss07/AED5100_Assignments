package com.neu.aed.assignment2;

/**
 * Question 3
 */
public class Circle extends ShapeClass{
    private double radius;
    static final double PI_VALUE = 3.14;

    public Circle(){}

    public Circle(double radius){
        this.radius =radius;
    }

    public void computeArea(){
        setArea(PI_VALUE * (Math.pow(radius,2)));
    }

    public void computePerimeter(){
        setPerimeter(2 * PI_VALUE * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
