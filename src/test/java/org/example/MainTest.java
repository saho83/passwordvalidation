package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Teste ob PW mindestens 8 Stellen hat
    @Test
    void isPasswordValidLength_Return_True_When_Password_Greater_Than_8() {
        //GIVEN

        boolean expected = true;
        //WHEN
        boolean actual = Main.isPasswordValidLength("12345678");
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void isPasswordValidLength_Return_false_When_Password_Smaller_Than_8() {
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.isPasswordValidLength("1234");
        //THEN
        assertEquals(expected,actual);
    }

    // Teste ob PW Zahlen enthält
    @Test
    void pwContainsDigit_Return_true_When_Password_contains_Digit() {
        //GIVEN
        boolean expected = true;
        //WHEN
        boolean actual = Main.pwContainsDigit("hallo1");
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void pwContainsDigit_Return_false_When_Password_contains_Digit() {
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.pwContainsDigit("hallo");
        //THEN
        assertEquals(expected, actual);

    }

    // Teste ob PW Groß und Kleinbuchstaben enthält
    @Test
    void pwContainsUpperCaseAndLowerCase_Return_true_When_Password_contains_Upper_Lower_Case() {
        // Given
        boolean expected = true;
        // When
        boolean actual = Main.pwContainsUpperCaseAndLowerCase("Hallo");
        // Then
        assertEquals(expected,actual);
    }

    @Test
    void pwContainsUpperCaseAndLowerCase_Return_false_When_Password_contains_Lower_Case() {
        // Given
        boolean expected = false;
        // When
        boolean actual = Main.pwContainsUpperCaseAndLowerCase("hallo");
        // Then
        assertEquals(expected,actual);
    }

    @Test
    void pwContainsUpperCaseAndLowerCase_Return_false_When_Password_contains_Upper_Case() {
        // Given
        boolean expected = false;
        // WHEN
        boolean actual = Main.pwContainsUpperCaseAndLowerCase("HALLO");
        // THEN
        assertEquals(expected,actual);
    }

    // Teste ob PW ein "einfaches" passwort ist
    @Test
    void isCommonPW_Return_true_When_Password_in_PWList() {
        // GIVEN
        boolean expected = true;
        // WHEN
        boolean actual = Main.isCommonPW("hallo");
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void isCommonPW_Return_false_When_Password_not_in_PWList() {
        // GIVEN
        boolean expected = false;
        // WHEN
        boolean actual = Main.isCommonPW("Nicht in List");
        //THEN
        assertEquals(expected,actual);
    }


    // Teste ob PW Sonderzeichen enthält
    @Test
    void isSpecialCharacterPW_Return_true_When_Password_contains_special_Character() {
        //GIVEN
        boolean expected = true;
        // WHEN
        boolean actual = Main.isSpecialCharacterPW("hallo%");
        //THEN
        assertEquals(expected, actual);
    }


    @Test
    void isSpecialCharacterPW_Return_false_When_Password_didnt_contains_special_Character() {
        //GIVEN
        boolean expected = false;
        // WHEN
        boolean actual = Main.isSpecialCharacterPW("hallo");
        //THEN
        assertEquals(expected, actual);
    }










}