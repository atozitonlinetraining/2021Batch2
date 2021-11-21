public class Exceptions {

    public static void arithmeticException(){
        try {
            System.out.println(5/5);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

    }

    public static void nullPointerException(){
        try {
            String name=null;
            int size=name.length();
            System.out.println(size);
        }catch(NullPointerException e){
            System.out.println(e);
        }

    }

    public static void numberformatexception(){
        try {
           int a=Integer.parseInt("sai");
            System.out.println(a);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("irrespective of exception or not exception finally block will not be executed");
        }
    }


    public static void main(String[] args) {
//        arithmeticException();
//        nullPointerException();
        numberformatexception();
    }
}
