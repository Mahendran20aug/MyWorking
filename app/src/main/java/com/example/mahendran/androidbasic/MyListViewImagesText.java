package com.example.mahendran.androidbasic;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MyListViewImagesText extends AppCompatActivity {

    ListView listView;

    int[] images = {R.drawable.capitan, R.drawable.hulk, R.drawable.iron, R.drawable.spider,R.drawable.thor,R.drawable.superman};
    private String[] numberTitle = {"One","Two","Three","Four","Five","Six"};
    private String[] numberDescriptions = {"capitan","hulk","iron","spider","thor","superman"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view_images_text);
        listView= (ListView) findViewById(R.id.listview);

        TestA adapter=new TestA(this, numberTitle, images, numberDescriptions);
        listView.setAdapter(adapter);
    }
}
class TestA extends ArrayAdapter<String>
{
    Context context;
    int[] images;
    String[] titleArray;
    String[] descriptionsArray;
    TestA(Context c,String[] titles, int[] imgs, String[] desc)
    {
        super(c,R.layout.mylistviewimagestextone,R.id.textView,titles);
        this.context=c;
        this.images=imgs;
        this.titleArray=titles;
        this.descriptionsArray=desc;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.mylistviewimagestextone,parent,false);

        ImageView myImage= (ImageView) row.findViewById(R.id.imageView3);
        TextView myTitle= (TextView) row.findViewById(R.id.textView);
        TextView myDescriptions= (TextView) row.findViewById(R.id.textView1);

        myImage.setImageResource(images[position]);
        myTitle.setText(titleArray[position]);
        myDescriptions.setText(descriptionsArray[position]);

        return row;
    }
}
