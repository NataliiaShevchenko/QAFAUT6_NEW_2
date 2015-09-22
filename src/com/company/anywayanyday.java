package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Nataliia on 17.09.2015.
 */
public class anywayanyday {
    public static void setButton () {
        TestHelper.d123.findElement(By.xpath("//*[@class ='b-menu-item-button-text--title j-current_culture']")).click();
    }
    public static void findEnglish(){
        TestHelper.d123.findElement(By.xpath("//div[@class = 'b-drop_down_list opened']//li//span[text() = 'English']")).click();
    }
    public static void setLabel (){
        TestHelper.d123.findElement(By.xpath("//div//label/h2[@class = 'b-flight_selection-step-label j-flight-data-calendar-opener']")).click();
    }
    public static void setData (){
        TestHelper.d123.findElement(By.xpath(" //div//td//a[@class = 'ui-state-default'][1]")).click();
    }
    //public static void setCity(){
       // TestHelper.d123.findElement(By.xpath("//div[@class = 'b-input-border_fade']")).click();
   // }
    public static void setCity(String value){
        TestHelper.d123.findElement(By.xpath("//div//input[@class = 'b-input-field j-airport_input j-departure_airport_input']")).sendKeys(value);
    }
    public static void setCity3 (){
        TestHelper.d123.findElement(By.xpath("//div//input[@class = 'b-input-field j-airport_input j-arrival_airport_input']")).click();
    }
    public static void setCity2 (String value){
        TestHelper.d123.findElement(By.xpath("//div//input[@class = 'b-input-field j-airport_input j-arrival_airport_input']")).sendKeys(value);
    }




}

