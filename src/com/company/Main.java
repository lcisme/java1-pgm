package com.company;



public class Main {

    public static void main(String[] args) {
    Complex so1 = new Complex(4.2,2.4);
    Complex so2 = new Complex(7.8,2.3);
        System.out.println("Bài làm là");
        System.out.println("ADD \n"+so1.toString(so1.add(so2)));
        System.out.println("SUBTRACT \n"+so1.toString(so1.subtract(so2)));
        System.out.println("MULTIPLY \n"+so1.toString(so1.multiply(so2)));
        System.out.println("DIVIDE \n"+so1.toString(so1.divide(so2)));
    }
}
