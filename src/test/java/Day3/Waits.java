package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Waits extends BasePage{

    @Before
    public void init() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

    }

    @Test
    public void  test1() throws InterruptedException {
        Thread.sleep(6000);
        WebElement title = driver.findElement(By.xpath("//div[@id=\"finish\"]"));
        System.out.println(title.getText());
    }

    @Test
    public void test2(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement title = driver.findElement(By.xpath("//div[@id=\"finish\"]"));
        System.out.println(title.getText());
    }
}
