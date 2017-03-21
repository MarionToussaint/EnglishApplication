package com.example.mmtou.englishapplication;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.Exercise5Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise5Activity extends AppCompatActivity {
    private int[] text  = new int[] {R.id.title,R.id.rule,R.id.verb,R.id.verb1,R.id.verb2,R.id.verb3,R.id.verb4,R.id.checkBox2,R.id.checkBox1,R.id.checkBox3,R.id.checkBox4,
            R.id.checkBox5,R.id.checkBox6,R.id.checkBox7,R.id.checkBox8,R.id.checkBox9,R.id.checkBox10};
    private ArrayList<TextView> listTextView = new ArrayList<>();
    private Exercise5Model model = new Exercise5Model();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);

        for (int i=0;i<text.length;i++){
            listTextView.add((TextView) findViewById(text[i]));
        }
        style.changeFont("fonts/Aprikas_light_Demo.ttf",Exercise5Activity.this,listTextView);

        //model.oneBoxOnly((CheckBox) findViewById(R.id.checkBox1),(CheckBox) findViewById(R.id.checkBox2));


    }
}
