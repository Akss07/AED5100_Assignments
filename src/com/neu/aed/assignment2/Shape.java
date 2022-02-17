package com.neu.aed.assignment2;

/**
 * Question 2, Create a Shape class and a subclass triangle, rhombus
 */
public class Shape {
    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String printShape(){
        String printShape = " Shape is " + this.getName() + " and color is " + this.getColor();
        return printShape;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
