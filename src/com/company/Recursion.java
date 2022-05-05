package com.company;

public interface Recursion {
    static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return n + " " + recursion(n - 1);
    }
}
