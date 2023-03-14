import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.time.Duration;


public class Main {

    WebElement clone;

    public static void main(String[] args) {
        System.setProperty("webserver.chrome.driver","C:\\Tools\\ChromDraivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa-routes.praktikum-services.ru/");

        WebElement element = driver.findElement(By.xpath("//input[@id='form-input-hour']"));
        element.click();
        element.sendKeys("15");

        WebElement elementMinutes = driver.findElement(By.xpath("//input[@id='form-input-minute']"));
        elementMinutes.click();
        elementMinutes.sendKeys("10");

        WebElement elementFrom = driver.findElement(By.xpath("//input[@id='form-input-from']"));
        elementFrom.click();
        elementFrom.sendKeys("Усачева, 3");

        WebElement elementTo = driver.findElement(By.xpath("//input[@id='form-input-to']"));
        elementTo.click();
        elementTo.sendKeys("Комсомольский проспект, 18");

        WebElement elementSvo = driver.findElement(By.id("form-mode-custom"));
        elementSvo.click();

        WebElement elementtaxi = driver.findElement(By.id("from-type-taxi"));
        elementtaxi.click();

    }

}

