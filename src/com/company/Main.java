package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
            ChromeDriver d123 = new ChromeDriver();  //открыть хром
            d123.get("http://google.com");      //открываем сайт
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержать браузер перед закрытием на 5 сек
        }
        System.out.println(d123.getTitle());   //вывести тайтл
        WebElement j = d123.findElementByName("q"); //найти строку поиска
        try{
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
        d123.findElementByName("btnG").click(); // найти кнопку ввод и кликнуть

        System.out.println(j.getAttribute("value"));  //достать текстовое значение из поля
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержать браузер перед закрытием на 2 сек
        }

        WebElement d = d123.findElementByClassName("srg");  // достать  и вывести в консоль первую ссылку по запросу котята, ищем внутри переменнрй d = div class class)
        List<WebElement> res = d.findElements(By.tagName("a"));
        System.out.println(res.get(0).getText());

        WebElement res1 = res.get (0);  //достать первую ссылку и нажать ее + вывести на экран
        System.out.println(res1.getText());
        res1.click();
        d123.quit();                   //закрыть браузер




        }
    }

