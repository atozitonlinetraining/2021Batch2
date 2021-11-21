package Selenium;

import Reusable.Reusable;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows extends Reusable {
    public static void main(String[] args) throws InterruptedException {
        browserLaunch();
        driver.get("http://irctc.co.in");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
        //To handle multiple windows
        Set<String> allWindowRef=driver.getWindowHandles();
        Iterator<String> id=allWindowRef.iterator();
        String currentWindow=id.next();
        String childWindow=id.next();
        Thread.sleep(5000);
        driver.switchTo().window(childWindow);
        driver.findElement(By.xpath("//input[@name='From']")).sendKeys("Tirupati");
        Thread.sleep(5000);
        //To switch in to the parent window
        driver.switchTo().window(currentWindow);
        driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("BZA");
        Thread.sleep(5000);
        //To switch in to the child window
        driver.switchTo().window(childWindow);
        //To close the current window
        driver.close();
        //To quit the browser
        driver.quit();

    }
}
