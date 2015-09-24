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

    @Test
    public void test2(){
        Booking.setFrom("Львов");
        TestHelper.slp(3);
        Booking.setKiev2();
        Booking.setTo2("Ужгород");
        TestHelper.slp(3);
        Booking.setIvano2();
        Booking.setDatafield2();
        Booking.setData2();
        Booking.setSearch();
        TestHelper.slp(6);
        Booking.get829();
        Booking.get601();
        Booking.set601();
        TestHelper.slp(7);
        Assert.assertEquals("Маршрут поезда", Booking.getText());
        Booking.setClose();
        TestHelper.slp(3);
        Booking.setButtonP();
        TestHelper.slp(5);
        Assert.assertEquals("rgba(0, 0, 0, 1)", Booking.getColor2());
        Assert.assertEquals("rgba(0, 0, 0, 1)", Booking.getColor3());
        Booking.setPlace41();
        Booking.setPlace42();
        Booking.setLastname2("test");
        Booking.setFirstname2("test");
        Booking.setLastname3("test2");
        Booking.setFirstname3("test2");
        Assert.assertEquals(Booking.getTotal(), "219,48 грн");

    }












    @Before
    public void testBefore() {
        TestHelper.setup("http://booking.uz.gov.ua/");
    }
}



