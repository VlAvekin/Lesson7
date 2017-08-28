package com.vladaavekin.Tasc2;

import com.vladaavekin.Tasc2.Controller.MultiplexArray;
import com.vladaavekin.Tasc2.Controller.SumArray;
import com.vladaavekin.Tasc2.Model.Array;
import com.vladaavekin.Tasc2.View.PrintArray;

public class Start {

    public static void main(String[] args) {

        double[][] A = {{1, 2, 2},
                        {0, 3, 1},
                        {1, 0, 0}};

        Array array = new Array(A);

        //PrintArray.printArray(array.getArray());
        //System.out.println();

        //PrintArray.printArray(SumArray.arraySumNummber(array.getArray(), 1));
        //System.out.println();

        //PrintArray.printArray(array.getArray());

        double[][] a = {{1, 2, 2},
                        {0, 3, 1}};

        double[][] b = {{1, 2},
                        {0, 3},
                        {1, 0}};

        System.out.println();

        PrintArray.printArray(a);
        System.out.println();
        PrintArray.printArray(b);
        System.out.println();

        PrintArray.printArray(MultiplexArray.arrayMultiplexArray(a, b));



    }

}
