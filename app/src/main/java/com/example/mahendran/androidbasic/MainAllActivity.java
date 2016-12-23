package com.example.mahendran.androidbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.mahendran.androidbasic.ExplicitIntent.ExplicitIntentMainActivity;

public class MainAllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all);
    }

    public void button(View view) {
        Intent intent=new Intent(this,ButtonClickMethodOne.class);
        startActivity(intent);
    }

    public void button1(View view) {
        Intent intent=new Intent(this,ButtonClickMethodTwo.class);
        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent=new Intent(this,ButtonClickMethodThree.class);
        startActivity(intent);
    }

    public void lifecycle(View view) {
        Intent intent=new Intent(this,ActivityLifecycle.class);
        startActivity(intent);
    }

    public void explicitIntent(View view) {
        Intent intent=new Intent(this,ExplicitIntentMainActivity.class);
        startActivity(intent);
    }

    public void Intent(View view) {
        Intent intent=new Intent(this,IntentExample.class);
        startActivity(intent);
    }

    public void Frame(View view) {
        Intent intent=new Intent(this,FrameLayout.class);
        startActivity(intent);
    }

    public void Check(View view) {

        Intent intent=new Intent(this,MyCheckBox.class);
        startActivity(intent);

    }

    public void Button(View view) {
        Intent intent=new Intent(this,MyToggleButton.class);
        startActivity(intent);


    }

    public void list(View view) {
        Intent intent=new Intent(this,MyListView.class);
        startActivity(intent);
    }
}
