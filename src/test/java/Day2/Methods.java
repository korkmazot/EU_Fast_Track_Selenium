package Day2;

import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Methods {

        @Test
        public void clickMethod(){

            Driver.get().get("http://practice.cybertekschool.com/");
            WebElement firstClick = Driver.get().findElement(By.xpath("//a[@href='/abtest']"));
            firstClick.click();
            System.out.println(Driver.get().getCurrentUrl());

            Driver.closeDriver();

        }

        @Test
         public void sendKey(){

            Driver.get().get("https://www.google.com/");
            Driver.get().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
            WebElement searchBox = Driver.get().findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
            searchBox.sendKeys("bike");
            searchBox.sendKeys(Keys.ENTER);
            Driver.closeDriver();

        }

}
