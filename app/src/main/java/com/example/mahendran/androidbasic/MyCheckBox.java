package com.example.mahendran.androidbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MyCheckBox extends AppCompatActivity implements View.OnClickListener {
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_check_box);
        checkBox= (CheckBox) findViewById(R.id.checkBox1);
        checkBox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        CheckBox t = (CheckBox) v;
        if(t.isChecked())
        {
            Toast.makeText(this,"I m Mahendram",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"I m not Mahendram",Toast.LENGTH_SHORT).show();
        }
    }
}
