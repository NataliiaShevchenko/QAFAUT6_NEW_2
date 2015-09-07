package com.company;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Nataliia on 07.09.2015.
 */
public class HW_3 {
    @Test
    public  void  test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();
        d123.get("http://angel.net/~nic/passwd.current.html");

        WebElement a = d123.findElement(By.xpath("//*[@name='master']"));
        a.sendKeys("333");

        WebElement b = d123.findElement(By.xpath("//*[@name='site']"));
        b.sendKeys("111");

        d123.findElement(By.xpath("//*[@type='submit']")).click();

        WebElement c = d123.findElement(By.xpath("//*[@name='password']"));
        slp(3);
        System.out.println(c.getAttribute("value"));

    }
    public static void slp(long sec) {   //slp()
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}