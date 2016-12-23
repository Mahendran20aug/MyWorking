package com.example.mahendran.androidbasic.SharedPreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mahendran.androidbasic.R;

public class MySharedPreference extends AppCompatActivity {

    EditText userName;
    EditText passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shared_preference);
        userName= (EditText) findViewById(R.id.username);
        passWord= (EditText) findViewById(R.id.password);
    }

    public void save(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("MyData ", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",userName.getText().toString());
        editor.putString("password",passWord.getText().toString());
        editor.commit();
        Toast.makeText(this,"Data was saved Successfully",Toast.LENGTH_LONG).show();
    }
    public void next(View view){
        Intent intent=new Intent(this,MyShared.class);
        startActivity(intent);
        Toast.makeText(this,"Go to next",Toast.LENGTH_LONG).show();

    }
}
