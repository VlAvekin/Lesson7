package com.vladaavekin.Tasc2.Model;

public class Array {

    private int x;

    private int y;

    private double[][] Array;

    public Array(double[][] array) {
        Array = array;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double[][] getArray() {
        return Array;
    }

}
