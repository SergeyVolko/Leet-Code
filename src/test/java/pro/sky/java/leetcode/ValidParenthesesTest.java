package pro.sky.java.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.leetcode.easy.ValidParentheses;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses validParentheses = new ValidParentheses();

    public static Stream<Arguments> getArgumentsForTrue() {
        return Stream.of(
                Arguments.of("()[]{}"),
                Arguments.of("()[{}[]]"),
                Arguments.of("({[]})"),
                Arguments.of("[[[[][][]][[][][]]][[][]]]")
        );
    }

    public static Stream<Arguments> getArgumentsForFalse() {
        return Stream.of(
                Arguments.of("("),
                Arguments.of("]"),
                Arguments.of("({[]))"),
                Arguments.of("[(){}")
        );
    }

    @ParameterizedTest
    @MethodSource("getArgumentsForTrue")
    public void whenSThenTrue(String s) {
        assertTrue(validParentheses.isValid(s));
    }

    @ParameterizedTest
    @MethodSource("getArgumentsForFalse")
    public void whenSThenFalse(String s) {
        assertFalse(validParentheses.isValid(s));
    }
}