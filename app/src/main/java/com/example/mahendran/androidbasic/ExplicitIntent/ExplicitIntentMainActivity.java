package com.example.mahendran.androidbasic.ExplicitIntent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mahendran.androidbasic.R;

public class ExplicitIntentMainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_main);
        Button button=(Button)findViewById(R.id.button1);
    }

    public void doSomething(View view) {
        Intent i=new Intent(this,ActivityA.class);
        startActivity(i);
    }
}
