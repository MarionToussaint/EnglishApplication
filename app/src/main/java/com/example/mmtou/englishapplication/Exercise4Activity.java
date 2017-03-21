package com.example.mmtou.englishapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.mmtou.englishapplication.activity.Exercise3Activity;
import com.example.mmtou.englishapplication.model.Exercise4Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise4Activity extends AppCompatActivity{
    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    public static ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Exercise4Model model = new Exercise4Model();
    private ArrayList<CheckBox> listC= new ArrayList<CheckBox>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);

        listTitle.add(((TextView) findViewById(R.id.title)));
        listTitle.add(((TextView) findViewById(R.id.rule)));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listTitle);

        listTextView.add(((TextView) findViewById(R.id.verb)));
        listTextView.add(((TextView) findViewById(R.id.verb1)));
        listTextView.add(((TextView) findViewById(R.id.verb2)));
        listTextView.add(((TextView) findViewById(R.id.verb3)));
        listTextView.add(((TextView) findViewById(R.id.verb4)));
        listTextView.add(((TextView) findViewById(R.id.button)));

        listC.add(((CheckBox) findViewById(R.id.verb)));
        listC.add(((CheckBox) findViewById(R.id.verb1)));
        listC.add(((CheckBox) findViewById(R.id.verb2)));
        listC.add(((CheckBox) findViewById(R.id.verb3)));

        style.changeFont("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listTextView);

        System.out.println("WOO/"+((CheckBox)findViewById(R.id.verb)).isChecked());
        System.out.println("OOO/"+((CheckBox)findViewById(R.id.verb)).isClickable());
        model.Clickable(((CheckBox)findViewById(R.id.verb)),((CheckBox)findViewById(R.id.verb1)),((CheckBox)findViewById(R.id.verb2)),((CheckBox)findViewById(R.id.verb3)));
        model.setLevel(model.listLevel1,listTextView);
        model.check((Button)findViewById(R.id.button),listC);



    }
}
