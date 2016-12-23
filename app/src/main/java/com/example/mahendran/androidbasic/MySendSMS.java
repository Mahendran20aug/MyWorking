package com.example.mahendran.androidbasic;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MySendSMS extends AppCompatActivity {

    EditText mobileno,message;
    Button sendsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_send_sms);

        mobileno= (EditText) findViewById(R.id.EditText1);
        message= (EditText) findViewById(R.id.EditText2);
        sendsms= (Button) findViewById(R.id.button1);

        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no=mobileno.getText().toString();
                String msg=message.getText().toString();

                Intent intent=new Intent(getApplicationContext(),MySendSMS.class);
                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);

                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(no, null, msg, pi,null);

                Toast.makeText(getApplicationContext(), "Message Sent successfully!", Toast.LENGTH_LONG).show();
            }
        });
    }


}
