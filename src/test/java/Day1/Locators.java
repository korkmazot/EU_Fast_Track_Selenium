package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement flash = driver.findElement(By.id("flash-messages"));
        System.out.println(flash.getTagName());

        WebElement name = driver.findElement(By.name("viewport"));
        System.out.println(name.getTagName());

        WebElement className = driver.findElement(By.className("h1y"));
        System.out.println(className.getTagName());

        List<WebElement> listGroupItems = driver.findElements(By.className("list-group-item"));
        System.out.println(listGroupItems.size() );

        driver.close();


    }
}
