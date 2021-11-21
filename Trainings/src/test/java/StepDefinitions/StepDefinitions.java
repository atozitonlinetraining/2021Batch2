package StepDefinitions;

import Reusable.Reusable;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

public class StepDefinitions extends Reusable {


    @Given("^the browser and url$")
    public void the_browser_and_url() throws IOException {
        // Express the Regexp above with the code you wish you had
        System.out.println("First Given Statement");
        browserLaunch();
      //  driver.get("http://demo.actitime.com");
        String url=userdata("url");
        System.out.println(url);
        driver.get(url);
        genLog("info","browser launched successfully");

    }

    @When("^we enter the username and password$")
    public void we_enter_the_username_and_password() throws IOException{
        // Express the Regexp above with the code you wish you had
        System.out.println("First When Statement");
        WebElement usernameRef=driver.findElement(By.name("username"));
        //To clear the data on the username field
        usernameRef.clear();
        //To perform action on the username field
        //usernameRef.sendKeys("admin");
        String username=userdata("username");
        String password=userdata("password");
        usernameRef.sendKeys(username);
        //To perform action on the password field and performing action
        driver.findElement(By.name("pwd")).sendKeys(password);

    }

    @When("^click on Login button$")
    public void click_on_Login_button() {
        // Express the Regexp above with the code you wish you had
        System.out.println("Second When Statement");
        //To find the location of Login button and performing action
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("^Login should be successful$")
    public void Login_should_be_successful() throws IOException {
        // Express the Regexp above with the code you wish you had
        System.out.println("First Then Statement");
        takeScreenshot("login_success_");
    }

    @When("^we enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void we_enter_the_and(String arg1, String arg2) {
        // Express the Regexp above with the code you wish you had
        WebElement usernameRef=driver.findElement(By.name("username"));
        //To clear the data on the username field
        usernameRef.clear();
        //To perform action on the username field
        usernameRef.sendKeys(arg1);
        //To perform action on the password field and performing action
        driver.findElement(By.name("pwd")).sendKeys(arg2);
    }

    @When("^we enter the username and password and click on login button$")
    public void we_enter_the_username_and_password_and_click_on_login_button(DataTable arg1) {
        // Express the Regexp above with the code you wish you had
        // For automatic conversion, change DataTable to List<YourType>
        List<List<String>> data=arg1.raw();
        // Express the Regexp above with the code you wish you had
        WebElement usernameRef=driver.findElement(By.name("username"));
        //To clear the data on the username field
        usernameRef.clear();
        //To perform action on the username field
        usernameRef.sendKeys(data.get(0).get(0));
        //To perform action on the password field and performing action
        driver.findElement(By.name("pwd")).sendKeys(data.get(0).get(1));
        //To find the location of Login button and performing action
        driver.findElement(By.id("loginButton")).click();

    }

    @Then("^Login should not be successful$")
    public void Login_should_not_be_successful() throws IOException {
        // Express the Regexp above with the code you wish you had
        // Express the Regexp above with the code you wish you had
        System.out.println("First Then Statement");
        takeScreenshot("login_not_success_");
    }

    @When("^we click on TAB Button$")
    public void we_click_on_TAB_Button() {
        // Express the Regexp above with the code you wish you had
        Actions act=new Actions(driver);
        act.sendKeys(Keys.TAB).build().perform();
        genLog("info","pressed the tab key successfully");
    }

    @When("^we perform Right click on specific element$")
    public void we_perform_Right_click_on_specific_element() {
        // Express the Regexp above with the code you wish you had
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
        Actions act=new Actions(driver);
        //To perform right click on specific webelement
        act.contextClick(element).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
       // act.sendKeys(Keys.ENTER).build().perform();

    }

    @When("^we wait for (\\d+)s$")
    public void we_wait_for_s(int arg1) throws InterruptedException {
        // Express the Regexp above with the code you wish you had
       Thread.sleep(arg1);
    }

    @When("^we perform mouse and keyboard actions using robot$")
    public void we_perform_mouse_and_keyboard_actions_using_robot() throws AWTException {
        // Express the Regexp above with the code you wish you had
        Robot robo=new Robot();
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyPress(KeyEvent.VK_ENTER);
    }

    @When("^we scroll down the page till end of the browser$")
    public void we_scroll_down_the_page_till_end_of_the_browser() {
        // Express the Regexp above with the code you wish you had
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Then("^Accept Java Script confirmation popup$")
    public void Accept_Java_Script_confirmation_popup() throws InterruptedException {
        // Express the Regexp above with the code you wish you had
        driver.findElement(By.cssSelector(".content.tasks")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
        driver.findElement(By.cssSelector(".inputFieldWithPlaceholder.newNameField.inputNameField")).sendKeys("srikanth");
        Thread.sleep(3000);
        driver.findElement(By.id("customerLightBoxCloseButton")).click();
        Alert alt=driver.switchTo().alert();
        //To get the text
        String altText=alt.getText();
        System.out.println(altText);
        //To accept the alert
        alt.dismiss();

    }

    @When("^we click on browse button and upload file$")
    public void we_click_on_browse_button_and_upload_file() throws InterruptedException, IOException {
        // Express the Regexp above with the code you wish you had
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@type='file']")).click();
        Runtime.getRuntime().exec("C:\\Users\\Nikhilesh\\fileupload.exe");
    }


}
