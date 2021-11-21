package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserActions {

    public static void main(String[] args) {
        //To Set the System Property
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhilesh\\Trainings\\Drivers\\chromedriver.exe");
        //To Launch the Chrome Browser
        WebDriver driver=new ChromeDriver();
        //To maximize the browser
        driver.manage().window().maximize();
        //To achieve synchromization
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //To launch the url
        driver.get("http://amazon.in");
        //To find the location of search field
        WebElement searchBoxRef=driver.findElement(By.id("twotabsearchtextbox"));
        //To perform action on the search field
        searchBoxRef.sendKeys("Samsung Galaxy M32 5G (Slate Black, 6GB RAM, 128GB Storage)");
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("admin");
        //To find the location of search button and perform action
        driver.findElement(By.id("nav-search-submit-button")).click();
        //To click on specific mobile
        driver.findElement(By.xpath("//a/span[contains(text(),'Samsung Galaxy M32 5G (Slate Black, 6GB RAM, 128GB Storage)')]")).click();


    }
}
