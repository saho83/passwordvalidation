package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        // Nutzereingabe über die länge des gewünschten Passwortes
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie lang soll ihr Passwort sein?");

        // Speichert die gewünschte Länge in einen String
        int passwordLength = scan.nextInt();


        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;':,.<>?";

        // Speichert das generierte PW in einen String
        String generatedPassword = generateRandomString(passwordLength, charset);
        System.out.println("Zufällig generierter String: " + generatedPassword);

        // prüft das generierte Passwort auf die Methoden
        if (isPasswordValidLength(generatedPassword) && pwContainsDigit(generatedPassword) &&
                pwContainsUpperCaseAndLowerCase(generatedPassword) && !isCommonPW(generatedPassword) &&
                isSpecialCharacterPW(generatedPassword)) {
            System.out.println("Das generierte Passwort erfüllt alle Anforderungen.");
        } else {
            System.out.println("Das generierte Passwort erfüllt nicht alle Anforderungen.");
        }

    }



        /**
         * @param password --> prüft ob das PW mindesten 8 Stellen hat.
         * @return --> gibt bei mindestens 8 Stellen true zurück- bei <8 Stellen false.
         */
        public static boolean isPasswordValidLength(String password) {
            return password.length() >= 8;
        }


        /**
         * @param password --> prüft ob das PW Zahlen enthält.
         * @return --> gibt bei enthaltenen Zahlen true zurück- andernfalls false.
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
         * @param password --> prüft on PW Groß/ Kleinbuchstaben enthält
         * @return --> gibt true bzw false zurück
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
         * @param password --> prüft eine Liste von häufigen Passwörtern
         * @return --> gibt true bzw false zurück
         */
        public static boolean isCommonPW(String password) {
            List<String> commonPasswords = Arrays.asList(
                    "123456", "password123", "GOD", "hallo"
            );
            return commonPasswords.contains(password);
        }


        /**
         * @param password --> prüft Passwort auf Sonderzeichen
         * @return --> gibt true bzw false zurück
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

         /**
         *
         * @param length        --> nimmt die eingegeben Länge des passworts entgegen
         * @param charset       --> nimt die Zeichenfolge entgegen
         * @return              --> gibt den zufällig generierten String aus
         */
         public static String generateRandomString(int length, String charset) {
            Random random = new Random();
            StringBuilder randomString = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(charset.length());
                char randomChar = charset.charAt(randomIndex);
                randomString.append(randomChar);
            }
            return randomString.toString();
        }





}



