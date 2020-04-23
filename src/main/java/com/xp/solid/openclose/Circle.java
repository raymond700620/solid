package com.xp.solid.openclose;

public class Circle implements  Shape{
    int diameter;

    @Override
    public double getArea() {
        return Math.PI*Math.pow(diameter,2)/4;
    }
}
