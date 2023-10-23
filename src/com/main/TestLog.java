package com.main;

import java.util.logging.Logger;

public class TestLog {

    private static final Logger logger = Logger.getLogger(String.valueOf(TestLog.class));
    public static void main(String[] args) {

        Calculator calculator = new Calculator(3, 1);
        int adittion = calculator.sum();
        System.out.println("The result of the sum is: " + adittion);

    }

}
