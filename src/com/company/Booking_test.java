package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nataliia on 22.09.2015.
 */
public class Booking_test {
    @Test
    public void test1(){
        Booking.setFrom("Киев");
        TestHelper.slp(3);
        Booking.setKiev();
        Booking.setTo("Ивано-Франковск");
        TestHelper.slp(3);
        Booking.setIvano();
        Booking.setDatafield();
        Booking.setData();
        Booking.setSearch();
        TestHelper.slp(10);
        Assert.assertEquals(Booking.get043K(), "043 К");
        Assert.assertEquals(Booking.get143K(), "143 К");
        Booking.set043K();
    }










    @Before
    public void testBefore() {
        TestHelper.setup("http://booking.uz.gov.ua/");
    }
}



