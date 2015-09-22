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
        anywayanyday.findEnglish();
        TestHelper.slp(5);
        anywayanyday.setLabel();
        anywayanyday.setData();
        TestHelper.slp(6);
        //anywayanyday.setCity();
        anywayanyday.setCity("kiev");
        TestHelper.slp(3);
        anywayanyday.setCity3();
        anywayanyday.setCity2("Odessa");
    }




    @Before
    public void testBefore() {
        TestHelper.setup("https://www.anywayanyday.com/");
    }
}
