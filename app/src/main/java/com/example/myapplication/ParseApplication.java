package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse files
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zWvOy8bs6JU30YssREFbRGuMsbExN5oAFNIPsrHO")
                .clientKey("FA5T6bsfiOdul1OPaawDK1qD93Qj0sgyEr8yqgJd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
