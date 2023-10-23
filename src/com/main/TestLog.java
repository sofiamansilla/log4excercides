package com.main;

import org.apache.log4j.Logger;

public class TestLog {

    private static final Logger logger = Logger.getLogger(String.valueOf(TestLog.class));
    public static void main(String[] args) {

        Calculator calculator = new Calculator(3, 1);
        int addition = calculator.sum();
        System.out.println("The result of the sum is: " + addition);

        Calculator calculator1 = new Calculator(1,0);
        calculator1.division();




    }

}
