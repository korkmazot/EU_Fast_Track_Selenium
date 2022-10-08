package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/web-tables");
    }

    @Test
    public void test1(){
        List<WebElement> tableHeads = driver.findElements(By.xpath("//th"));
        for (WebElement head : tableHeads){
            System.out.println(head.getText());
        }

        List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        for (WebElement name : names){
            System.out.println(name.getText());
        }

        driver.close();

    }
}
