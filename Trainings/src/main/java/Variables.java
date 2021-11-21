public class Variables {

    //instance variable
    int b=20;
    //static variable
    static int c=30;
    //global variable
    public static int d=40;
    public static void main(String[] args) {
        //local variable
        int a=10;
        System.out.println(a);
        //To call instance variable inside of the main method, we need to create an object
        //syntax for creating object
        //ClassName objName=new ClassName();
        Variables v1=new Variables();
        System.out.println(v1.b);
        System.out.println(c);
        System.out.println(d);

    }
}
