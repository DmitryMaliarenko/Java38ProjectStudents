package com.company.util;

import com.company.exception.WrongPasswordException;

public class PasswordUtil {
    public static boolean checkPassword(StringBuilder password, StringBuilder confirmPassword) {
        boolean x = true;
        try {
            checkPasswordException(password);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            x = false;
        }
        try {
            checkConfirmPasswordException(password, confirmPassword);
        } catch (WrongPasswordException e) {
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

    private static void checkPasswordException(StringBuilder password)
            throws WrongPasswordException {
        String passwordStr = String.valueOf(password);
        boolean onlyLatinABC = passwordStr.matches("^[a-zA-Z0-9_a-zA-Z0-9]+$");
        if (onlyLatinABC && password.length() < 20) {
        } else {
            throw new WrongPasswordException();
        }
    }

    private static void checkConfirmPasswordException(StringBuilder password, StringBuilder confirmPassword)
            throws WrongPasswordException {
        String passwordStr = String.valueOf(password);
        String confirmPasswordStr = String.valueOf(confirmPassword);
        if (passwordStr.equals(confirmPasswordStr)) {
        } else {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}
