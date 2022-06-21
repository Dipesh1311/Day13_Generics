package com.bridgelabz.generics;

import java.util.Scanner;

public class MaximumComputation {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Integer[] arr1 = new Integer[3];
        Float[] arr2 = new Float[3];
        String[] arr3 = new String[3];

        System.out.println("enter the first integer");
        arr1[0] = scanner.nextInt();
        System.out.println("enter the second integer");
        arr1[1] = scanner.nextInt();
        System.out.println("enter the second integer");
        arr1[2] = scanner.nextInt();

        GenericTestMaximum generictestmaximum = new GenericTestMaximum();

        Integer max= (Integer) generictestmaximum.testIntegerMaximum(arr1[0], arr1[1], arr1[2]);
        System.out.println("maximum of three integers " + arr1[0] + " " + arr1[1] + " " + arr1[2] + " is " + max);

        System.out.println("enter the first float");
        arr2[0]= scanner.nextFloat();
        System.out.println("enter the second float");
        arr2[1]=scanner.nextFloat();
        System.out.println("enter the second float");
        arr2[2]=scanner.nextFloat();

        Float max1= (Float) generictestmaximum.testIntegerMaximum(arr2[0], arr2[1], arr2[2]);
        System.out.println("maximum of three Floats " + arr2[0] + " " + arr2[1] + " " + arr2[2] + " is " + max1);

        System.out.println("enter the first String");
        arr3[0]=scanner.next();
        System.out.println("enter the second String");
        arr3[1]=scanner.next();
        System.out.println("enter the second String");
        arr3[2]=scanner.next();

        String max2= (String) generictestmaximum.testIntegerMaximum(arr3[0], arr3[1], arr3[2]);
        System.out.println("maximum of three String " + arr3[0] + " " + arr3[1] + " " + arr3[2] + " is " + max2);

    }
}