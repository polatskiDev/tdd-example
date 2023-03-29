package com.example.tddexample;

/**
 * @author Orhan Polat
 */
public class StringCalculator {

    public static void add(final String numbers) {
        String [] numArray = numbers.split(",");
        if (numArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma(,) are allowed");
        } else {
            for (String number : numArray) {
                Integer.parseInt(number);
            }
        }
    }
}
