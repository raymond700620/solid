package com.xp.solid.openclose;

public class AreaCal {
    Shape s;
    public AreaCal(Shape s) {
        this.s = s;
    }

    public int getArea() {
//        if (s instanceof  Square) {
//            //s.len*s.width
//
//        }
//        else if (s instanceof Circle) {
//            //pi*r square
//        }
        return s.getArea();

    }

}
