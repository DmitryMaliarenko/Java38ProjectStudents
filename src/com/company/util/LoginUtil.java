package com.company.util;

import com.company.exception.WrongLoginException;

public class LoginUtil {
    public static boolean checkLogin(StringBuilder login) {
        boolean x = true;
        try {
            checkLoginException(login);
        } catch (WrongLoginException e) {
            e.printStackTrace();
            x = false;
        } finally {
            if (x) {
                return true;
            } else {
                return false;
            }

        }
    }

    private static void checkLoginException(StringBuilder login) throws WrongLoginException {
        String loginStr = String.valueOf(login);
        boolean onlyLatinABC = loginStr.matches("^[a-zA-Z0-9_a-zA-Z0-9]+$");
        if (onlyLatinABC) {
        } else {
            throw new WrongLoginException();
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Превышено количеств символоов!");
        }
    }
}
