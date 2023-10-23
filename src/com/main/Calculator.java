package com.main;

import org.apache.log4j.Logger;

public class Calculator {

    private static final Logger logger = Logger.getLogger(String.valueOf(Calculator.class));
    private int value1;
    private int value2;

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int sum() {
        return value1 + value2;
    }

    public int substract() {
        return value1 - value2;
    }

    public int multiplication() {
        return value1 * value2;
    }

    public double division() {
        logger.info("Let's start dividing " + value1 + "/" + value2);
        double result;
        try {
            result = value1 / value2;
        } catch (Exception e) {
            logger.error("An error ocurred while dividing: ", e);
            return 0;
        }
        logger.debug("The division has been completed");
        return result;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
};

