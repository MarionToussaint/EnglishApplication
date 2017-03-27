package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class OpenActivity extends AppCompatActivity {
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        layout2 = (RelativeLayout)findViewById(R.id.relativeLayout2);
        layout3 = (RelativeLayout)findViewById(R.id.layout3);

        TextView text = (TextView)findViewById(R.id.title1);
        TextView text1 = (TextView)findViewById(R.id.title2);
        TextView text2 = (TextView)findViewById(R.id.exercise);
        TextView text3 = (TextView)findViewById(R.id.listVerbs);
        TextView text4 = (TextView)findViewById(R.id.study);

        listTextView.add(text1);
        listTextView.add(text2);
        listTextView.add(text3);
        listTextView.add(text4);
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",OpenActivity.this,listTextView);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        text.setTypeface(font);

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
