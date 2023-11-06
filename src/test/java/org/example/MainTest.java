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
        boolean actual = Main.pwContainsDigit("hallo");
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
        // When
        boolean actual = Main.pwContainsUpperCaseAndLowerCase("HALLO");
        // Then
        assertEquals(expected,actual);
    }
}