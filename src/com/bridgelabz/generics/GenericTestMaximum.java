package com.bridgelabz.generics;

public class GenericTestMaximum <T extends Comparable<T>> {
    public <T extends Comparable<T>> T testIntegerMaximum(T ...n) {
        Integer i=0;
        T max=n[i];
        for(T data:n){
            if(n[i].compareTo(max)>0){
                max=n[i];
            }
            i++;
        }
        return max;

    }
}
