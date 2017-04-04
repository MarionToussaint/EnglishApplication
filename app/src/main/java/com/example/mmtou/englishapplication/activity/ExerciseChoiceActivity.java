package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class ExerciseChoiceActivity extends AppCompatActivity {
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    RelativeLayout layout4;
    RelativeLayout layout5;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private int[] string = new int[]{R.id.title1,R.id.title3,R.id.exercise0,R.id.exercise1,R.id.exercise2,R.id.exercise3,R.id.exercise4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_choice);

        layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        layout2 = (RelativeLayout)findViewById(R.id.relativeLayout2);
        layout3 = (RelativeLayout)findViewById(R.id.relativeLayout3);
        layout4 = (RelativeLayout)findViewById(R.id.relativeLayout4);
        layout5 = (RelativeLayout)findViewById(R.id.relativeLayout5);

        for (int i=0;i<string.length;i++){
            listTextView.add((TextView)findViewById(string[i]));
        }
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",ExerciseChoiceActivity.this,listTextView);

        layout1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercise1ChoiceActivity.class));
            }
        });

        layout2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercice2ChoiceActivity.class));
            }
        });

        layout3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercise3ChoiceActivity.class));
            }
        });

        layout4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercise4ChoiceActivity.class));
            }
        });

        layout5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ExerciseChoiceActivity.this,Exercise5ChoiceActivity.class));
            }
        });
    }
}
