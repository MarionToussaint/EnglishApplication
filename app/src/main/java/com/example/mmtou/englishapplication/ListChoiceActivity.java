package com.example.mmtou.englishapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ListChoiceActivity extends AppCompatActivity {
    RelativeLayout CommonList;
    RelativeLayout FullList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_choice);

        TextView text = (TextView)findViewById(R.id.title1);
        TextView text1 = (TextView)findViewById(R.id.title3);
        TextView text2 = (TextView)findViewById(R.id.listVerbs);
        TextView text3 = (TextView)findViewById(R.id.full);
        TextView text4 = (TextView)findViewById(R.id.different);
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        text.setTypeface(font2,Typeface.BOLD);
        text1.setTypeface(font2,Typeface.BOLD);
        text2.setTypeface(font2,Typeface.BOLD);
        text3.setTypeface(font2,Typeface.BOLD);
        text4.setTypeface(font2,Typeface.BOLD);








        CommonList = (RelativeLayout) findViewById(R.id.layout2);
        FullList = (RelativeLayout) findViewById(R.id.layout1);


        CommonList.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ListChoiceActivity.this,CommonListActivity.class));
            }
        });

        FullList.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ListChoiceActivity.this,ListActivity.class));
            }
        });
    }
}
