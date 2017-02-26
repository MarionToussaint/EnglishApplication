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

public class ListChoiceActivity extends AppCompatActivity {
    RelativeLayout CommonList;
    RelativeLayout FullList;
    RelativeLayout DifferentForms;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_choice);

        listTextView.add((TextView)findViewById(R.id.title1));
        listTextView.add((TextView)findViewById(R.id.title3));
        listTextView.add((TextView)findViewById(R.id.listVerbs));
        listTextView.add((TextView)findViewById(R.id.full));
        listTextView.add((TextView)findViewById(R.id.different));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",ListChoiceActivity.this,listTextView);

        CommonList = (RelativeLayout) findViewById(R.id.relativeLayout2);
        FullList = (RelativeLayout) findViewById(R.id.relativeLayout1);
        DifferentForms = (RelativeLayout)findViewById(R.id.layout3);

        DifferentForms.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ListChoiceActivity.this,VerbsDifferentWaysActivity.class));
            }
        });

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
