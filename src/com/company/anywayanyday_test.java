package com.company;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nataliia on 17.09.2015.
 */
public class anywayanyday_test {
    @Test
    public void test1() {
        anywayanyday.setButton();

    }

    @Before
    public void testBefore() {
        TestHelper.setup("https://www.anywayanyday.com/");
    }
}
