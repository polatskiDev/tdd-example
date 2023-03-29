package com.example.tddexample;

/**
 * @author Orhan Polat
 */
public class StringCalculator {

    public static int add(final String numbers) {
        String delimiter = ",|n";
        String numbersWithoutDelimiter = numbers;
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
        }
        return add(numbersWithoutDelimiter,delimiter);
    }

    private static int add(String numbersWithoutDelimiter, String delimiter) {
        int num = 0;
        String [] numArray = numbersWithoutDelimiter.split(delimiter);
        for (String number : numArray) {
            if (!number.isBlank())
                num += Integer.parseInt(number);
        }

        return num;
    }
}
