public class MethodOverLoading {
    //Method with Different Parameters and Different Datatypes
    public void search(){
        System.out.println("normal search");
    }

    public void search(String orderid){
        System.out.println("search with orderid");
    }

    public void search(String orderid, String description){
        System.out.println("search with orderid and description");
    }

    public void search(int s_no){
        System.out.println("search with s.no");
    }

    public static void main(String[] args) {
        MethodOverLoading m1=new MethodOverLoading();
        m1.search();
        m1.search(5);
        m1.search("abc12");
        m1.search("abc12","mobile phone");

    }
}
