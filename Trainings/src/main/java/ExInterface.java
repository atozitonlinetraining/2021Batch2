interface A{
    public  void framework();
    public void selenium();
    public void java();
}

interface B {
    public void git();
}

interface C extends B, A{
    public void jenkins();
}


public class ExInterface implements C {


    public void framework() {
        System.out.println("framework");
    }

    public void selenium() {
        System.out.println("selenium");
    }

    public void java() {
        System.out.println("java");
    }

    public static void main(String[] args) {
        ExInterface e1=new ExInterface();
        e1.framework();
        e1.selenium();
        e1.java();
        e1.git();
        e1.jenkins();
    }

    public void git() {
        System.out.println("git");
    }


    public void jenkins() {
        System.out.println("jenkins");
    }
}
