package com.example.mahendran.androidbasic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntentExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_example);
    }

    public void doSomething(View view) {
        Intent intent=null;

        Intent chooser;
        if(view.getId()==R.id.button1)
        {
           intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:13.0827, 80.2707"));
            chooser=Intent.createChooser(intent,"Google Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.button2)
        {
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://paytm.com/"));
            chooser=Intent.createChooser(intent,"Lanch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.button3)
        {
           intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"mahendran20aug@gmail.com","sangeethanisok@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"Mahendran Creat Mail");
            intent.putExtra(Intent.EXTRA_TEXT,"I love you sangeetha");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Sent Mail");
            startActivity(chooser);
        }
    }
}
