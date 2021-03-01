package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.platform.commons.function.Try.success;

public class MathUtilTest {

    @Test
    public void test() {
        MathUtil mathUtil = new MathUtil();
        int actual = mathUtil.add(1, 1);
        assertEquals(2, actual, "add method should give results" );

    }
}
