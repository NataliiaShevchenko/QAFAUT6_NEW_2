package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


/**
 * Created by Nataliia on 18.08.2015.
 */
public interface Lesson_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //открыть хром
        d123.get("http://google.com");      //открываем сайт

        System.out.println(d123.getTitle());   //вывести тайтл
        WebElement j = d123.findElement(By.name("q")); //найти строку поиска
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержать браузер перед закрытием на 5 сек
        }
        j.sendKeys("котята");  //написать в поиске "котята"
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержать браузер перед закрытием на 5 сек
        }
        j.sendKeys(Keys.ENTER);  //нажать кнопку поиск/ввод
        d123.findElement(By.name("btnG")).click(); // найти кнопку ввод и кликнуть

        System.out.println(j.getAttribute("value"));  //достать текстовое значение из поля
        // bla
    }
}
