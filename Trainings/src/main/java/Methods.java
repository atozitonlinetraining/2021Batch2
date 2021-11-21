public class Methods {

    public void normalMethod(){
        System.out.println("normal method");
    }

    public static void staticMethod(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        staticMethod();
        //object is not but reference of the class
        //syntax of the object
        //ClassName objName=new ClassName();
        Methods m1=new Methods();
        m1.normalMethod();
    }
}
