package com.xp.solid.openclose;

import java.util.List;

public class AreaCal {
    List<Shape> shapes;
    public void addShape(Shape s) {
        shapes.add(s);
    }


    public double getTotalArea() {
        double result=0;
        for (Shape s: shapes) {
            result += s.getArea();
        }
        return result;

    }

}
