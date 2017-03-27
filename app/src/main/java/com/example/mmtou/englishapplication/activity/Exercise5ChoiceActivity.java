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

public class Exercise5ChoiceActivity extends AppCompatActivity {
    int[] text = new int[]{R.id.title1,R.id.title3,R.id.exercise0,R.id.exercise1,R.id.exercise2};
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    public static int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5_choice);

        layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        layout2 = (RelativeLayout)findViewById(R.id.relativeLayout2);
        layout3 = (RelativeLayout)findViewById(R.id.relativeLayout3);

        for (int i=0; i<text.length;i++){
            listTextView.add((TextView) findViewById(text[i]));
        }
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise5ChoiceActivity.this,listTextView);

        layout1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercise5ChoiceActivity.this,Exercise5Activity.class));
                level=1;
            }
        });
        layout2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercise5ChoiceActivity.this,Exercise5Activity.class));
                level=2;
            }
        });
        layout3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercise5ChoiceActivity.this,Exercise5Activity.class));
                level=3;
            }
        });

    }
}
