package com.vladaavekin.Tasc3;

//  Создать классы Point и Figure. Класс Point должен содержать два
// целочисленных поля и одно строковое поле (координаты x, y и название точки ).
// Создать три свойства с одним методом доступа get. Создать пользовательский
// конструктор, в теле которого проинициализируйте поля значениями аргументов.
// Класс Figure должен содержать конструкторы, которые принимают от 3-х до 5-ти
// аргументов типа Point. Создать два метода: double LengthSide(Point A, Point B),
// который рассчитывает длину стороны многоугольника; void PerimeterCalculator(),
// который рассчитывает периметр многоугольника. Написать программу, которая
// выводит на экран название и периметр многоугольника. (длина стороны находится
// следующим образом – от координат второй точки, отнимаются координаты первой
// точки x = x2 – x1, y = y2 – y1, а потом возводят x и y в квадрат, суммируют, и
// вычисляют корень суммы). Полная формула для нахождение длины стороны :
//

import com.vladaavekin.Tasc3.Controller.Logics;
import com.vladaavekin.Tasc3.Model.Figure;
import com.vladaavekin.Tasc3.Model.Point;

public class Main {

    public static void main(String[] args) {

        Figure figure = new Figure(new Point(0, 0, "A"),
                                   new Point(4, 8, "B"),
                                   new Point(3, 7, "C"));

        double LengthSide1 = Logics.LengthSide(figure.getPoint1(), figure.getPoint2());
        double LengthSide2 = Logics.LengthSide(figure.getPoint2(), figure.getPoint3());
        double LengthSide3 = Logics.LengthSide(figure.getPoint3(), figure.getPoint1());

        System.out.println(LengthSide1);
        System.out.println(LengthSide2);
        System.out.println(LengthSide3);

        Logics.PerimeterCalculator(figure);

    }

}
