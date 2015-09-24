package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nataliia on 22.09.2015.
 */
public class Booking {
    public static void setFrom (String value){
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'station_from']")).sendKeys(value);
    }
    public static void setKiev(){
        TestHelper.d123.findElement(By.xpath("//div[@title = 'Киев']")).click();
    }

    public static void setTo (String value){
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'station_till']")).sendKeys(value);
    }
    public static void setIvano(){
        TestHelper.d123.findElement(By.xpath("//div[@title = 'Ивано-Франковск']")).click();
    }
    public static void setDatafield(){
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'date_dep']")).click();
    }
    public static void setData (){
        TestHelper.d123.findElement(By.xpath("//td//table[@class = 'month' ]//caption[text() ='Октябрь 2015']/..//td[text() = '20']")).click();
            }
    public static void setSearch(){
        TestHelper.d123.findElement(By.xpath("//div//button[@name = 'search'] ")).click();
    }
    public static String get043K(){
        return TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow']/td[@class = 'num']/a[text() = '043 К']")).getText();
        }
    public static String get143K(){
        return TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow2']/td[@class = 'num']/a[text() = '143 К']")).getText();
    }
    public static void set043K(){
        TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow']/td[@class = 'num']/a[text() = '043 К']")).click();
    }
    public static String getText(){
        return TestHelper.d123.findElement(By.xpath("//div[@class = 'vToolsPopupHeader']/span")).getText();
    }
    public static void setClose(){
        TestHelper.d123.findElement(By.xpath("//center//button[text() = 'Ok']")).click();
    }
    public static void setButton(){
        TestHelper.d123.findElement(By.xpath("//div//tr[@class = 'vToolsDataTableRow'] //div[@title = 'Купе']/button")).click();
    }
    public static String getColor(){
        return TestHelper.d123.findElement(By.cssSelector("#places p a[title='Место: 25']")).getCssValue("color");
    }
    public static String getNumber(){
        //System.out.println(TestHelper.d123.findElement(By.xpath("//div[@id = 'ts_chs_scheme']/span/b")));
       return TestHelper.d123.findElement(By.xpath("//div[@id = 'ts_chs_scheme']/span/b")).getText();
    }
    public static void setPlace(){
        TestHelper.d123.findElement(By.xpath("//a[@title = 'Место: 25']/span")).click();
         }
    public static String getPrice(){
        return TestHelper.d123.findElement(By.xpath("//td[@class = 'price']")).getText();
    }
    public static void setLastname (String value){
        TestHelper.d123.findElement(By.xpath("//div//input[@title = 'Фамилия']")).sendKeys(value);
    }
    public static void setFirsttname (String value){
        TestHelper.d123.findElement(By.xpath("//div//input[@title = 'Имя']")).sendKeys(value);
    }





}
