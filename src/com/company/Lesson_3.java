package com.company;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Nataliia on 01.09.2015.
 */


public class Lesson_3 {


    @Test
    public void t1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //открыть хром
        d123.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");

        WebElement a = d123.findElement(By.xpath("//*[@id='ts_type']"));  //нашли первый селект
        Select sel = new Select(a);
        System.out.println(sel.getFirstSelectedOption().getText()); //вывели текст, который отображается в селекте
        sel.selectByVisibleText("мотоцикл или мотороллер"); // выбрали из селекта значение

        WebElement b = d123.findElement(By.xpath("//*[@id='ts_details_type']"));  //нашли 2 селект
        Select sel1 = new Select(b);
        sel1.selectByVisibleText("объем двигателя более 300 см³");

        WebElement c = d123.findElement(By.xpath("//*[@id='ts_zone']"));  //нашли 3 селект
        Select sel2 = new Select(c);
        sel2.selectByVisibleText("Борисполь");

        WebElement d = d123.findElement(By.xpath("//*[@id='no_crash_years_qty']"));  //нашли 4 селект
        Select sel3 = new Select(d);
        sel3.selectByVisibleText("2 года");

        WebElement i = d123.findElement(By.xpath("//*[@id='dgo']"));  //нашли 5 селект
        Select sel4 = new Select(i);
        sel4.selectByVisibleText("да, на 100 000 грн");


    }

    public static void slp(long sec) {   //slp()
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

