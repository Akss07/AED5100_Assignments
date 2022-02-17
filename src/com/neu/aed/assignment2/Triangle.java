package com.neu.aed.assignment2;

/**
 * Question 2
 */
public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }
    public Triangle(String name, String color,double side){
        super(name, color);
        this.base = side;
    }
    //getters and setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Considering right angle triangle, If base and height is given
     * Considering equilateral triangle, if only base is given
     * @return area
     */
    @Override
    public double getArea() {
        double area;
        if(height!= 0.0){
            area = (base * height) / 2;
        }else{
            area = (Math.sqrt(3) / 4)* Math.pow(base, 2);
        }
        return area;
    }

    /**
     * Considering right angle triangle, If base and height is given
     * Considering equilateral triangle, if only base is given
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        double perimeter;
        if(height!=0.0){
            double hypotenuse = calculateHypotenuse(base, height);
            perimeter = base + height + hypotenuse;
        }else{
            perimeter = 3 * base;
        }
        return perimeter;
    }

    private double calculateHypotenuse(double base, double height){
        double hypotenuse = Math.sqrt(Math.pow(base,2) + Math.pow(height, 2));
        return hypotenuse;
    }
}
