package com.example.julie.sprint1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity implements View.OnClickListener
{
    //For the log
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References the button elements in the activity_main.xml file
        ImageButton settingsButton = (ImageButton)findViewById(R.id.settingsButton);

        //Listen for clicks
        settingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            //Go to settings
            case R.id.settingsButton:
                Intent intent = new Intent(this, SettingsActivity.class);
                this.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
