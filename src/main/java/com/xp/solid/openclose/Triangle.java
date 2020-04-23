package com.xp.solid.openclose;

public class Triangle implements  Shape {

    int height;
    int width;

    @Override
    public double getArea() {
        return height*width/2;
    }
}
