package com.example.tddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Orhan Polat
 */
public class StringCalculatorTest {

    @Test
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown(){
        Assertions.assertThrows(RuntimeException.class, () -> StringCalculator.add("1,2,3"));
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assertions.assertTrue(true);
    }

    @Test
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        Assertions.assertThrows(RuntimeException.class, () -> StringCalculator.add("1,X"));
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assertions.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public final void whenOneNumberIsUsedThenReturnValuesIsThatSameNumber() {
        Assertions.assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assertions.assertEquals(3 + 6, StringCalculator.add("3,6"));
    }
}
