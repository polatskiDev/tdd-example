package com.example.tddexample;

/**
 * @author Orhan Polat
 */
public class StringCalculator {

    public static int add(final String numbers) {
        int num = 0;
        String [] numArray = numbers.split(",");

        for (String number : numArray) {
            if (!number.isBlank())
                num += Integer.parseInt(number);
        }

        return num;
    }
}
