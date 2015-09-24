package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nataliia on 22.09.2015.
 */
public class Booking_test {
    @Test
    public void test1() {
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
        Assert.assertEquals("043 К", Booking.get043K());
        Assert.assertEquals("143 К", Booking.get143K());
        Booking.set043K();
        TestHelper.slp(7);
        Assert.assertEquals("Маршрут поезда", Booking.getText());
        Booking.setClose();
        TestHelper.slp(9);
        Booking.setButton();
        TestHelper.slp(10);
        Assert.assertEquals("rgba(0, 0, 0, 1)", Booking.getColor());
        Assert.assertEquals("№\n5", Booking.getNumber());
        Booking.setPlace();
        TestHelper.slp(3);
        Assert.assertEquals("179,07*", Booking.getPrice());
        Booking.setLastname("Test");
        Booking.setFirsttname("Test");
    }












    @Before
    public void testBefore() {
        TestHelper.setup("http://booking.uz.gov.ua/");
    }
}



