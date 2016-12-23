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

public class MyShared extends AppCompatActivity {

    public static final String DEFAULT="N/A";
    EditText userNameTextView;
    EditText passwordTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shared);
        userNameTextView = (EditText) findViewById(R.id.editText3);
        passwordTextView = (EditText) findViewById(R.id.editText4);
    }
    public void load(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("name",DEFAULT);
        String password=sharedPreferences.getString("password",DEFAULT);

       if(name.equals(DEFAULT)||password.equals(DEFAULT))
        {
            Toast.makeText(this,"No Data",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Yes Data",Toast.LENGTH_LONG).show();
            userNameTextView.setText(name);
            passwordTextView.setText(password);
        }
    }
    public void previous(View view) {
        Toast.makeText(this, "Go to previous", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MySharedPreference.class);
        startActivity(intent);
    }
}
