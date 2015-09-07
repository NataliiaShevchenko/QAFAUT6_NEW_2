package com.company;

import com.sun.tools.javac.comp.Enter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Nataliia on 07.09.2015.
 */
public class HW_3_2 {
    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();
        d123.get("http://angel.net/~nic/passwd.current.html");
        setMaster("qwe123", d123);
        setSitename("gmail.com", d123);
        slp(2);
        System.out.println(getPassword(d123));
        slp(5);
        d123.quit();
}
    public static void setMaster(String value, WebDriver d123) {
        d123.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
    }

    public static void setSitename(String value, WebDriver d123) {
        d123.findElement(By.xpath("//*[@name='site']")).sendKeys(Keys.ENTER);
    }

    public static String getPassword(WebDriver d123) {
        return d123.findElement(By.xpath("//*[@name='password']")).getAttribute("value");
    }
    public static void slp(long sec) {   //slp()
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
