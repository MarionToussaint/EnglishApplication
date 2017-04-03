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

public class Exercice2ChoiceActivity extends AppCompatActivity {
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    RelativeLayout layout4;
    RelativeLayout layout5;
    RelativeLayout layout6;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    public static int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice2_choice);

        layout1 = (RelativeLayout)findViewById(R.id.relativeLayout1);
        layout2 = (RelativeLayout)findViewById(R.id.relativeLayout2);
        layout3 = (RelativeLayout)findViewById(R.id.relativeLayout3);
        layout4 = (RelativeLayout)findViewById(R.id.relativeLayout4);
        layout5 = (RelativeLayout)findViewById(R.id.relativeLayout5);
        layout6 = (RelativeLayout)findViewById(R.id.relativeLayout6);

        listTextView.add((TextView)findViewById(R.id.title1));
        listTextView.add((TextView)findViewById(R.id.title3));
        listTextView.add((TextView)findViewById(R.id.exercise0));
        listTextView.add((TextView)findViewById(R.id.exercise1));
        listTextView.add((TextView)findViewById(R.id.exercise2));
        listTextView.add((TextView)findViewById(R.id.exercise3));
        listTextView.add((TextView)findViewById(R.id.exercise4));
        listTextView.add((TextView)findViewById(R.id.exercise5));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercice2ChoiceActivity.this,listTextView);

        layout1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercice2ChoiceActivity.this,Exercise2Activity.class));
                level=1;
                finish();
            }
        });
        layout2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercice2ChoiceActivity.this,Exercise2Activity.class));
                level=2;
                finish();
            }
        });
        layout3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercice2ChoiceActivity.this,Exercise2Activity.class));
                level=3;
                finish();
            }
        });

        layout4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercice2ChoiceActivity.this,Exercise2Activity.class));
                level=4;
                finish();
            }
        });
        layout5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercice2ChoiceActivity.this,Exercise2Activity.class));
                level=5;
                finish();
            }
        });
        layout6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Exercice2ChoiceActivity.this,Exercise2Activity.class));
                level=6;
                finish();
            }
        });
    }
}
