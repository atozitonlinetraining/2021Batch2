package Reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AConfig extends Logging{


    public static String userdata(String credentials) throws IOException {
        FileInputStream fis=new FileInputStream("config.properties");
        Properties pro=new Properties();
        pro.load(fis);
        String pro1=pro.getProperty(credentials);
        return pro1;
    }
//    public static void main(String[] args) throws IOException, InterruptedException {
//        FileInputStream fis=new FileInputStream("config.properties");
//        Properties pro=new Properties();
//        pro.load(fis);
//        String pro1=pro.getProperty("username");
//        System.out.println(pro1);
//
//    }
}
