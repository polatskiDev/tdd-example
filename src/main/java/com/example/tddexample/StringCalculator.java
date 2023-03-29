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
            int delimiterIndex = numbers.indexOf("//") + 3;
            delimiter = numbers.substring(delimiterIndex, numbers.indexOf("]"));
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
                } else if (tempNum<= 1000)
                    num += tempNum;
            }
        }

        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers);
        }

        return num;
    }
}
