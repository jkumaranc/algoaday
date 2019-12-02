package org.iamjk.algoaday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SubArrayWithGivenSumTest {

    @Test
    void subArrayWithGivenSumValidInputs() {
        SubArrayWithGivenSum sumOfNumbersInString = new SubArrayWithGivenSum();
        assertArrayEquals(new int[]{2, 4}, sumOfNumbersInString.findSubArrayIndices(new int[]{1, 2, 3, 7, 5}, 12));
        assertArrayEquals(new int[]{1, 5}, sumOfNumbersInString.findSubArrayIndices(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15));
    }

    @Test
    void subArrayWithGivenSumInvalidInputs() {
        SubArrayWithGivenSum sumOfNumbersInString = new SubArrayWithGivenSum();
        assertArrayEquals(new int[0], sumOfNumbersInString.findSubArrayIndices(new int[]{1, 2, 3, 7, 5, 23}, 100));
        assertArrayEquals(new int[0], sumOfNumbersInString.findSubArrayIndices(new int[]{1, 2, 3, 7, 5, 23}, 16));
        assertArrayEquals(new int[0], sumOfNumbersInString.findSubArrayIndices(new int[]{1, 2, 3, 7, 5, 23}, 0));
    }
}
