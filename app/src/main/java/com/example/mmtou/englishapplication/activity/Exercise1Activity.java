package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.Exercise1Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise1Activity extends AppCompatActivity {
    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<CheckBox> listCheckBox = new ArrayList<CheckBox>();
    private int[] check = new int[]{R.id.checkBox, R.id.checkBox2,R.id.checkBox3,R.id.checkBox4,R.id.checkBox5,
            R.id.checkBox6,R.id.checkBox7,R.id.checkBox8,R.id.checkBox9,R.id.checkBox10,
            R.id.checkBox11,R.id.checkBox12,R.id.checkBox13,R.id.checkBox14,R.id.checkBox15,
            R.id.checkBox16,R.id.checkBox17,R.id.checkBox18,R.id.checkBox19,R.id.checkBox20,
            R.id.checkBox21,R.id.checkBox22,R.id.checkBox23,R.id.checkBox24,R.id.checkBox25,
            R.id.checkBox26,R.id.checkBox27,R.id.checkBox28,R.id.checkBox29,R.id.checkBox30};

    private StyleModel style = new StyleModel();
    private Exercise1Model model = new Exercise1Model();
    public static int[] i = new int[]{};

    public Exercise1Activity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        listTitle.add((TextView)findViewById(R.id.title));
        listTitle.add((TextView)findViewById(R.id.rule));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Activity.this,listTitle);
        listTextView.add((TextView)findViewById(R.id.verb));
        listTextView.add((TextView)findViewById(R.id.verb2));
        listTextView.add((TextView)findViewById(R.id.verb3));
        listTextView.add((TextView)findViewById(R.id.verb4));
        listTextView.add((TextView)findViewById(R.id.verb5));
        listTextView.add((TextView)findViewById(R.id.verb6));
        listTextView.add((TextView)findViewById(R.id.verb7));
        listTextView.add((TextView)findViewById(R.id.verb8));
        listTextView.add((TextView)findViewById(R.id.verb9));
        listTextView.add((TextView)findViewById(R.id.verb10));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Activity.this,listTextView);


        for (int i=0;i<check.length;i++){
            listCheckBox.add((CheckBox) findViewById(check[i]));
        }
        style.changeCheckBoxFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Activity.this,listCheckBox);

        model.changeLevel(Exercise1ChoiceActivity.level,model.list1,model.list2,model.list3,listTextView);

        Button check = (Button)findViewById(R.id.button2);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise1Activity.this,check);
        Button reset = (Button)findViewById(R.id.button4);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise1Activity.this,reset);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = model.changeAnswerLevel(Exercise1ChoiceActivity.level,model.list1,model.list2,model.list3,listCheckBox);
                startActivity(new Intent(Exercise1Activity.this,Exercise1Correction.class));
                finish();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.clearCheckBox(listCheckBox);
            }
        });


    }
}
