package testrunner;

import org.testng.annotations.Test;

public class TestCase3 {

    @Test()
    public void createAccount(){
        System.out.println("Account is created");
    }

    @Test(dependsOnMethods = "createAccount")
    public void editAccount(){
        System.out.println("Account is edited");
    }

    @Test(dependsOnMethods = "editAccount")
    public void deleteAccount(){
        System.out.println("Account is deleted");
    }
}
