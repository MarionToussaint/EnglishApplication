package com.example.mmtou.englishapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mmtou.englishapplication.activity.Exercise3Activity;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise4Activity extends AppCompatActivity {
    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);

        listTitle.add(((TextView)findViewById(R.id.title)));
        listTitle.add(((TextView)findViewById(R.id.rule)));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise4Activity.this,listTitle);

        listTextView.add(((TextView)findViewById(R.id.verb)));
        listTextView.add(((TextView)findViewById(R.id.verb1)));
        listTextView.add(((TextView)findViewById(R.id.verb2)));
        listTextView.add(((TextView)findViewById(R.id.verb3)));
        listTextView.add(((TextView)findViewById(R.id.verb4)));
        listTextView.add(((TextView)findViewById(R.id.verb5)));

        style.changeFont("fonts/Aprikas_light_Demo.ttf",Exercise4Activity.this,listTextView);
    }
}
