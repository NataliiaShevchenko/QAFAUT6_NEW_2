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
        WebDriver d123 = new ChromeDriver();  //открыть хром
        d123.get("https://stage.tether.to");      //открываем сайт

        slp(5);

        System.out.println(d123.getTitle());   //вывести тайтл
        WebElement j = d123.findElement(By.xpath("(//html//div/a)[3]")); //Ќайти ссылку Request access.
       slp(5);

        d123.findElement(By.xpath("(//html//div/a)[3]")).click(); //Ќажать на ссылку Request access.
       WebElement d = d123.findElement(By.xpath("//html//div//label"));
        System.out.println(d.getText());
        slp(5);

        d123.findElement(By.xpath("(//div//a)[2]")).click(); //Ќажать на ссь≥лку Already have an invite code?
        List<WebElement> h = d123.findElements(By.xpath("//md-input-container//label")); //нашли все пол€
                for (int i=0; i<h.size(); i++){
            System.out.println(h.get(i).getText()); //Ќапечатать в консоль заголовки всех полей кроме вь≥бора странь≥.
        }

        slp(5);

        WebElement g = d123.findElement(By.xpath("//*[@name = 'inviteCode']")); //заполн€ем первое поле
        g.sendKeys("12345");
        slp(5);

        WebElement k = d123.findElement(By.xpath("//*[@name = 'firstname']")); //заполн€ем второе поле
        k.sendKeys("name");
       slp(5);

        WebElement f = d123.findElement(By.xpath("//*[@name = 'lastname']")); //заполн€ем третье поле
        f.sendKeys("test");
      slp(5);
        WebElement l = d123.findElement(By.xpath("//div[@ng-message = 'valid-invite-code']")); //печатаем в консоль ошибку, котора€ вывелась возле первого пол€
        System.out.println(l.getText());

        d123.quit();



    }
}
