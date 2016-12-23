package com.example.mahendran.androidbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListViewImages extends AppCompatActivity {

    ListView listView;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view_images);
        listView= (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.mylistviewone,R.id.textView,days);
        listView.setAdapter(adapter);
    }
}
