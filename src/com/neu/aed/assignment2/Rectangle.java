package com.neu.aed.assignment2;

/**
 * Question 3
 */
public class Rectangle extends ShapeClass{
    private double length;
    private double width;

    public Rectangle(){}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void computeArea(){
        setArea(length * width);
    }

    public void computePerimeter(){
        setPerimeter(2 * (length + width));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
