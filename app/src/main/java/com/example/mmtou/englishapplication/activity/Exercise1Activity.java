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

        final CheckBox choice1 = (CheckBox)findViewById(R.id.checkBox);
        final CheckBox choice2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox choice3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox choice4 = (CheckBox)findViewById(R.id.checkBox4);
        CheckBox choice5 = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox choice6 = (CheckBox)findViewById(R.id.checkBox6);
        final CheckBox choice7 = (CheckBox)findViewById(R.id.checkBox7);
        final CheckBox choice8 = (CheckBox)findViewById(R.id.checkBox8);
        final CheckBox choice9 = (CheckBox)findViewById(R.id.checkBox9);
        CheckBox choice10 = (CheckBox)findViewById(R.id.checkBox10);
        CheckBox choice11 = (CheckBox)findViewById(R.id.checkBox11);
        CheckBox choice12 = (CheckBox)findViewById(R.id.checkBox12);
        final CheckBox choice13 = (CheckBox)findViewById(R.id.checkBox13);
        final CheckBox choice14 = (CheckBox)findViewById(R.id.checkBox14);
        final CheckBox choice15 = (CheckBox)findViewById(R.id.checkBox15);
        CheckBox choice16 = (CheckBox)findViewById(R.id.checkBox16);
        CheckBox choice17 = (CheckBox)findViewById(R.id.checkBox17);
        CheckBox choice18 = (CheckBox)findViewById(R.id.checkBox18);
        CheckBox choice19 = (CheckBox)findViewById(R.id.checkBox19);
        CheckBox choice20 = (CheckBox)findViewById(R.id.checkBox20);
        CheckBox choice21 = (CheckBox)findViewById(R.id.checkBox21);
        CheckBox choice22 = (CheckBox)findViewById(R.id.checkBox22);
        final CheckBox choice23 = (CheckBox)findViewById(R.id.checkBox23);
        final CheckBox choice24 = (CheckBox)findViewById(R.id.checkBox24);
        final CheckBox choice25 = (CheckBox)findViewById(R.id.checkBox25);
        CheckBox choice26 = (CheckBox)findViewById(R.id.checkBox26);
        CheckBox choice27 = (CheckBox)findViewById(R.id.checkBox27);
        CheckBox choice28 = (CheckBox)findViewById(R.id.checkBox28);
        CheckBox choice29 = (CheckBox)findViewById(R.id.checkBox29);
        CheckBox choice30 = (CheckBox)findViewById(R.id.checkBox30);
        listCheckBox.add(choice1);
        listCheckBox.add(choice2);
        listCheckBox.add(choice3);
        listCheckBox.add(choice4);
        listCheckBox.add(choice5);
        listCheckBox.add(choice6);
        listCheckBox.add(choice7);
        listCheckBox.add(choice8);
        listCheckBox.add(choice9);
        listCheckBox.add(choice10);
        listCheckBox.add(choice11);
        listCheckBox.add(choice12);
        listCheckBox.add(choice13);
        listCheckBox.add(choice14);
        listCheckBox.add(choice15);
        listCheckBox.add(choice16);
        listCheckBox.add(choice17);
        listCheckBox.add(choice18);
        listCheckBox.add(choice19);
        listCheckBox.add(choice20);
        listCheckBox.add(choice21);
        listCheckBox.add(choice22);
        listCheckBox.add(choice23);
        listCheckBox.add(choice24);
        listCheckBox.add(choice25);
        listCheckBox.add(choice26);
        listCheckBox.add(choice27);
        listCheckBox.add(choice28);
        listCheckBox.add(choice29);
        listCheckBox.add(choice30);
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
