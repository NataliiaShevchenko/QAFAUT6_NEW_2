package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nataliia on 22.09.2015.
 */
public class Booking {
    public static void setFrom(String value) {
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'station_from']")).sendKeys(value);
    }

    public static void setKiev() {
        TestHelper.d123.findElement(By.xpath("//div[@title = 'Киев']")).click();
    }

    public static void setTo(String value) {
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'station_till']")).sendKeys(value);
    }

    public static void setIvano() {
        TestHelper.d123.findElement(By.xpath("//div[@title = 'Ивано-Франковск']")).click();
    }

    public static void setDatafield() {
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'date_dep']")).click();
    }

    public static void setData() {
        TestHelper.d123.findElement(By.xpath("//td//table[@class = 'month' ]//caption[text() ='Октябрь 2015']/..//td[text() = '20']")).click();
    }

    public static void setSearch() {
        TestHelper.d123.findElement(By.xpath("//div//button[@name = 'search'] ")).click();
    }

    public static String get043K() {
        return TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow']/td[@class = 'num']/a[text() = '043 К']")).getText();
    }

    public static String get143K() {
        return TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow2']/td[@class = 'num']/a[text() = '143 К']")).getText();
    }

    public static void set043K() {
        TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow']/td[@class = 'num']/a[text() = '043 К']")).click();
    }

    public static String getText() {
        return TestHelper.d123.findElement(By.xpath("//div[@class = 'vToolsPopupHeader']/span")).getText();
    }

    public static void setClose() {
        TestHelper.d123.findElement(By.xpath("//center//button[text() = 'Ok']")).click();
    }

    public static void setButton() {
        TestHelper.d123.findElement(By.xpath("//div//tr[@class = 'vToolsDataTableRow'] //div[@title = 'Купе']/button")).click();
    }

    public static String getColor() {
        return TestHelper.d123.findElement(By.cssSelector("#places p a[title='Место: 25']")).getCssValue("color");
    }

    public static String getNumber() {
        return TestHelper.d123.findElement(By.xpath("//div[@id = 'ts_chs_scheme']/span/b")).getText();
    }

    public static void setPlace() {
        TestHelper.d123.findElement(By.xpath("//a[@title = 'Место: 25']/span")).click();
    }

    public static String getPrice() {
        return TestHelper.d123.findElement(By.xpath("//td[@class = 'price']")).getText();
    }

    public static void setLastname(String value) {
        TestHelper.d123.findElement(By.xpath("//div//input[@title = 'Фамилия']")).sendKeys(value);
    }

    public static void setFirsttname(String value) {
        TestHelper.d123.findElement(By.xpath("//div//input[@title = 'Имя']")).sendKeys(value);
    }


    public static void setKiev2() {
        TestHelper.d123.findElement(By.xpath("//div[@title = 'Львов']")).click();
    }

    public static void setTo2(String value) {
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'station_till']")).sendKeys(value);
    }

    public static void setIvano2() {
        TestHelper.d123.findElement(By.xpath("//div[@title = 'Ужгород']")).click();
    }

    public static void setDatafield2() {
        TestHelper.d123.findElement(By.xpath("//div//input[@name = 'date_dep']")).click();
    }

    public static void setData2() {
        TestHelper.d123.findElement(By.xpath("//td//table[@class = 'month' ]//caption[text() ='Сентябрь 2015']/..//td[text() = '30']")).click();
    }

    public static String get829() {
        return TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow'][2]/td[@class = 'num']")).getText();
    }

    public static String get601() {
        return TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow2'][3]/td[@class = 'num']")).getText();
    }

    public static void set601() {
        TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow2'][3]/td[@class = 'num']")).click();
    }

    public static void setButtonP() {
        TestHelper.d123.findElement(By.xpath("//tr[@class = 'vToolsDataTableRow2'][2]/td[@class = 'place']/div[@title = 'Плацкарт']/button")).click();
    }

    public static String getColor2() {
        return TestHelper.d123.findElement(By.xpath("//div[@class = 'coach_scheme plac t4']//a[@title = 'Место: 41']/span ")).getCssValue("color");
    }

    public static String getColor3() {
        return TestHelper.d123.findElement(By.xpath("//div[@class = 'coach_scheme plac t4']//a[@title = 'Место: 42']/span ")).getCssValue("color");
    }

    public static void setPlace41() {
        TestHelper.d123.findElement(By.xpath("//a[@title = 'Место: 41']/span")).click();
    }

    public static void setPlace42() {
        TestHelper.d123.findElement(By.xpath("//a[@title = 'Место: 42']/span")).click();
    }

    public static void setLastname2(String value) {
        TestHelper.d123.findElement(By.xpath("(//input[@class = 'lastname'])[1]")).sendKeys(value);
    }

    public static void setFirstname2(String value) {
        TestHelper.d123.findElement(By.xpath("(//input[@class = 'firstname'])[1]")).sendKeys(value);
    }
    public static void setLastname3(String value) {
        TestHelper.d123.findElement(By.xpath("(//input[@class = 'lastname'])[2]")).sendKeys(value);
    }

    public static void setFirstname3(String value) {
        TestHelper.d123.findElement(By.xpath("(//input[@class = 'firstname'])[2]")).sendKeys(value);
    }
    public static String getTotal(){
        return TestHelper.d123.findElement(By.xpath("//button[@class = 'complex_btn']")).getText();
    }

}







