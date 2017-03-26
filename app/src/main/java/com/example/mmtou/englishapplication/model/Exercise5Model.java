package com.example.mmtou.englishapplication.model;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 17/03/2017.
 */

public class Exercise5Model {
    public String[] listVerb = new String[]{"learn","play","swell","say","come"};
    public String [] listAnswer = new String[]{"TRUE","FALSE","TRUE","FALSE","FALSE"};
    public String[] listConjugaison = new String[]{"learn","play","swell","say","come"};

    public void setLevel(ArrayList<TextView> l, String[] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i]);
            i++;
        }
    }

    /*public void clickable(final CheckBox c1, final CheckBox c2) {
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    c2.setClickable(false);
                else {
                    c2.clearAnimation();
                    c1.clearAnimation();
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    c1.setClickable(false);
            }
        });
    }

    public void clickableGlobal(ArrayList<CheckBox> l){
        int size = (l.size())/2;
        int j = 0;
        for (int i=0; i<size;i++){
            clickable(l.get(j),l.get(j+1));
            j+=2;
        }
    }*/

    public int score(String[] correct, String [] answer){
        int score = 0;
        for (int i=0; i<correct.length;i++){
            if (correct[i].equals(answer[i])) {
                score += 1;
            }
        }
        System.out.println("Score : " +score);
        return (score*10);
    };

    public String getAnswer(CheckBox c1, CheckBox c2){
        String s = "";
        if (c1.isChecked() && !(c2.isChecked())){
            s=(String) c1.getText();
        }
        else if (c2.isChecked() && !(c1.isChecked())){
            s=(String) c2.getText();
        }
        else {
            s = "No Answer";
        }
        return s;
    }

    public String [] answerCheckedGlobal(ArrayList<CheckBox> l, String[] listVerb){
        String [] k = new String [listVerb.length];
        int i = 0;
        int j = 0;
        for (String c : listVerb){
            k[j] = getAnswer(l.get(i), l.get(i+1));
            i=i+2;
            j=j+1;
        }
        return k;
    }

    public void verify(ArrayList<TextView> txt, ArrayList<TextView> txt1, String[] answer, String[] correction, String[] conjugaison){
        int j = 0;
        for (String i : answer){
            if (answer[j].equals(correction[j])){
                txt.get(j).setText(answer[j]);
                txt1.get(j).setText("");
            }
            else {
                txt.get(j).setText(answer[j]);
                txt1.get(j).setText("Correction : " +correction[j] + " - " + listConjugaison[j]);
            }
            j++;
        }
    }

}
