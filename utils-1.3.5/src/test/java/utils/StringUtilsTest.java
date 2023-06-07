package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertFalse(StringUtils.isPositiveNumber("-3ff"));
    }
}