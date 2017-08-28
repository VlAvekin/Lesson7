package com.vladaavekin.Tasc2.Controller;

public class SumArray {

    public static double[][] arraySumNummber(final double[][] array, final int nummber) {

       final double[][] C = new double[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                C[i][j] = array[i][j] + nummber;

            }

        }

        return C;

    }

}
