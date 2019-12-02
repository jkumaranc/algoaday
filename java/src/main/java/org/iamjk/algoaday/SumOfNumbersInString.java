package org.iamjk.algoaday;

import java.util.stream.Stream;

/**
 * Given a string str containing alphanumeric characters, calculate sum of all numbers present in the string.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string containing alphanumeric characters.
 * <p>
 * Output:
 * Print the sum of all numbers present in the string.
 * <p>
 * Constraints:
 * 1<=T<=105
 * 1<=length of the string<=105
 * <p>
 * Example:
 * Input:
 * 4
 * 1abc23
 * geeks4geeks
 * 1abc2x30yz67
 * 123abc
 * <p>
 * Output:
 * 24
 * 4
 * 100
 * 123
 * <p>
 * Explanation:
 * Testcase 1: 1 and 23 are numbers in the string which is added to get the sum as 24.
 * Testcase 4: 123 is a single number, so sum is 123.
 * <p>
 * Source : https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0
 */
public class SumOfNumbersInString {

    private static final String NUMERIC_REGEX = "[^0-9]";
    private static final String SPACE = " ";

    Integer sumOfAllNumbersInString(String alphaNumeric) {
        final String[] numericOrSpacesOnly = alphaNumeric.replaceAll(NUMERIC_REGEX, SPACE).split(SPACE);
        return Stream.of(numericOrSpacesOnly).filter(numericOrSpaces -> numericOrSpaces.trim().length() > 0)
                .map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
