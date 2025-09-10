package com.tp.git;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class SubTest {
    @TEST
    public void subTest() {
        int a, b, res = 2, 3, -1;
        
        Sub obj = new Sub();

        assertEquals(res, obj.sub(a, b));
    }
}
