package com.xp.solid.openclose;

public class Square implements Shape{
    private int length;
    @Override
    public double getArea() {
        return length*length;
    }
}
