package Selenium;

import Reusable.Reusable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class RetrieveAllLInks extends Reusable {
    public static void main(String[] args) {
        browserLaunch();
        driver.get("http://amazon.com");
        List<WebElement> allLinkRef=driver.findElements(By.xpath("//a"));
        Iterator<WebElement> ie=allLinkRef.iterator();
        while (ie.hasNext()){
            WebElement indElement=ie.next();
            String indElementText=indElement.getText();
            System.out.println(indElementText);
        }


    }
}
