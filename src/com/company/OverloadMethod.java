package com.company;

public interface OverloadMethod {

    static double areaOfACircle(double r) {
        double S = 3.14 * r * r;
        return S;
    }

    static double areaOfACircle(double x, boolean n) {
        double S;
        if (n == true) {
            S = (3.14 * x * x / 4);
        } else {
            S = (x * x) / (3.14 * 4);
        }
        return S;
    }
}