package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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


    @Before
    public void testBefore() {
        TestHelper.setup("http://oxogamestudio.com/passwd.current3.htm");

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

