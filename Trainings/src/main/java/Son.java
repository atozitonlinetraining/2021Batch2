
class GrandFather{
    static String Property3="Fields";
    static String Property4="Gold";
}
class Father extends GrandFather{
    static  String Property1="House";
    static String Property2="Business";
}

//Inheritance: Aquiring Parent class properties in to the child class
public class Son extends Father{

    static String Property5="Job";
    static String Property6="Car";
    public static void main(String[] args) {
        System.out.println(Property3);
        System.out.println(Property4);
        System.out.println(Property5);
        System.out.println(Property6);
        System.out.println(Property1);
        System.out.println(Property2);

    }

}
