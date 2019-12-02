package org.iamjk.algoaday;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfNumbersInStringTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void sumOfAllNumbersInString() {
        SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
        String[] inputs = {"4", "1abc23", "geeks4geeks", "1abc2x30yz67", "123abc"};
        Integer[] outputs = {4, 24, 4, 100, 123};
        IntStream.range(0, inputs.length).forEach(i -> assertEquals(outputs[i], sumOfNumbersInString.sumOfAllNumbersInString(inputs[i])));
    }
}
