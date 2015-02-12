package com.example.julie.sprint1;

import android.app.Application;
import android.content.Context;

/**
 * Created by Julie on 2/11/2015.
 */

public class Accessibility extends Application
{
    private static Context context;

    public void onCreate()
    {
        super.onCreate();
        Accessibility.context = getApplicationContext();
    }

    public static Context getAppContext()
    {
        return Accessibility.context;
    }
}
