package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.Exercise4Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise4Activity extends AppCompatActivity {
    public int[] textview = new int [] {R.id.textView,R.id.textView2,R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7,R.id.textView8,R.id.textView9,R.id.textView10};
    public int[] edittext = new int [] {R.id.editText,R.id.editText2,R.id.editText3,R.id.editText4,R.id.editText5,R.id.editText6,R.id.editText7,R.id.editText8,R.id.editText9,R.id.editText10};

    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    public static ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Exercise4Model model = new Exercise4Model();
    private ArrayList<EditText> listEdit= new ArrayList<EditText>();
    public static String[] i;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);

        for (int i=0;i<edittext.length;i++){
            listEdit.add((EditText) findViewById(edittext[i]));
        }

        for (int i=0;i<textview.length;i++){
            listTextView.add((TextView) findViewById(textview[i]));
        }

        listTitle.add(((TextView) findViewById(R.id.title)));
        listTitle.add(((TextView) findViewById(R.id.rule)));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listTitle);
        style.changeFontEdittext("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listEdit);
        style.changeFont("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listTextView);

        model.changeLevel(Exercise4ChoiceActivity.level,model.listLevel1,model.listLevel2,model.listLevel3,listTextView);

        Button check = (Button)findViewById(R.id.button2);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise4Activity.this,check);
        Button reset = (Button)findViewById(R.id.button4);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise4Activity.this,reset);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = model.answerList(listEdit);
                startActivity(new Intent(Exercise4Activity.this,Exercise4CorrectionActivity.class));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.clearEditText(listEdit);
            }
        });
    }


}
