package com.example.mahendran.androidbasic.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mahendran.androidbasic.R;

public class MySharedff extends AppCompatActivity {


    private EditText editdd;
    private SharedPreferences sharedPreferences;
    private EditText passworddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editdd=(EditText)findViewById(R.id.editText5);
        passworddd=(EditText)findViewById(R.id.editText);

        sharedPreferences=getSharedPreferences("MhhhData", Context.MODE_PRIVATE);
    }
    //retrive data from xml
    public void toast(View view) {
        String name=sharedPreferences.getString("name","ffrffff");
        String pass=sharedPreferences.getString("pass","ffrffff");
        Log.d("pass", "toast: "+name);
        Log.d("passs", "toast: "+pass);
        Toast.makeText(this,name+"    "+pass,Toast.LENGTH_LONG).show();

    }

    public void savemyda(View view) {
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",editdd.getText().toString());
        editor.putString("pass",passworddd.getText().toString());
        editor.commit();
    }
}
