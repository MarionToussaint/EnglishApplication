package com.example.mmtou.englishapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OpenActivity extends AppCompatActivity {
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        layout1 = (RelativeLayout)findViewById(R.id.layout1);
        layout2 = (RelativeLayout)findViewById(R.id.layout2);
        layout3 = (RelativeLayout)findViewById(R.id.layout3);

        TextView text = (TextView)findViewById(R.id.title1);
        TextView text1 = (TextView)findViewById(R.id.title2);
        TextView text2 = (TextView)findViewById(R.id.exercise);
        TextView text3 = (TextView)findViewById(R.id.listVerbs);
        TextView text4 = (TextView)findViewById(R.id.study);
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        text.setTypeface(font);
        text1.setTypeface(font2,Typeface.BOLD);
        text2.setTypeface(font2,Typeface.BOLD);
        text3.setTypeface(font2,Typeface.BOLD);
        text4.setTypeface(font2,Typeface.BOLD);

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpenActivity.this,EnglishTrickActivity.class));
            }
        });

        layout2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OpenActivity.this,ListChoiceActivity.class));
            }
        });

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpenActivity.this,ExerciseChoiceActivity.class));
            }
        });
    }
}
