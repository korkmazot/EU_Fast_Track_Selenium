package Day4;

import Day3.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends BasePage {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        WebElement a = driver.findElement(By.id("column-a"));
        WebElement b = driver.findElement(By.id("column-b"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(a,b).perform();
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop_circles");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }
}
