package com.example.mmtou.englishapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mmtou.englishapplication.activity.Exercise1ChoiceActivity;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class ExerciseChoiceActivity extends AppCompatActivity {
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_choice);

        layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        layout2 = (RelativeLayout)findViewById(R.id.relativeLayout2);
        layout3 = (RelativeLayout)findViewById(R.id.relativeLayout3);

        listTextView.add((TextView)findViewById(R.id.title1));
        listTextView.add((TextView)findViewById(R.id.title3));
        listTextView.add((TextView)findViewById(R.id.exercise0));
        listTextView.add((TextView)findViewById(R.id.exercise1));
        listTextView.add((TextView)findViewById(R.id.exercise2));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",ExerciseChoiceActivity.this,listTextView);

        layout1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercise1ChoiceActivity.class));
            }
        });

        layout2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercise2Activity.class));
            }
        });

    }
}
