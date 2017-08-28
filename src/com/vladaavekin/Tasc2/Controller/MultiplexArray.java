package com.vladaavekin.Tasc2.Controller;

public class MultiplexArray {

    public static double[][] arrayMultiplexNummber(final double[][] array, final int nummber) {

        final double[][] C = new double[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                C[i][j] = array[i][j] * nummber;

            }

        }

        return C;

    }

    public static double[][] arrayMultiplexArray(final double[][] arrayA, final double[][] arrayB) {

        final int x = min(arrayA.length, arrayB.length);
        final int y = min(arrayA[0].length, arrayB[0].length);

        final int max = max(arrayA.length, arrayB.length);

        final double[][] input = new double[x][y];

        double bufer = 0d;

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < input[i].length; j++) {

                for (int k = 0; k < max; k++) {
                    bufer += arrayA[i][k] * arrayB[k][j];
                }

                input[i][j] = bufer;
                bufer = 0;
            }

        }

        return  input;

    }

    private static int min(int a, int b){

        if (a > b) return b;
        else return a;

    }

    private static int max(int a, int b){

        if (a < b) return b;
        else return a;

    }

}
