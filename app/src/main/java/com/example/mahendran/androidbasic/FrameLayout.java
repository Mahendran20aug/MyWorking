package com.example.mahendran.androidbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity implements View.OnClickListener{

    ImageView it1,it2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        it1=(ImageView)findViewById(R.id.imageView);
        it2=(ImageView)findViewById(R.id.imageView1);

        it1.setOnClickListener(this);
        it2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView)
        {
            it1.setVisibility(View.GONE);
            it2.setVisibility(View.VISIBLE);
        }
        else
        {
            it1.setVisibility(View.VISIBLE);
            it2.setVisibility(View.GONE);
        }

    }

}
