package Reusable;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reusable extends AConfig {
    public static WebDriver driver;

    public static int day() throws InterruptedException, IOException {
        //date function
        Date date=new Date();
        //To convert the system date in user defined format
        SimpleDateFormat d2=new SimpleDateFormat("dd");
        String dateFormat=d2.format(date);
        System.out.println(dateFormat);
        int day=Integer.parseInt(dateFormat);
        System.out.println(day);
        return day;
    }
    public static void browserLaunch(){
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--disable-notifications");
        //To Set the System Property
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhilesh\\Trainings\\Drivers\\chromedriver.exe");
        //To Launch the Chrome Browser
        driver=new ChromeDriver(opt);
        //To maximize the browser
        driver.manage().window().maximize();
        //To achieve synchromization
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void takeScreenshot(String name) throws IOException {
        //date function
        Date date=new Date();
        //To convert the system date in user defined format
        SimpleDateFormat d2=new SimpleDateFormat("ddMMyyyyHHmmss");
        String dateFormat=d2.format(date);
        System.out.println(date);
        System.out.println(dateFormat);
        //To take the screenshot
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File("C:\\Users\\Nikhilesh\\Trainings\\Screenshots\\"+name+dateFormat+".jpeg");
        FileHandler.copy(srcFile,destFile);
    }
}
