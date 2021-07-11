package com.example;

import static spark.Spark.*;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class App {

    static Logger LOGGER = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args ) {

        String jdkVendor = System.getProperty("java.vm.vendor");
        String message = "Hello World from this JDK Vendor : " + jdkVendor + "\n";

        String sPort = System.getProperty("port", "8081");
        Integer iPort = Integer.valueOf(sPort);

        port(iPort);

        get("/", (req, res) -> message);
    }
}
