package com.blz.generics;

public class Main {
    public static void main(String[] args) {
        MaxData.maxElement(5, 6, 7);
        MaxData.maxElement(8, 10, 4);
        MaxData.maxElement(20, 9, 6);
        System.out.println("");
        MaxData.maxElement(5.4f, 6.7f, 7.9f);
        MaxData.maxElement(8.7f, 10.2f, 4.4f);
        MaxData.maxElement(20.1f, 9.2f, 6.9f);
        System.out.println("");
        MaxData.maxElement("Ajay", "Abhishek", "Arif");
        MaxData.maxElement("Mohammad", "Rajdeep", "Jaydeep");
        MaxData.maxElement("Kaushal", "Jitendra", "Ashkar");
    
    }
}
