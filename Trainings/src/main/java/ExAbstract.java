import java.sql.SQLOutput;

abstract class Automation{
    public void java(){
        System.out.println("Java");
    }

    public abstract void selenium();

    public abstract void automationFramework();

}

public class ExAbstract extends Automation{
    public void selenium() {
        System.out.println("selenium");
    }

    public void automationFramework() {
        System.out.println("automation framework");
    }

    public static void main(String[] args) {
        ExAbstract e1=new ExAbstract();
        e1.automationFramework();
        e1.selenium();
        e1.java();

    }
}
