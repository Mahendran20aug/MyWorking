package com.example.mahendran.androidbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ButtonClickMethodTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_method_two);
    }

    public void doSomething(View view) {
        if(view.getId()==R.id.button1)
        {
            Toast.makeText(ButtonClickMethodTwo.this,"Method One",Toast.LENGTH_SHORT).show();
        }
        else if(view.getId()==R.id.button2)
        {
            Toast.makeText(ButtonClickMethodTwo.this,"Method Two",Toast.LENGTH_SHORT).show();
        }
        else if(view.getId()==R.id.button3)
        {
            Toast.makeText(ButtonClickMethodTwo.this,"Method Three",Toast.LENGTH_SHORT).show();
        }
    }
}
