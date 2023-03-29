package com.example.tddexample;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> negativeNumbers = new ArrayList<>();
        for (String number : numArray) {
            if (!number.isBlank()) {
                int tempNum = Integer.parseInt(number.strip());

                if (tempNum < 0) {
                    negativeNumbers.add(tempNum);
                }
                num += tempNum;
            }
        }

        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers);
        }

        return num;
    }
}
