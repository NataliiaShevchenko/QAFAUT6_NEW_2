package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nataliia on 08.09.2015.
 */
public class AngelPage {


    public static void setMaster(String value) {
        TestHelper.d123.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
    }

    public static void setSitename(String value) {
        TestHelper.d123.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }

    public static void generate() {
        TestHelper.d123.findElement(By.xpath("//*[@type='submit']")).click();
    }

    public static String getPassword() {
        return TestHelper.d123.findElement(By.xpath("//*[@name='password']")).getAttribute("value");
    }

    public static void setMaster(String value, WebDriver d123) {
        TestHelper.d123.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
    }

    public static void setSitename(String value, WebDriver d123) {
        TestHelper.d123.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }

    public static void setEnter() {
        TestHelper.d123.findElement(By.xpath("//*[@name='site']")).sendKeys(Keys.ENTER);
    }

    public static String getPassword(WebDriver d123) {
        return d123.findElement(By.xpath("//*[@name='password']")).getAttribute("value");
    }

    public static void setPassword() {
        TestHelper.d123.findElement(By.xpath("//*[@name='password']")).sendKeys(Keys.ENTER);
    }

    public static String getField1() {
        return TestHelper.d123.findElement(By.xpath("//table//tr[1]//td[1]")).getText();
    }
    public static String getField2(){
        return TestHelper.d123.findElement(By.xpath("//table//tr[2]//td[1]")).getText();
    }

    public static String getField3(){
        return TestHelper.d123.findElement(By.xpath("//table//tbody//tr[4]//td[1]")).getText();
    }






    public static void slp(long sec) {   //slp()
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}



