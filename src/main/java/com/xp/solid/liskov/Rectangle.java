package com.xp.solid.liskov;

public class Rectangle {
    private double height;
    private double width;

    public double getArea() {
        return height*width;
    };

    public void setHeight(double height) {
        this.height = height;
    };
    public void setWidth(double width){
        this.width = width;
    };
}