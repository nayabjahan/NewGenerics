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
    public static void maxFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("Maximum Float Value is : " + max);
    }
    public static void maxString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("Maximum String Value is : " + max);
    }
}
