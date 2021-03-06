package com.lordkote.gmail;

import com.manywho.sdk.services.BaseApplication;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends BaseApplication{
    public Application(){
        registerSdk()
                .packages("com.lordkote.gmail")
                .register(new ApplicationBinder());
    }

    public static void main(String[] args) {
        startServer(new Application(), "api/gmail/1");
    }
}