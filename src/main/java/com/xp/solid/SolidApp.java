package com.xp.solid;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xp.solid.liskov.Rectangle;
import com.xp.solid.liskov.Square;
import com.xp.solid.singleresponsility.Account;
import com.xp.solid.singleresponsility.AccountManager;


public class SolidApp {
    public static void main(String[] argv) throws Exception {
        System.out.println("=====>Solid Explanation:");

        //1. Single responsibility

//        AccountManager am = new AccountManager();
//        Account a = am.getAccount(1);
//        //I want to get JSON format
//        ObjectMapper om = new ObjectMapper();
//        System.out.println("=====>"+om.writeValueAsString(a));
//
//        //I want to get XML format
//        XmlMapper xmlMapper = new XmlMapper();
//        System.out.println("=====>"+ xmlMapper.writeValueAsString(a));

        //2.Violation of Liskov
        //Solution:
        // if Rectangle is mutable? or if both Rectangle and Square implement a interface ==> Model behaviour
        Square s = new Square();
        System.out.println("=====>"+calRectangle(s));

    }

    //Run the app via -ea to enable the asset
    static double calRectangle(Rectangle r) {
        r.setHeight(3);
        r.setWidth(2);
        double result = r.getArea();
        assert r.getArea() == 6 : "area is wrong";
        return result;
    }

}
