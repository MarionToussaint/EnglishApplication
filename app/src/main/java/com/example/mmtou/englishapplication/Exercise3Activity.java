package com.example.mmtou.englishapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mmtou.englishapplication.activity.Exercise2Activity;
import com.example.mmtou.englishapplication.activity.Exercise2CorrectionActivity;
import com.example.mmtou.englishapplication.model.Exercise2Model;
import com.example.mmtou.englishapplication.model.Exercise3Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise3Activity extends AppCompatActivity {
    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<EditText> listEditText = new ArrayList<EditText>();
    private StyleModel style = new StyleModel();
    private Exercise3Model model = new Exercise3Model();
    public static String[] i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        listTitle.add(((TextView)findViewById(R.id.title)));
        listTitle.add(((TextView)findViewById(R.id.rule)));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise3Activity.this,listTitle);

        listTextView.add(((TextView)findViewById(R.id.verb)));
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
        style.changeFont("fonts/Aprikas_light_Demo.ttf",Exercise3Activity.this,listTextView);

        listEditText.add(((EditText) findViewById(R.id.editText)));
        listEditText.add(((EditText) findViewById(R.id.editText2)));
        listEditText.add(((EditText)findViewById(R.id.editText3)));
        listEditText.add(((EditText) findViewById(R.id.editText4)));
        listEditText.add(((EditText)findViewById(R.id.editText5)));
        listEditText.add(((EditText)findViewById(R.id.editText6)));
        listEditText.add(((EditText)findViewById(R.id.editText7)));
        listEditText.add(((EditText)findViewById(R.id.editText8)));
        listEditText.add(((EditText)findViewById(R.id.editText9)));
        listEditText.add(((EditText)findViewById(R.id.editText10)));
        listEditText.add(((EditText)findViewById(R.id.editText11)));
        listEditText.add(((EditText)findViewById(R.id.editText12)));
        listEditText.add(((EditText)findViewById(R.id.editText13)));
        listEditText.add(((EditText)findViewById(R.id.editText14)));
        listEditText.add(((EditText)findViewById(R.id.editText15)));
        listEditText.add(((EditText)findViewById(R.id.editText16)));
        listEditText.add(((EditText)findViewById(R.id.editText17)));
        listEditText.add(((EditText)findViewById(R.id.editText18)));
        listEditText.add(((EditText)findViewById(R.id.editText19)));
        listEditText.add(((EditText)findViewById(R.id.editText20)));
        listEditText.add(((EditText)findViewById(R.id.editText21)));
        listEditText.add(((EditText)findViewById(R.id.editText22)));
        listEditText.add(((EditText)findViewById(R.id.editText23)));
        listEditText.add(((EditText)findViewById(R.id.editText24)));
        listEditText.add(((EditText)findViewById(R.id.editText25)));
        listEditText.add(((EditText)findViewById(R.id.editText26)));
        listEditText.add(((EditText)findViewById(R.id.editText27)));
        listEditText.add(((EditText)findViewById(R.id.editText28)));
        listEditText.add(((EditText)findViewById(R.id.editText29)));
        listEditText.add(((EditText)findViewById(R.id.editText30)));
        style.changeFontEdittext("fonts/Aprikas_light_Demo.ttf",Exercise3Activity.this,listEditText);

        model.setLevel(listTextView,model.listLevel1,model.level1);
        model.setEditText(listEditText,model.level1);

        Button check = (Button)findViewById(R.id.button2);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise3Activity.this,check);
        Button reset = (Button)findViewById(R.id.button4);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise3Activity.this,reset);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = model.answerList(listEditText);
                startActivity(new Intent(Exercise3Activity.this,Exercise3Correction.class));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.clearEditText(listEditText);
            }
        });
    }
}
