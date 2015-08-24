package com.company;
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nataliia on 20.08.2015.
 */
public class HW_2_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //������� ����
        d123.get("https://stage.tether.to");      //��������� ����
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }
        WebElement b = d123.findElement(By.xpath("//*[@id = 'login']"));
        b.sendKeys("   ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }

        WebElement d = d123.findElement(By.xpath("//*[@id = 'password']"));
        d.sendKeys();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }
        WebElement c = d123.findElement(By.xpath("(//*[@ng-message])[1]"));
        System.out.println(c.getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }
        WebElement t = d123.findElement(By.xpath("//*[@id = 'password']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }
        t.sendKeys(Keys.TAB);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }

        WebElement j = d123.findElement(By.xpath("(//*[@ng-message])[2]"));
        System.out.println(j.getText());

        WebElement lend1 = d123.findElement(By.xpath("//*[@id = 'password']"));
        lend1.sendKeys("asd");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }

        WebElement error = d123.findElement(By.xpath("//md-input-container[2]/div/div"));
        System.out.println(error.getText());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }

        WebElement lend2 = d123.findElement(By.xpath("//*[@id = 'password']"));
        lend2.sendKeys("fff");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }

        //List<WebElement> h = d123.findElement(By.xpath("(//*[@ng-message])[2]")("//*[@ng-message = 'minlength']"));
        //for (int i = 0; i < h.size(); i++) {
            //System.out.println(h.get(i).getSize());
       // }
        WebElement tt = d123.findElement(By.xpath("//*[@id = 'login']"));
        tt.sendKeys("a");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // ��������
        }

        WebElement error2 = d123.findElement(By.xpath("//md-input-container[1]/div/div"));
        System.out.println(error2.getText());

        WebElement lend3 = d123.findElement(By.xpath("//*[@id = 'login']"));
        lend3.sendKeys("gwe");

        d123.findElement(By.xpath("//div//button")).click();





        //WebDriverWait wait= new WebDriverWait(d123,2); �������� ���� �� �������� �������
       // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));


    }
}
