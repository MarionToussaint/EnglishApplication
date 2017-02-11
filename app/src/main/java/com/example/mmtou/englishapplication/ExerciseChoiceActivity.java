package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExerciseChoiceActivity extends AppCompatActivity {
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_choice);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");

        layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        layout2 = (RelativeLayout)findViewById(R.id.relativeLayout2);
        layout3 = (RelativeLayout)findViewById(R.id.relativeLayout3);

        TextView text = (TextView)findViewById(R.id.title1);
        TextView text2 = (TextView)findViewById(R.id.easy);
        TextView text3 = (TextView)findViewById(R.id.medium);
        TextView text4 = (TextView)findViewById(R.id.hard);

        text.setTypeface(font);
        text2.setTypeface(font2);
        text3.setTypeface(font2);
        text4.setTypeface(font2);
    }
}
