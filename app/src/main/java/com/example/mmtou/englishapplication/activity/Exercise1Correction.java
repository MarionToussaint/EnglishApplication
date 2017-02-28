package com.example.mmtou.englishapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.Exercise1Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise1Correction extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<TextView> listTitle= new ArrayList<TextView>();
    private ArrayList<TextView> listAnswer = new ArrayList<TextView>();
    private ArrayList<TextView> listCorrection= new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    TextView answer;
    TextView correction;
    private Exercise1Model model = new Exercise1Model();
    public Context context;
    Exercise1Activity c = new Exercise1Activity();
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_correction);

        listTitle.add((TextView)findViewById(R.id.title));
        listTitle.add((TextView)findViewById(R.id.rule));
        listTitle.add((TextView)findViewById(R.id.score));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Correction.this,listTitle);
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
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Correction.this,listTextView);
        //model.setLevel(listTextView,model.list1);

        listAnswer.add((TextView)findViewById(R.id.answer1));
        listCorrection.add((TextView)findViewById(R.id.correction1));
        listAnswer.add((TextView)findViewById(R.id.answer2));
        listCorrection.add((TextView)findViewById(R.id.correction2));
        listAnswer.add((TextView)findViewById(R.id.answer3));
        listCorrection.add((TextView)findViewById(R.id.correction3));
        listAnswer.add((TextView)findViewById(R.id.answer4));
        listCorrection.add((TextView)findViewById(R.id.correction4));
        listAnswer.add((TextView)findViewById(R.id.answer5));
        listCorrection.add((TextView)findViewById(R.id.correction5));
        listAnswer.add((TextView)findViewById(R.id.answer6));
        listCorrection.add((TextView)findViewById(R.id.correction6));
        listAnswer.add((TextView)findViewById(R.id.answer7));
        listCorrection.add((TextView)findViewById(R.id.correction7));
        listAnswer.add((TextView)findViewById(R.id.answer8));
        listCorrection.add((TextView)findViewById(R.id.correction8));
        listAnswer.add((TextView)findViewById(R.id.answer9));
        listCorrection.add((TextView)findViewById(R.id.correction9));
        listAnswer.add((TextView)findViewById(R.id.answer10));
        listCorrection.add((TextView)findViewById(R.id.correction10));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Correction.this,listAnswer);
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise1Correction.this,listCorrection);

        model.changeLevel(Exercise1ChoiceActivity.level,model.list1,model.list2,model.list3,listTextView);

        int score = model.scoreLevel(Exercise1ChoiceActivity.level,Exercise1Activity.i,model.listAnswer,model.listAnswer2,model.listAnswer3);
        ((TextView)findViewById(R.id.score)).setText("Your Score is " + score + "%");
        model.verifyLevel(listAnswer,listCorrection,Exercise1ChoiceActivity.level,Exercise1Activity.i,model.listAnswer,model.listAnswer2,model.listAnswer3);

        Button menu = (Button)findViewById(R.id.button3);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise1Correction.this,menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercise1Correction.this,Exercise1ChoiceActivity.class));
            }
        });
    }
}
