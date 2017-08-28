package com.vladaavekin.Tasc3.Model;

public class Point {

    private int x;

    private int y;

    private String Name;

    public Point(final int x, final int y, final String name) {
        this.x = x;
        this.y = y;
        Name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return Name;
    }
}
