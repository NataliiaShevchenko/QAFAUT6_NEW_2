package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nataliia on 07.09.2015.
 */
public class HW_3_1 {

    //page object
    @Test
    public void test1() {
        AngelPage.setMaster("masterPass");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());

    }

    @Test
    public void test2() {
        AngelPage.setMaster("hello");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());

    }

    @Test
    public void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.getPassword();
        AngelPage.generate();
        AngelPage.slp(5);
        System.out.println(AngelPage.getPassword());
        Assert.assertEquals("mKJAakDvwbhi6@1a", AngelPage.getPassword());
    }


    @Test
    public void test4() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.getPassword();
        AngelPage.setEnter();
        AngelPage.slp(5);
        System.out.println(AngelPage.getPassword());
        Assert.assertEquals("mKJAakDvwbhi6@1a", AngelPage.getPassword());
    }

    @Test
    public void test5() {
        AngelPage.setMaster("");
        AngelPage.setSitename("");
        AngelPage.getPassword();
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
    }

    @Test
    public void test6() {
        int b = 200;
        String a = "a";
        int h = 200;
        String d = "b";
        AngelPage.setMaster(f(a, b));
        AngelPage.setSitename(g(d, h));
        AngelPage.getPassword();
        AngelPage.generate();
        Assert.assertEquals("jFljhvDp1Y9yi@1a", AngelPage.getPassword());
    }

    @Test
    public void test7(){
        AngelPage.setMaster("");
        AngelPage.setSitename("");
        AngelPage.getPassword();
        AngelPage.setEnter();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
    }

    @Test
    public void test8(){
        AngelPage.setMaster("333");
        AngelPage.setSitename("111");
        AngelPage.getPassword();
        AngelPage.generate();
        AngelPage.slp(3);
        Assert.assertEquals("CD/iUTsNwzV4v@1a", AngelPage.getPassword());

    }

    @Test
    public void test9(){
        AngelPage.setMaster("111");
        AngelPage.setSitename("333");
        AngelPage.getPassword();
        AngelPage.generate();
        AngelPage.slp(3);
        Assert.assertEquals("A61tAOVfX4wCm@1a", AngelPage.getPassword());
    }

    @Test
    public void test10(){
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSitename("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.getPassword();
        AngelPage.generate();
        AngelPage.slp(4);
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.getPassword());
    }

    @Test
    public void test11() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("asd");
        AngelPage.getPassword();
        AngelPage.generate();
        AngelPage.slp(4);
        Assert.assertEquals("agdjoTB4cjI5E@1a", AngelPage.getPassword());
    }

    @Test
    public void test12(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("ASD");
        AngelPage.getPassword();
        AngelPage.generate();
        AngelPage.slp(4);
        Assert.assertEquals("FkfaCm2ddwvDg@1a", AngelPage.getPassword());
    }

    @Test
    public void test13() {
        AngelPage.getField1();
        Assert.assertEquals("Your master password", AngelPage.getField1());
    }
    @Test
            public void test14(){
        AngelPage.getField2();
        Assert.assertEquals("Site name", AngelPage.getField2());
    }
    @Test
            public void test15(){
        AngelPage.getField3();
        Assert.assertEquals("Generated password", AngelPage.getField3());
    }






    @Before
    public void testBefore() {
        //TestHelper.setup("http://angel.net/~nic/passwd.current.html");
        TestHelper.setup("http://oxogamestudio.com/passwd.current2.htm");

    }

    @After
    public void testAfter() {
        TestHelper.quit();
    }

    public static String f (String a,int b){
        String c = "";
        for (int i = 0; i < b; i++) {
            c = c + a;
        }
        return c;
    }

    public static String g (String d, int h){
        String c = "";
        for (int i =0; i<h; i++){
            c=c+d;
        }
        return c;
    }


}

