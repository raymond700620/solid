package com.xp.solid.openclose;

public class AreaCal {
    Shape s;
    public AreaCal(Shape s) {
        this.s = s;
    }

    //Original code violate the Open-Close Principle
    public double getArea() {
        double result=0;
        if (s instanceof Triangle) {
            result = ((Triangle) s).height*((Triangle) s).width/2;
        }
        else if (s instanceof Circle) {
             result = Math.PI * Math.pow(((Circle) s).diameter,2)/4;
        }

        return result;

        //return s.getArea();

    }

}
