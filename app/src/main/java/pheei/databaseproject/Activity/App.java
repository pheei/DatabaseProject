package pheei.databaseproject.Activity;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by hpishepei on 12/7/15.
 */
public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "jlsX029F3w8oAtalZNVISW4ePBl4MUcqZdk2Imns", "AaIx1BIJQB2tlIxXhNlEgiWOHwIfsOJAlxk8R7kL");

    }
}
