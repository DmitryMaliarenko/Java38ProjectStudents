package com.company;

public interface IsPrime {
    static boolean isPrime(int x) {
        if (x < 2)
            return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
