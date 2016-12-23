package com.example.mahendran.androidbasic;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class MyToggleButton extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    RelativeLayout relativeLayout;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_toggle_button);
        toggleButton= (ToggleButton) findViewById(R.id.toggleButton1);
        relativeLayout= (RelativeLayout) findViewById(R.id.activity_my_toggle_button);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        if(b)
        {
            relativeLayout.setBackgroundColor(Color.BLACK);
        }
        else
        {
            relativeLayout.setBackgroundColor(Color.WHITE);

        }
    }
}
