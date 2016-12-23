package com.example.mahendran.androidbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonClickMethodOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_method_one);
    }
    public void doSomething(View view) {
        Toast.makeText(ButtonClickMethodOne.this,"Method One",Toast.LENGTH_SHORT).show();
    }

}
