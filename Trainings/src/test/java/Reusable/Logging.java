package Reusable;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;

public class Logging {

    public static void genLog(String logM, String Message){
        Logger log=Logger.getLogger("Logging");
        PropertyConfigurator.configure("log4j.properties");
        // log.info(Message);
        switch (logM){
            case "info":
                log.info(Message);
                break;
            case "warn":
                log.warn(Message);
                break;
            case "error":
                log.error(Message);
                break;
            case "debug":
                log.debug(Message);
                break;
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        Logger log=Logger.getLogger("Logging");
        PropertyConfigurator.configure("log4j.properties");
        // log.info("hello log");
        genLog("info","able to use log4j successfully");
    }
}

