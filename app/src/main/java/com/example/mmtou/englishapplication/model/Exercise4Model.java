package com.example.mmtou.englishapplication.model;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 08/03/2017.
 */
public class Exercise4Model {
    public static String[][] listLevel1 = new String[][] {
            {"crow","cry","do","clothe"}, {"have","stand","play","buy"}, {"sit","swim","want","prove"},{"write","understand","live","run"},
            {"rid","run","shout","come"}, {"shift","see","saw","sing"}, {"shave","spoil","sweat","seel"},{"catch","cancel","cut","wear"},
            {"ring","thrive","creep","crinkle"}, {"deal","break","fight","follow"}};
    public static String[][] listLevel2 = new String[][] {
            {"tell","feel","freeze","venge"}, {"clap","think","win","flirt"}, {"sell","risk","drink","eat"},{"dwell","fit","wrap","meet"},
            {"quit","rive","set","get"}, {"rid","rip","ride","ring"}, {"shake","show","scream","bet"},{"seem","shoot","bear","abide"},
            {"breed","cleave","creep","flee"}, {"feed","kneel","kick","knit"}};
    public static String[][] listLevel3 = new String[][] {
            {"repeal","strike","swing","teach"}, {"imagine","thrust","tread","undergo"}, {"wind","wring","spall","wake"},{"wet","wed","tear","carve"},
            {"pay","spean","overtake","put"}, {"mislead","lose","beg","lie"}, {"castle","leave","learn","grow"},{"grind","hang","hit","case"},
            {"leap","loose","inlay","input"}, {"forgive","forget","forbid","forward"}};

    public String[] answerList1 = new String[]{"cry","play","want","live","shout","shift","seel","cancel","crinkle","follow"};
    public String[] answerList2 = new String[]{"venge","flirt","risk","wrap","rive","rip","bet","seem","flee","kick"};
    public String[] answerList3 = new String[]{"repeal","imagine","spall","carve","spean","beg","castle","case","loose","forward"};

    public Exercise4Model() {
    }

    public int score(String[] answer,String[] correct){
        int score = 0;
        for (int i=0;i<10;i++){
            if (answer[i].equals(correct[i])) {
                score = score + 1;
            }
            else {
                score = score;
            }
        }
        score = score*100;
        return (score);
    }

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

    public void setLevel(ArrayList<TextView> l, String[][] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i][0]+"\t\t"+s[i][1]+"\t\t"+s[i][2]+"\t\t"+s[i][3]);
            i++;
        }
    }

    public void changeLevel(int level, String[][] s1, String[][] s2, String[][] s3,ArrayList<TextView> l){
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

    public void setLevel2(ArrayList<TextView> l, String[][] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i][0]+"-"+s[i][1]+"-"+s[i][2]+"-"+s[i][3]);
            i++;
        }
    }

    public void changeLevel2(int level, String[][] s1, String[][] s2, String[][] s3,ArrayList<TextView> l){
        switch (level){
            case (1):
                setLevel2(l,s1);
                break;
            case (2):
                setLevel2(l,s2);
                break;
            case(3):
                setLevel2(l,s3);
                break;
        }
    }

    public String editTextEmpty(EditText box1){
        String x;
        if (!(box1.getText().toString().trim().length() == 0)){
            x = box1.getText().toString();
        }
        else {
            x = ("No Answer");
        }
        return x;
    }

    public String[] answerList(ArrayList<EditText> t){
        String[] answer = new String[10];
        int j = 0;
        for (EditText e : t){
            answer[j] = editTextEmpty(e);
            j++;
        }
        return answer;
    }

    public void verify(ArrayList<TextView> ans, ArrayList<TextView> cor,String[] correct,String[] s){
        int j = 0;
        int i = 0;
        for (TextView t : ans){
            if ((s[i].equals(correct[i]))){
                ans.get(i).setText(correct[i]);
                cor.get(i).setText("");
            }
            else {
                ans.get(i).setText(s[i]);
                cor.get(i).setText("Correction : " + correct[i]);
            }
            j=j+2;
            i++;
        }
    }

    public void verifyLevel(ArrayList<TextView> txt, ArrayList<TextView> txt1,int level, String[] correct, String[] a1, String[] a2, String[] a3){
        int r = 0;
        switch (level){
            case (1):
                verify(txt,txt1,correct,a1);
                break;
            case (2):
                verify(txt,txt1,correct,a2);
                break;
            case(3):
                verify(txt,txt1,correct,a3);
                break;
        }
    }

    public void clearEditText(ArrayList<EditText> c){
        for(EditText cb : c) {
            cb.getText().clear();
        }
    }



}