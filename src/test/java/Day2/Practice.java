package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] args) {

        WebDriver driver;

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
        WebElement glink = driver.findElement(By.linkText("Gmail"));
        WebElement gPlink = driver.findElement(By.partialLinkText("Gm"));
        System.out.println(gPlink.getText());
        System.out.println(glink.getText());

    }
}
