package com.main;

public class Calculator {

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
        return value1 + value2;
    }

    public int multiplication() {
        return value1 + value2;
    }

    public int divition() {
        return value1 + value2;
    }

}
