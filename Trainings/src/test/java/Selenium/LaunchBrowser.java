package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //To Set the System Property
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhilesh\\Trainings\\Drivers\\chromedriver.exe");
        //To Launch the Chrome Browser
        WebDriver driver=new ChromeDriver();
        //To maximize the browser
        driver.manage().window().maximize();
        //To achieve synchromization
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        //To pass the url
        driver.get("http://demo.actitime.com");
        //To find the location of username field
        WebElement usernameRef=driver.findElement(By.name("username"));
        //To clear the data on the username field
        usernameRef.clear();
        //To perform action on the username field
        usernameRef.sendKeys("admin");
        //To perform action on the password field and performing action
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //To find the location of Login button and performing action
        driver.findElement(By.id("loginButton")).click();
//        To wait for a while
//        Thread.sleep(3000);
        //Declare and initialise a fluent wait
        FluentWait wait = new FluentWait(driver);
        //Specify the timout of the wait
        wait.withTimeout(25000, TimeUnit.MILLISECONDS);
        //Sepcify polling time
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        //Specify what exceptions to ignore
        wait.ignoring(NoSuchElementException.class);
//      WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//td[contains(text(),'Enter Time-Track')]")),"Enter Time-Track"));
       // wait.until(ExpectedConditions.attributeContains(By.className("content tasks"), "class", "content tasks"));
        //  To find the location of Tasks and performing actionx
        //  driver.findElement(By.xpath("//a[@class='content tasks']")).click();
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")),"Logout"));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
        // wait.until(ExpectedConditions.presenceOfElementLocated(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
        JavascriptExecutor je= ((JavascriptExecutor)driver);
                je.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
        //To find the location of logout button and performing action
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        //TO quit the browser
        //driver.quit();
    }
}
