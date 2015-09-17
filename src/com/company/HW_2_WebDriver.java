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
    public static void slp(long sec) {   //������� ��� ��������
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //������� ����
        d123.get("https://stage.tether.to");      //��������� ���� 1
       slp(5);
        WebElement b = d123.findElement(By.xpath("//*[@id = 'login']")); //2
        b.sendKeys("   ");
        slp(5);
        WebElement d = d123.findElement(By.xpath("//*[@id = 'password']")); //2
        d.sendKeys();
       slp(2);
        WebElement c = d123.findElement(By.xpath("(//*[@ng-message])[1]")); //3
        System.out.println(c.getText());
      slp(2);
        WebElement t = d123.findElement(By.xpath("//*[@id = 'password']")); //4
        slp(2);
        t.sendKeys(Keys.TAB);

        slp(5);

        WebElement j = d123.findElement(By.xpath("(//*[@ng-message])[2]")); //5
        System.out.println(j.getText());

        WebElement lend1 = d123.findElement(By.xpath("//*[@id = 'password']")); //6
        lend1.sendKeys("asd");
       slp(5);

        WebElement error = d123.findElement(By.xpath("//md-input-container[2]/div/div")); //7
        System.out.println(error.getText());
        slp(7);
        WebElement lend2 = d123.findElement(By.xpath("//*[@id = 'password']")); //8
        lend2.sendKeys("fff");
       slp(2);

        //List<WebElement> h = d123.findElements(By.xpath("(//*[@ng-message])[2]")("//md-input-container[2]/div/div")); //9
        //for (int i = 0; i < h.size(); i++) {
            //System.out.println(h.get(i).getSize());
       //}
        WebElement tt = d123.findElement(By.xpath("//*[@id = 'login']")); //10p
        tt.sendKeys("a");
        slp(5);

        WebElement error2 = d123.findElement(By.xpath("//md-input-container[1]/div/div")); //11
        System.out.println(error2.getText());

        WebElement lend3 = d123.findElement(By.xpath("//*[@id = 'login']"));  //12
        lend3.sendKeys("gwe");

        d123.findElement(By.xpath("//button[span/text()='Log in']")).click(); //13






        //WebDriverWait wait= new WebDriverWait(d123,2); �������� ���� �� �������� �������
       // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));


    }
}
