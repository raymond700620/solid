package com.xp.solid.opencloseorg;

import java.util.ArrayList;
import java.util.List;

public class AreaCal
{
    List<Shape> shapes = new ArrayList<>();

    public void add(Shape s) {
        shapes.add(s);
    }

    public double getTotalArea() {
        double result = 0;
        for (Shape s: shapes) {
            result += getArea(s);
        }
        return result;
    }

    private double getArea(Shape s) {
        if (s instanceof  Circle) {
            return Math.PI * ((Circle) s).diameter/4;
        }
        else if (s instanceof Triganle){
            return ((Triganle)s).height * ((Triganle)s).width /4;
        }
        else {
            throw new RuntimeException("Unknown Shape");
        }
    }

}
