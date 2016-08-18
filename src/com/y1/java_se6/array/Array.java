package com.y1.java_se6.array;

public class Array {

    public static void array1 () {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] tmp1 = arr1;
        int[] tmp2 = arr1;

        System.out.println("=============[1]=============");
        System.out.print("tmp1：");
        for(int i = 0; i < tmp1.length; i++)
            System.out.print(tmp1[i] + " ");

        System.out.print("\ntmp2：");
        for(int i = 0; i < tmp2.length; i++)
            System.out.print(tmp2[i] + " ");

        tmp1[2] = 9;
        System.out.print("\ntmp1：");
        for(int i = 0; i < tmp1.length; i++)
            System.out.print(tmp1[i] + " ");

        System.out.print("\ntmp2：");
        for(int i = 0; i < tmp2.length; i++)
            System.out.print(tmp2[i] + " ");
        System.out.println();
    }
}
