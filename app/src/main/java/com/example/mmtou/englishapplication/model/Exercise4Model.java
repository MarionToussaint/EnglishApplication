package com.example.mmtou.englishapplication.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mmtou.englishapplication.Exercise4Activity;
import com.example.mmtou.englishapplication.ExerciseChoiceActivity;
import com.example.mmtou.englishapplication.activity.Exercise1ChoiceActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by mmtou on 08/03/2017.
 */
public class Exercise4Model {
    public String[] listLevel1 = new String[]{"read","feel", "play", "see",
            "listen", "do", "go", "make", "know", "help", "say", "think",
            "like", "write", "forget", "eat","take", "bring", "cut", "clean",
            "watch", "be", "have", "meet", "put", "buy", "cook", "teach",
            "catch", "find", "answer", "lose","want", "tell", "win", "sit",
            "sell", "build", "drink", "open"};
    public String[] answerList = new String[]{"read","do","help","like","eat","clean","put","teach","want","sell"};

    public Exercise4Model(){
    }

    public void setLevel(String[] s,ArrayList<TextView> l){
        int j=0;
        for (int i=0; i<l.size()-2;i++){
            l.get(i).setText(s[j]);
            j++;
        }
    }

    public void Clickable(final CheckBox c1,final CheckBox c2, final CheckBox c3, final CheckBox c4){
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked){
                    c2.setClickable(false);
                    c3.setClickable(false);
                    c4.setClickable(false);
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked){
                    c1.setClickable(false);
                    c3.setClickable(false);
                    c4.setClickable(false);
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked){
                    c1.setClickable(false);
                    c2.setClickable(false);
                    c4.setClickable(false);
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked){
                    c1.setClickable(false);
                    c2.setClickable(false);
                    c3.setClickable(false);
                }
            }
        });
    }

    public String answerChecked(CheckBox box1, CheckBox box2, CheckBox box3,CheckBox box4){
        String answer = "";
        if ((!box1.isChecked()) && (!box2.isChecked()) && (!box3.isChecked()) && (!box4.isChecked()))
            answer = "No Answer";
        else if (box1.isChecked() && (!box2.isChecked()) && (!box3.isChecked()) && (!box4.isChecked()))
            answer = (String) box1.getText();
        else if (box2.isChecked() && (!box1.isChecked()) && (!box3.isChecked()) && (!box4.isChecked()))
            answer = (String) box2.getText();
        else if (box3.isChecked() && (!box2.isChecked()) && (!box1.isChecked()) && (!box4.isChecked()))
            answer = (String) box3.getText();
        else if ((!box1.isChecked()) && (!box2.isChecked()) && (!box3.isChecked()) && (box4.isChecked()))
            answer = (String) box4.getText();

        return answer;
    }

    public void check(Button b,final ArrayList<CheckBox> l){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = answerChecked(l.get(0),l.get(1),l.get(2),l.get(3));
                System.out.println("Answer is : "+answer);
            }
        });
    }



        /*if (i < (list.length - 1)) {
            if (((list[i][1]).equals(p1.getText().toString())) && ((list[i][2]).equals(pp1.getText().toString()))) {
                Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                point ++;
            } else {
                Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                correction = ((list[i][0]) + "  |  " + (list[i][1]) + "  |  " + (list[i][2]) + "  |  " + (list[i][3]));
                showPopup();
            }
            p1.getText().clear();
            pp1.getText().clear();
            verb.setText(list[i+1][0]);
            page.setText((i+2) + " / " + ListVerb.listLevel1.length);
        } else if (i == (list.length - 1)) {
            if (((list[i][1]).equals(p1.getText().toString())) && ((list[i][2]).equals(pp1.getText().toString()))) {
                Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                point++;
            } else {
                Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                correction = ((list[i][0]) + "  |  " + (list[i][1]) + "  |  " + (list[i][2]) + "  |  " + (list[i][3]));
                showPopup();
            }
        } else {
            startActivity(new Intent(Level1EasyActivity.this, EasyActivity.class));
        }
    }*/



}
