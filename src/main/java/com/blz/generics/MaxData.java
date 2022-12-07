package com.blz.generics;

public class MaxData{
    public static void maxElement(Integer a,Integer b,Integer c){
        Integer max = a;
        if(b.compareTo(max) > 0)
            max = b;
        if(c.compareTo(max) > 0)
            max = c;
        System.out.println("maximum value is :"+ max);

    }
}
