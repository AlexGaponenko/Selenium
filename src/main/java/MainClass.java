import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class MainClass {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://onliner.by");
        driver.findElement(By.xpath("//span[starts-with(text(), 'Мобильные телефоны')]")).click();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("//li//span[text()='Nokia']")).click();
 //       driver.quit();


    }
}
