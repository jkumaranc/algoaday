package org.iamjk.algoaday;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersInStringTest {

    @Test
    void sumOfAllNumbersInStringWithValidInputs() {
        SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString(1, 105);
        String[] inputs = {"4", "1abc23", "geeks4geeks", "1abc2x30yz67", "123abc"};
        Long[] outputs = {4L, 24L, 4L, 100L, 123L};
        IntStream.range(0, inputs.length).forEach(i -> assertEquals(outputs[i], sumOfNumbersInString.sumOfAllNumbersInString(inputs[i])));
    }

    @Test
    void sumOfAllNumbersInStringWithInvalidInputs() {
        SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString(1, 105);
        String[] invalidInputs = {"", "12232324323423425434534534567gdgfegr35435wdfwtw345345345345345345sdfs345345strertertertedfgfgr63435435345345sfswertrt"};
        for (String invalidInput: invalidInputs) {
            try {
                sumOfNumbersInString.sumOfAllNumbersInString(invalidInput);
            } catch (AssertionError expected) {
                assertNotNull(expected);
                continue;
            }
            fail("Expecting a failure here");
        }
    }
}
