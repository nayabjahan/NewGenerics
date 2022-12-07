package com.blz.generics;

public class MaxData <T extends Comparable<T>> {
    T max, a, b, c;
    MaxData(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void maxElement() {
        max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("Maximum Integer Value is : " + max);
    }
}