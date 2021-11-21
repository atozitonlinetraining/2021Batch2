package testrunner;

import org.testng.annotations.Test;

public class TestCase2 {

    @Test(priority = 1)
    public void createAccount(){
        System.out.println("Account is created");
    }

    @Test(priority = 2)
    public void editAccount(){
        System.out.println("Account is edited");
    }

    @Test(priority = 3)
    public void deleteAccount(){
        System.out.println("Account is deleted");
    }
}
