package Selenium;

import Reusable.Reusable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckPoints extends Reusable {

    public static void main(String[] args) throws IOException {
        browserLaunch();
        //To pass the url
        driver.get("http://demo.actitime.com");
        //To get the title
        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);
        //To get the text
        String text=driver.findElement(By.xpath("//label[contains(text(),'Keep me')]")).getText();
        System.out.println(text);
        //To check the checkbox is selected or not before click
        boolean checkboxStatusBC=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
        System.out.println(checkboxStatusBC);
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        //To get the dimension
        Dimension d1=driver.findElement(By.id("keepLoggedInCheckBox")).getSize();
        System.out.println(d1);
        //To get the tagname
        String tagName=driver.findElement(By.id("keepLoggedInCheckBox")).getTagName();
        System.out.println("tagname:"+tagName);
        //To check whether the element is displayed or not
        boolean displayStat=driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
        System.out.println("displaystatus:"+displayStat);
        //To check the checkbox is selected or not after click
        boolean checkboxStatusAC=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
        System.out.println(checkboxStatusAC);
        String attribute=driver.findElement(By.xpath("//a[contains(text(),'Forgot your')]")).getAttribute("id");
        System.out.println(attribute);
        //To get the current url
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        //by using resuable takescreenshot method
        takeScreenshot("simplifiedscreenshot");
        driver.quit();


    }
}
