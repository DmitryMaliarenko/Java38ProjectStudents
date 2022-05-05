package com.company;

import java.util.Arrays;

public interface EqualsMethods {
    static boolean equalsMethod(String str1, String str2) {
        int lenght1 = str1.length();
        int lenght2 = str2.length();
        char[] strF1 = new char[5];
        char[] strF2 = new char[5];
        str1.getChars((lenght1 - 5), lenght1, strF1, 0);
        str2.getChars((lenght2 - 5), lenght2, strF2, 0);
        boolean result = Arrays.equals(strF1, strF2);
        if (lenght1 > 4 && lenght2 > 4 && result == true) {
            return true;
        }
        return false;
    }

    static boolean equalsIgnoreCaseMethod(String str1, String str2) {
        int lenght1 = str1.length();
        int lenght2 = str2.length();
        char[] strF1 = new char[5];
        char[] strF2 = new char[5];
        str1.getChars((lenght1 - 5), lenght1, strF1, 0);
        str2.getChars((lenght2 - 5), lenght2, strF2, 0);
        String strI1 = new String(strF1);
        String strI2 = new String(strF2);
        boolean result = strI1.equalsIgnoreCase(strI2);
        if (lenght1 > 4 && lenght2 > 4 && result == true) {
            return true;
        }
        return false;
    }
}

