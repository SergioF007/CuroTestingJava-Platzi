package com.testing.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG

    }

    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        // Generamos una comparacion mediante rangos de letras, de la a a la z o de A a la Z
        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
