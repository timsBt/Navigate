import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
@Test
    public void test(){
        System.out.println("Hi");
    }
@Test
    public void test2(){
        System.out.println("Hihhh");
    }
@Test
    public void login(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa-routes.praktikum-services.ru/");
        driver.quit();
    }







}
