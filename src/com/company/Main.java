package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main cal = new Main();
        System.out.println(cal.add(3, 4));
        System.out.println(cal.subtract(5, 6));
        System.out.println(cal.multiply(2, 6));
        System.out.println(cal.divide(8, 4));
    }

    public int add (int i, int j) {
        return i + j;
    }
    public int subtract (int i, int j) {
        return i - j;
    }
    public int multiply (int i, int j) {
        return i * j;
    }
    public int divide (int i, int j) {
        return i / j;
    }
}
