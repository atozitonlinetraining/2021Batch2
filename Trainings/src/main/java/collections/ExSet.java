package collections;

import java.util.*;

public class ExSet {
    public static void hasSet(){

        HashSet<String> al=new HashSet<>();
        al.add("srikanth");
        al.add("muni");
        al.add("pavani");
        al.add("siddhu");
        al.add("pavanaja");
        al.add("thrinay");
        al.add("pavani");
        Iterator<String> ie=al.iterator();
        while(ie.hasNext()){
            String indElement=ie.next();
            System.out.println(indElement);
        }
    }

    public static void linkedhasSet(){

        LinkedHashSet<String> al=new LinkedHashSet<>();
        al.add("srikanth");
        al.add("muni");
        al.add("pavani");
        al.add("siddhu");
        al.add("pavanaja");
        al.add("thrinay");
        al.add("pavani");
        Iterator<String> ie=al.iterator();
        while(ie.hasNext()){
            String indElement=ie.next();
            System.out.println(indElement);
        }
    }

    public static void treeset(){

        TreeSet<String> al=new TreeSet<>();
        al.add("srikanth");
        al.add("muni");
        al.add("pavani");
        al.add("siddhu");
        al.add("pavanaja");
        al.add("thrinay");
        al.add("pavani");
        Iterator<String> ie=al.iterator();
        while(ie.hasNext()){
            String indElement=ie.next();
            System.out.println(indElement);
        }
    }

    public static void main(String[] args) {
        hasSet();
        System.out.println("***********************");
        linkedhasSet();
        System.out.println("***********************");
        treeset();
    }
}
