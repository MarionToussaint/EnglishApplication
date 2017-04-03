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
    private int [] cor = new int[]{R.id.correction1,(R.id.correction2),R.id.correction3,R.id.correction4,R.id.correction5,
            R.id.correction6,R.id.correction7,(R.id.correction8) , R.id.correction9,R.id.correction10};
    private int [] ans = new int[]{(R.id.answer1),R.id.answer2,R.id.answer3,(R.id.answer4),(R.id.answer5),
            (R.id.answer6),R.id.answer7,R.id.answer8,R.id.answer9,R.id.answer10};
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<TextView> listTitle= new ArrayList<TextView>();
    private ArrayList<TextView> listAnswer = new ArrayList<TextView>();
    private ArrayList<TextView> listCorrection= new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Exercise1Model model = new Exercise1Model();
    public Context context;
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

        for (int i=0;i<cor.length;i++){
            listCorrection.add((TextView) findViewById(cor[i]));
        }
        for (int j=0;j<ans.length;j++){
            listAnswer.add((TextView) findViewById(ans[j]));
        }
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
                finish();
            }
        });
    }
}
