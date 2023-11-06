package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    /**
     * @param password  --> prüft ob das PW mindesten 8 Stellen hat.
     * @return          --> gibt bei mindestens 8 Stellen true zurück- bei <8 Stellen false.
     */
    public static boolean isPasswordValidLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * @param password   --> prüft ob das PW Zahlen enthält.
     * @return          --> gibt bei enthaltenen Zahlen true zurück- andernfalls false.
     */

    public static boolean pwContainsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param password      --> prüft on PW Groß/ Kleinbuchstaben enthält
     * @return              --> gibt true bzw false zurück
     */

    public static boolean pwContainsUpperCaseAndLowerCase(String password) {
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowerCase = true;
            }
        }
        return containsUpperCase && containsLowerCase;
    }

    /**
     * @param password      --> prüft eine Liste von häufigen Passwörtern
     * @return              --> gibt true bzw false zurück
     */

    public static boolean isCommonPW(String password) {
        List<String> commonPasswords = Arrays.asList(
                "123456", "password123", "GOD", "hallo"
        );
        return commonPasswords.contains(password);
    }

    /**
     * @param password      --> prüft Passwort auf Sonderzeichen
     * @return              --> gibt true bzw false zurück
     */

    public static boolean isSpecialCharacterPW(String password) {
        String specialCharacter = "!§$%&/()=?_-:.;,¡“¶¢[]<>*+";
        for (char c : password.toCharArray()) {
            if (specialCharacter.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}



