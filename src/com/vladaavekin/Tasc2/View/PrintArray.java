package com.vladaavekin.Tasc2.View;

public class PrintArray {

    public static void printArray (double[][] Array) {

       for (int i = 0; i < Array.length; i++ ) {

           for (int j = 0; j < Array[i].length; j++) {

               System.out.print(Array[i][j] + "\t");

           }
           System.out.println();
       }

    }

}
