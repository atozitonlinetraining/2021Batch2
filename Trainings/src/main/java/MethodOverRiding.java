class Parent{
    public void company(){
        System.out.println("company is not restablished");
    }
    public void staff(){
        System.out.println("staff is not changed");
    }

    public void employeeCount(String count){
        System.out.println("count not changed");
    }
}

public class MethodOverRiding extends Parent {

    public void employeeCount(String count1){
        System.out.println("count is changed");
    }
    public static void main(String[] args) {
        MethodOverRiding m1=new MethodOverRiding();
        m1.company();
        m1.employeeCount("number");
        m1.staff();
    }
}
