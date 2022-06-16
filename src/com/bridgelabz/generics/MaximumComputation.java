package com.bridgelabz.generics;

public class MaximumComputation {
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

    public static void main(String[] args) {

        System.out.println("----- Welcome To Computing Maximum Of Three Numbers Using Java Generics ------");

        Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
        findMaximum(firstNumber, secondNumber, thirdNumber);

        Float number1 = 12f, number2 = 8f, number3 = 7f;
        findMaximum(number1, number2, number3);

    }


}