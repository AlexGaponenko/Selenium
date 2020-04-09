import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://onliner.by");
        driver.findElement(By.xpath("//span[starts-with(text(), 'Мобильные телефоны')]")).click();
        driver.findElement(By.xpath("//li//span[text()='Samsung']/preceding-sibling::span")).click();
 //       driver.quit();


    }
}
