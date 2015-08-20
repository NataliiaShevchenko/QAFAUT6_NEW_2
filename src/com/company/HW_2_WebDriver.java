package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Nataliia on 20.08.2015.
 */
public class HW_2_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //открыть хром
        d123.get("https://stage.tether.to");      //открываем сайт
        try{
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement b = d123.findElement(By.xpath("//*[@id = 'login']"));
        b.sendKeys();

        WebElement d = d123.findElement(By.xpath("//*[@id = 'password']"));
        d.sendKeys();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement c = d123.findElement(By.xpath("(//*[@ng-message])[1]"));
        System.out.println(c.getText());
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement t = d123.findElement(By.xpath("//*[@id = 'password'])"));
        t.sendKeys(Keys.TAB);
       WebElement j = d123.findElement(By.xpath("(//*[@ng-message])[2]"));
       System.out.println(j.getText());
    }
}
