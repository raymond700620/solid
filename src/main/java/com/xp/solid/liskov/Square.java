package com.xp.solid.liskov;

public class Square extends Rectangle {
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}