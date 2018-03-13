package com.bzsoft.mservice;

import static spark.Spark.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;


public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private Main() {
        // empty
    }

    private final void configure(final int port) {
        Gson gson = new Gson();
        
        port(port);
        
        int maxThreads = 8;
        int minThreads = 2;
        int timeOutMillis = 30000;
        threadPool(maxThreads, minThreads, timeOutMillis);        
        
        staticFiles.location("/public");
		after((req, res) -> {
			res.header("Content-Encoding", "gzip");
		});
		
        get("/hello", (req, res) -> "Hello World");
        //raw
        //get("/hello", (request, response) -> new MyMessage("Hello World"), gson::toJson);
        //https://sites.google.com/site/gson/streaming
        
        //filters: elements, list or list of tuples
    }

    public static void main(final String[] args) throws Exception {
        LOGGER.info("Starting ...");
        final Main m = new Main();
        m.configure(8080);
    }
}
