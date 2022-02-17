package com.neu.aed.assignment2;

/**
 * Question 3, Create a Shape class and a subclass Rectangle, Circle
 * changed the name of class Shape -> ShapeClass
 */
public class ShapeClass {
    private String name;
    private double area;
    private double perimeter;

    public ShapeClass(){}

    public void display(){
        System.out.println("Area of " + this.getName() + " is " + this.getArea());
        System.out.println("Perimeter of " + this.getName() + " is " + this.getPerimeter());
    }
     // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

}
