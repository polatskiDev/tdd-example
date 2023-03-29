package com.example.tddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Orhan Polat
 */
public class StringCalculatorTest {

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

    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assertions.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
    }

    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAsTheirSums() {
        Assertions.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
    }

    @Test
    public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
        Assertions.assertEquals(3+6+15, StringCalculator.add("//;n3;6;15"));
    }
}
