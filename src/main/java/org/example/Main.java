package org.example;

import javax.xml.stream.events.Characters;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    /**
     *
     * @param pwLength  --> prüft ob das PW mindesten 8 Stellen hat.
     * @return          --> gibt bei mindestens 8 Stellen true zurück- bei <8 Stellen false.
     */
    public static boolean isPasswordValidLength(String pwLength) {
        if (pwLength.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }


    /**
     *
     * @param pwDigit   --> prüft ob das PW Zahlen enthält.
     * @return          --> gibt bei enthaltenen Zahlen true zurück- andernfalls false.
     */

    public static boolean pwContainsDigit(String pwDigit) {
        for (char c : pwDigit.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }





}


