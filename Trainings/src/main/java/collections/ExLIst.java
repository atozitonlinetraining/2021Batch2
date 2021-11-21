package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExLIst {

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("srikanth");
        al.add("muni");
        al.add("pavani");
        al.add("siddhu");
        al.add("pavanaja");
        al.add("thrinay");
        al.add("pavani");
        al.add(1,"akhil");
        String verGet=al.get(2);
        System.out.println(verGet);
        boolean verPav=al.contains("pavani");
        System.out.println(verPav);
        al.remove("siddhu");
        al.remove(3);
        System.out.println("*******Actual Iteration Starts*********");
        Iterator<String> ie=al.iterator();
        while(ie.hasNext()){
            String currentElement=ie.next();
            System.out.println(currentElement);
        }
    }
}
