package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Nataliia on 18.08.2015.
 */
public class HW_1_WebDriver {
    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //������� ����
        d123.get("https://stage.tether.to");      //��������� ����

        slp(5);

        System.out.println(d123.getTitle());   //������� �����
        WebElement j = d123.findElement(By.xpath("(//html//div/a)[3]")); //����� ������ Request access.
       slp(5);

        d123.findElement(By.xpath("(//html//div/a)[3]")).click(); //������ �� ������ Request access.
       WebElement d = d123.findElement(By.xpath("//html//div//label"));
        System.out.println(d.getText());
        slp(5);

        d123.findElement(By.xpath("(//div//a)[2]")).click(); //������ �� ������� Already have an invite code?
        List<WebElement> h = d123.findElements(By.xpath("//md-input-container//label")); //����� ��� ����
                for (int i=0; i<h.size(); i++){
            System.out.println(h.get(i).getText()); //���������� � ������� ��������� ���� ����� ����� ������� �������.
        }

        slp(5);

        WebElement g = d123.findElement(By.xpath("//*[@name = 'inviteCode']")); //��������� ������ ����
        g.sendKeys("12345");
        slp(5);

        WebElement k = d123.findElement(By.xpath("//*[@name = 'firstname']")); //��������� ������ ����
        k.sendKeys("name");
       slp(5);

        WebElement f = d123.findElement(By.xpath("//*[@name = 'lastname']")); //��������� ������ ����
        f.sendKeys("test");
      slp(5);
        WebElement l = d123.findElement(By.xpath("//div[@ng-message = 'valid-invite-code']")); //�������� � ������� ������, ������� �������� ����� ������� ����
        System.out.println(l.getText());

        d123.quit();



    }
}
