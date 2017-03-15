package com.example.mmtou.englishapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mmtou.englishapplication.activity.Exercise3Activity;
import com.example.mmtou.englishapplication.model.Exercise4Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise4Activity extends AppCompatActivity {
    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Exercise4Model model = new Exercise4Model();

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
        listTextView.add(((TextView)findViewById(R.id.verb6)));
        listTextView.add(((TextView)findViewById(R.id.verb7)));
        listTextView.add(((TextView)findViewById(R.id.verb8)));
        listTextView.add(((TextView)findViewById(R.id.verb9)));
        listTextView.add(((TextView)findViewById(R.id.verb10)));
        listTextView.add(((TextView)findViewById(R.id.verb11)));
        listTextView.add(((TextView)findViewById(R.id.verb12)));
        listTextView.add(((TextView)findViewById(R.id.verb13)));
        listTextView.add(((TextView)findViewById(R.id.verb14)));
        listTextView.add(((TextView)findViewById(R.id.verb15)));
        listTextView.add(((TextView)findViewById(R.id.verb16)));
        listTextView.add(((TextView)findViewById(R.id.verb17)));
        listTextView.add(((TextView)findViewById(R.id.verb18)));
        listTextView.add(((TextView)findViewById(R.id.verb19)));
        listTextView.add(((TextView)findViewById(R.id.verb20)));
        listTextView.add(((TextView)findViewById(R.id.verb21)));
        listTextView.add(((TextView)findViewById(R.id.verb22)));
        listTextView.add(((TextView)findViewById(R.id.verb23)));
        listTextView.add(((TextView)findViewById(R.id.verb24)));
        listTextView.add(((TextView)findViewById(R.id.verb25)));
        listTextView.add(((TextView)findViewById(R.id.verb26)));
        listTextView.add(((TextView)findViewById(R.id.verb27)));
        listTextView.add(((TextView)findViewById(R.id.verb28)));
        listTextView.add(((TextView)findViewById(R.id.verb29)));
        listTextView.add(((TextView)findViewById(R.id.verb30)));
        listTextView.add(((TextView)findViewById(R.id.verb31)));
        listTextView.add(((TextView)findViewById(R.id.verb32)));
        listTextView.add(((TextView)findViewById(R.id.verb33)));
        listTextView.add(((TextView)findViewById(R.id.verb34)));
        listTextView.add(((TextView)findViewById(R.id.verb35)));
        listTextView.add(((TextView)findViewById(R.id.verb36)));
        listTextView.add(((TextView)findViewById(R.id.verb37)));
        listTextView.add(((TextView)findViewById(R.id.verb38)));
        listTextView.add(((TextView)findViewById(R.id.verb39)));
        style.changeFont("fonts/Aprikas_light_Demo.ttf",Exercise4Activity.this,listTextView);

        model.setLevel(listTextView,model.listLevel1);
        System.out.println("DDE /" +((TextView)findViewById(R.id.title)).getCurrentTextColor());

        //model.clickVerbGlobal(listTextView);
        int s = model.clickVerb(((TextView)findViewById(R.id.verb)),((TextView)findViewById(R.id.verb2)),((TextView)findViewById(R.id.verb3)),((TextView)findViewById(R.id.verb4)));
        System.out.println("NIQUE /" +s);
        //model.click(((TextView)findViewById(R.id.verb)));

    }
}
