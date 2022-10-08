package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();
    }

    @Test
    public void test3() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.sendKeys("EU Fast Track");
        alert.accept();
    }
}
