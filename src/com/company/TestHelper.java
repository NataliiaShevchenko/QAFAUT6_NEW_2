package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Nataliia on 08.09.2015.
 */
public class TestHelper {
    public static ChromeDriver d123;
    
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        d123 = new ChromeDriver();
    }
    public static void setup(String abs){
        setup();
        get(abs);
    }


    public static void get (String url){   //ф-ия которая открывает сайт
        d123.get(url);
    }
    
    public static void quit(){  //функция которая закрывает сайт
        d123.quit();
        
    }

}
