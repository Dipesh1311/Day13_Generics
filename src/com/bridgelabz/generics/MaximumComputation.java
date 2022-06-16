package com.bridgelabz.generics;

import java.util.Scanner;

public class MaximumComputation {
    static Scanner scanner = new Scanner(System.in);

    public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }


    public static void findMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }
    public static String testStringMaximum(String x, String y, String z) {
        String max=x;
        if (y.compareTo(max) > 0) {
            max=y;
        }
        if (z.compareTo(max)>0) {
            max=z;
        }
        return max;

    }

    public static void main(String[] args) {

        System.out.println("----- Welcome To Computing Maximum Of Three Numbers Using Java Generics ------");

        Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
        findMaximum(firstNumber, secondNumber, thirdNumber);

        Float number1 = 12f, number2 = 8f, number3 = 7f;
        findMaximum(number1, number2, number3);

        String[] arr3 = new String[3];
        System.out.println("enter the first String");
        arr3[0]=scanner.next();
        System.out.println("enter the second String");
        arr3[1]=scanner.next();
        System.out.println("enter the second String");
        arr3[2]=scanner.next();

        String max2 = testStringMaximum(arr3[0], arr3[1], arr3[2]);
        System.out.println("maximum of three integers " + arr3[0] + " " + arr3[1] + " " + arr3[2] + " is " + max2);

    }


}