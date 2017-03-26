package com.example.mmtou.englishapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mmtou.englishapplication.activity.Exercice2ChoiceActivity;
import com.example.mmtou.englishapplication.activity.Exercise2Activity;
import com.example.mmtou.englishapplication.activity.Exercise2CorrectionActivity;
import com.example.mmtou.englishapplication.activity.Exercise3Activity;
import com.example.mmtou.englishapplication.model.Exercise4Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Exercise4Activity extends AppCompatActivity {
    public int[] textview = new int [] {R.id.textView,R.id.textView2,R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7,R.id.textView8,R.id.textView9,R.id.textView10};
    public int[] edittext = new int [] {R.id.editText,R.id.editText2,R.id.editText3,R.id.editText4,R.id.editText5,R.id.editText6,R.id.editText7,R.id.editText8,R.id.editText9,R.id.editText10};

    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    public static ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Exercise4Model model = new Exercise4Model();
    private ArrayList<EditText> listEdit= new ArrayList<EditText>();
    String[] i;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);

        for (int i=0;i<edittext.length;i++){
            listEdit.add((EditText) findViewById(edittext[i]));
        }

        for (int i=0;i<textview.length;i++){
            listTextView.add((CheckBox) findViewById(textview[i]));
        }

        listTitle.add(((TextView) findViewById(R.id.title)));
        listTitle.add(((TextView) findViewById(R.id.rule)));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listTitle);
        style.changeFontEdittext("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listEdit);
        style.changeFont("fonts/Aprikas_light_Demo.ttf", Exercise4Activity.this, listTextView);

        model.setLevel(listTextView,model.listLevel1);

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
