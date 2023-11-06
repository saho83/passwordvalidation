package org.example;

import javax.xml.stream.events.Characters;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    /**
     *
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
     *
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
     *
     * @param password      --> prüft on PW Groß/ Kleinbuchstaben enthält
     * @return              --> gibt true bzw false aus
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








}


