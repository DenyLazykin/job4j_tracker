package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!upperCaseValidate(password) || !lowerCaseValidate(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter "
                    + "and lowercase letter");
        }
        if (!charIsDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!charIsSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (subString(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, "
                    + "12345, "
                    + "password, "
                    + "admin, "
                    + "user");
        }
        return password;
    }

    private static boolean upperCaseValidate(String password) {
        char[] array = password.toCharArray();
        for (char a : array) {
            if (Character.isUpperCase(a) && !Character.isDigit(a)) {
                return true;
            }
        }
        return false;
    }

    private static boolean lowerCaseValidate(String password) {
        char[] array = password.toCharArray();
        for (char a : array) {
            if (Character.isLowerCase(a) && !Character.isDigit(a)) {
                return true;
            }
        }
        return false;
    }

    private static boolean charIsDigit(String password) {
        char[] array = password.toCharArray();
        for (char a : array) {
            if (Character.isDigit(a)) {
                return true;
            }
        }
        return false;
    }

    private static boolean charIsSpecialSymbol(String password) {
        String charSpecialSymbol = "/*!@#$%^&*()\\\"{}_[]|\\\\?/<>,.";
        for (int i = 0; i < password.length(); i++) {
            String[] symbol = password.split("");
            if (charSpecialSymbol.contains(symbol[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean subString(String password) {
        String[] subStrings = new String[]{
                "qwerty", "12345", "password", "user", "admin"
        };
        for (String s : subStrings) {
            if (password.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }
}