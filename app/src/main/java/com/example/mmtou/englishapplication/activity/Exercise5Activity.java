package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.Exercise5Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise5Activity extends AppCompatActivity {
    public static String[] i;
    private int[] text  = new int[] {R.id.title,R.id.rule,R.id.verb,R.id.verb1,R.id.verb2,R.id.verb3,R.id.verb4,R.id.verb6,R.id.verb7,R.id.verb8,R.id.verb9,R.id.verb10};
    private int[] check = new int[]{R.id.checkBox2,R.id.checkBox1,R.id.checkBox3,R.id.checkBox4,
            R.id.checkBox5,R.id.checkBox6,R.id.checkBox7,R.id.checkBox8,R.id.checkBox9,R.id.checkBox10,R.id.checkBox11,R.id.checkBox12,R.id.checkBox13,R.id.checkBox14,
            R.id.checkBox15,R.id.checkBox16,R.id.checkBox17,R.id.checkBox18,R.id.checkBox19,R.id.checkBox20};
    private ArrayList<TextView> listTextView = new ArrayList<>();
    private ArrayList<TextView> listTitle = new ArrayList<>();
    private ArrayList<CheckBox> listCheckBox = new ArrayList<>();
    private Exercise5Model model = new Exercise5Model();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);

        for (int i=0;i<2;i++){
            listTitle.add((TextView) findViewById(text[i]));
        }

        for (int i=2;i<text.length;i++){
            listTextView.add((TextView) findViewById(text[i]));
        }

        for (int i=0;i<check.length;i++){
            listCheckBox.add((CheckBox) findViewById(check[i]));
        }

        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise5Activity.this,listTitle);
        style.changeCheckBoxFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise5Activity.this,listCheckBox);
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise5Activity.this,listTextView);

        model.changeLevel(Exercise5ChoiceActivity.level,model.listVerb1,model.listVerb2,model.listVerb3,listTextView);
        //model.clickableGlobal(listCheckBox);

        Button check = (Button)findViewById(R.id.button2);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise5Activity.this,check);
        Button reset = (Button)findViewById(R.id.button4);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise5Activity.this,reset);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = model.answerCheckedGlobal(listCheckBox,model.listVerb1);
                startActivity(new Intent(Exercise5Activity.this,Exercise5CorrectionActivity.class));
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
