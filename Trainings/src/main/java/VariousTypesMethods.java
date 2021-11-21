public class VariousTypesMethods {

    //method with no parameters and no return type
    public void sum(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    //method with no parameters and with return type
    public int diff(){
        int a=10;
        int b=5;
        int c=a-b;
        return c;
    }

    //method with parameters and no return type
    public void mul(int a, int b){

        int c=a*b;
        System.out.println(c);
    }

    //method with parameters and return type
    public int div(int a, int b){
        int c=a/b;
        return c;
    }

    public void swapping(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {

        VariousTypesMethods v1=new VariousTypesMethods();
        v1.sum();
        int a=v1.diff();
        System.out.println(a);
        v1.mul(5,10);
        int d=v1.div(10,2);
        System.out.println(d);
        v1.swapping(5,10);
    }
}
