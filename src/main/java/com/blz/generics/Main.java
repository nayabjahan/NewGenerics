package com.blz.generics;

public class Main {
    public static void main(String[] args) {
        new MaxData(5, 6, 7).maxElement();
        System.out.println("");
        new MaxData(5.4f, 6.7f, 7.9f).maxElement();
        System.out.println("");
        new MaxData("Ajay", "Abhishek", "Arif").maxElement();
    }
}
