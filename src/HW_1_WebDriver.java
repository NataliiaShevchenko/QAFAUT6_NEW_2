import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Nataliia on 18.08.2015.
 */
public class HW_1_WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        WebDriver d123 = new ChromeDriver();  //открыть хром
        d123.get("https://stage.tether.to");      //открываем сайт
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        System.out.println(d123.getTitle());   //вывести тайтл
        WebElement j = d123.findElement(By.xpath("(//html//div/a)[3]")); //Найти ссылку Request access.
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        d123.findElement(By.xpath("(//html//div/a)[3]")).click(); //Нажать на ссылку Request access.
       WebElement d = d123.findElement(By.xpath("//html//div//label"));
        System.out.println(d.getText());
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        d123.findElement(By.xpath("(//div//a)[2]")).click(); //Нажать на ссьілку Already have an invite code?
        List<WebElement> h = d123.findElements(By.xpath("//md-input-container//label")); //нашли все поля
                for (int i=0; i<h.size(); i++){
            System.out.println(h.get(i).getText()); //Напечатать в консоль заголовки всех полей кроме вьібора страньі.
        }
        try{
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement g = d123.findElement(By.xpath("//*[@name = 'inviteCode']")); //заполняем первое поле
        g.sendKeys("12345");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement k = d123.findElement(By.xpath("//*[@name = 'firstname']")); //заполняем второе поле
        k.sendKeys("name");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement f = d123.findElement(By.xpath("//*[@name = 'lastname']")); //заполняем третье поле
        f.sendKeys("test");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  // задержка
        }
        WebElement l = d123.findElement(By.xpath("//div[@ng-message = 'valid-invite-code']")); //печатаем в консоль ошибку, которая вывелась возле первого поля
        System.out.println(l.getText());

        d123.quit();



    }
}
