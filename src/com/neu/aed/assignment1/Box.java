package com.neu.aed.assignment1;

/**
 * Implement a class Box
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    // calling below method from Main class
    public double volume(Box box){
        double volume = 0.0;
        volume = box.getWidth() * box.getHeight() * box.getDepth();
        return volume;
     }
}
