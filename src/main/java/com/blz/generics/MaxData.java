package com.blz.generics;

public class MaxData {
    public static <T extends Comparable <T>> void maxElement(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("Maximum Integer Value is : " + max);
    }}