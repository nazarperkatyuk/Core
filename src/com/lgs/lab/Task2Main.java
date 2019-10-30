package com.lgs.lab;
import com.lgs.lab.interface2.MyCalculator;

public class Task2Main {

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        double a = 5;
        double b = 20;

        System.out.println(String.format(" %s / %s = %s", a, b, myCalculator.divide(a, b)));
        System.out.println(String.format(" %s * %s = %s", a, b, myCalculator.multiply(a, b)));
        System.out.println(String.format(" %s + %s = %s", a, b, myCalculator.plus(a, b)));
        System.out.println(String.format(" %s - %s = %s", a, b, myCalculator.minus(a, b)));


    }
}

