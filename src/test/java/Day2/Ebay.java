package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ebay {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.ebay.com/globaldeals");
        List<WebElement> names = driver.findElements(By.xpath("//span[@itemprop=\'name\']"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[@itemprop=\'price\']\n"));
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(1).getText());
            System.out.println(prices.get(1).getText());
            System.out.println();
        }

    }
}
