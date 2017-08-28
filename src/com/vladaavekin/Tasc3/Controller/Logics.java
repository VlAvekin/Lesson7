package com.vladaavekin.Tasc3.Controller;

import com.vladaavekin.Tasc3.Model.Figure;
import com.vladaavekin.Tasc3.Model.Point;

public class Logics {

    public static double LengthSide(Point A, final Point B) {

        double LengthX;
        double LengthY;
        double Side;

        LengthX = (B.getX() - A.getX()) * (B.getX() - A.getX());
        LengthY = (B.getY() - A.getY()) * (B.getY() - A.getY());

        Side = LengthY + LengthX;

        return Math.sqrt(Side);
    }

    public static void PerimeterCalculator(Figure figure) {

        double AB = LengthSide(figure.getPoint1(), figure.getPoint2());
        double BC = LengthSide(figure.getPoint2(), figure.getPoint3());
        double CA = LengthSide(figure.getPoint3(), figure.getPoint1());

        System.out.println(AB + BC + CA);

    }

}
