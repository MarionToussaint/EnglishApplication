package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.Exercise2Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

public class Exercise2CorrectionActivity extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<TextView> listTitle= new ArrayList<TextView>();
    private ArrayList<TextView> listAnswer = new ArrayList<TextView>();
    private ArrayList<TextView> listCorrection= new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Exercise2Model model = new Exercise2Model();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2_correction);

        listTitle.add((TextView)findViewById(R.id.title));
        listTitle.add((TextView)findViewById(R.id.rule));
        listTitle.add((TextView)findViewById(R.id.score));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise2CorrectionActivity.this,listTitle);
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
        listTextView.add((TextView)findViewById(R.id.verb11));
        listTextView.add((TextView)findViewById(R.id.verb12));
        listTextView.add((TextView)findViewById(R.id.verb13));
        listTextView.add((TextView)findViewById(R.id.verb14));
        listTextView.add((TextView)findViewById(R.id.verb15));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise2CorrectionActivity.this,listTextView);
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
        listAnswer.add((TextView)findViewById(R.id.answer11));
        listCorrection.add((TextView)findViewById(R.id.correction11));
        listAnswer.add((TextView)findViewById(R.id.answer12));
        listCorrection.add((TextView)findViewById(R.id.correction12));
        listAnswer.add((TextView)findViewById(R.id.answer13));
        listCorrection.add((TextView)findViewById(R.id.correction13));
        listAnswer.add((TextView)findViewById(R.id.answer14));
        listCorrection.add((TextView)findViewById(R.id.correction14));
        listAnswer.add((TextView)findViewById(R.id.answer15));
        listCorrection.add((TextView)findViewById(R.id.correction15));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise2CorrectionActivity.this,listAnswer);
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise2CorrectionActivity.this,listCorrection);

        model.changeLevel(Exercice2ChoiceActivity.level,model.listLevel1,model.listLevel2,model.listLevel3,model.listLevel4,model.listLevel5,model.listLevel6,listTextView);

        model.verifyLevel(listAnswer,listCorrection, Exercice2ChoiceActivity.level, Exercise2Activity.i,model.listLevel1,model.listLevel2,model.listLevel3,model.listLevel4,model.listLevel5,model.listLevel6);
        int score = model.scoreLevel(Exercice2ChoiceActivity.level,Exercise2Activity.i, model.listLevel1,model.listLevel2,model.listLevel3,model.listLevel4,model.listLevel5,model.listLevel6);
        ((TextView)findViewById(R.id.score)).setText("Your Score is " + score + "%");

        Button menu = (Button)findViewById(R.id.button3);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise2CorrectionActivity.this,menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercise2CorrectionActivity.this,Exercice2ChoiceActivity.class));
                finish();
            }
        });
    }
}
