package com.example.mmtou.englishapplication.model;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 17/03/2017.
 */

public class Exercise5Model {
    public String[] listVerb1 = new String[]{"wham","learn","play","swell","vine","prove","spoil","light","creep","divine"};
    public String[] listVerb2 = new String[]{"wake","quit","loose","loosen","clothe","dodge","crow","carve","shift","understand"};
    public String[] listVerb3 = new String[]{"lose","saw","dwell","abide","seel","kneel","spean","crinkle","thrive","spall"};
    public String [] listAnswer1 = new String[]{"FALSE","TRUE","FALSE","TRUE","FALSE","TRUE","TRUE","TRUE","TRUE","FALSE"};
    public String [] listAnswer2 = new String[]{"TRUE","TRUE","FALSE","FALSE","TRUE","FALSE","TRUE","FALSE","FALSE","TRUE"};
    public String [] listAnswer3 = new String[]{"TRUE","TRUE","TRUE","TRUE","FALSE","TRUE","FALSE","FALSE","TRUE","FALSE"};
    public String[] listConjugaison1 = new String[]{"wham - whamed - whamed","learn - learnt - learnt","play - played - played","swell - swelled - swollen","vine - vined - vined",
            "prove - proved - proven","spoil - spoilt - spoilt","light - lit - lit","creep - crept -crept","divine - divined - divined"};
    public String[] listConjugaison2 = new String[]{"wake - woke - woken","quit - quit - quit","loose - loosed - loosed", "loosen - loosened - loosened","clothe - clad - clad",
    "dodge - dodged - dodged","crow - crew - crowed", "carve - carved - carved", "shift - shifted - shifted","understand - understood - understood"};
    public String[] listConjugaison3 = new String[]{"lose - lost - lost","saw - saw - sawn","dwell - dwelt - dwelt","abide - abode - abiden","seel - seeled - seeled",
    "kneel - knelt - knelt","spean - speaned - speaned", "crinkle - crinkled - crinkled","thrive - throve - thriven", "spall - spalled - spalled"};

    public void setLevel(ArrayList<TextView> l, String[] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i]);
            i++;
        }
    }

    public void changeLevel(int level, String[] s1, String[] s2, String[] s3,ArrayList<TextView> l){
        switch (level){
            case (1):
                setLevel(l,s1);
                break;
            case (2):
                setLevel(l,s2);
                break;
            case(3):
                setLevel(l,s3);
                break;
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

    public int scoreLevel(int level, String[] correct, String[] a1, String[]  a2, String[]  a3){
        int r = 0;
        switch (level){
            case (1):
                r = score(correct,a1);
                break;
            case (2):
                r = score(correct,a2);
                break;
            case(3):
                r = score(correct,a3);
                break;
        }
        return r;
    }

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
                txt1.get(j).setText("Correction : " +correction[j] + " - " + conjugaison[j]);
            }
            j++;
        }
    }

    public void verifyLevel(ArrayList<TextView> txt, ArrayList<TextView> txt1,int level, String[] correct, String[] a1, String[] a2, String[] a3, String[] c1, String[] c2, String[] c3){
        int r = 0;
        switch (level){
            case (1):
                verify(txt,txt1,correct,a1,c1);
                break;
            case (2):
                verify(txt,txt1,correct,a2,c2);
                break;
            case(3):
                verify(txt,txt1,correct,a3,c3);
                break;
        }
    }

    public void clearCheckBox(ArrayList<CheckBox> c){
        for(CheckBox cb : c) {
            cb.setChecked(false);
        }
    }

}
