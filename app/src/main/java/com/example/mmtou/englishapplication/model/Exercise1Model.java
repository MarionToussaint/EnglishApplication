package com.example.mmtou.englishapplication.model;

import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 21/02/2017.
 */

public class Exercise1Model {
    public String[] list1 = new String[]{"have","put","met","went","seen","say","come","caught","do","slept"};
    public int[] listAnswer = new int[]{2,9,7,3,4,2,6,7,2,7};

    public String[] list2 = new String[]{"were","got","swam","cost","build","knew","run","keep","sold","broken"};
    public int[] listAnswer2 = new int[]{3,7,3,9,2,3,6,2,7,4};

    public String[] list3 = new String[]{"become","shoot","lost","hit","beat","shut","stolen","sang","written","taught"};
    public int[] listAnswer3 = new int[]{6,2,7,9,5,9,4,3,4,7};

    public Exercise1Model(){

    }

    public int score(int[] correct, int[] answer){
        int correct1 = 0;
        for (int i=0; i<correct.length;i++){
            if (correct[i]==answer[i]) {
                System.out.println("Correct : " + correct[i]);
                System.out.println("Answer : " + answer[i]);
                correct1 += 1;
            }
        }
        System.out.println("Score : " +correct1);
        return (correct1*10);
    };

    public int scoreLevel(int level, int[] s, int[] a1, int[] a2, int[] a3){
        int r = 0;
        switch (level){
            case (1):
                r = score(s,a1);
                break;
            case (2):
                r = score(s,a2);
                break;
            case(3):
                r = score(s,a3);
                break;
        }
        return r;
    }



    public int answerChecked(CheckBox box1, CheckBox box2, CheckBox box3){
        int answer = 0;
        if ((!box1.isChecked()) && (!box2.isChecked()) && (!box3.isChecked()))
            answer =0;
        else if (box1.isChecked() && (!box2.isChecked()) && (!box3.isChecked()))
            answer =2;
        else if (box2.isChecked() && (!box1.isChecked()) && (!box3.isChecked()))
            answer = 3;
        else if (box3.isChecked() && (!box2.isChecked()) && (!box1.isChecked()))
            answer = 4;
        else if (box1.isChecked() && box2.isChecked() && (!box3.isChecked()))
            answer = 5;
        else if (box1.isChecked() && box3.isChecked() && (!box2.isChecked()))
            answer = 6;
        else if (box2.isChecked() && box3.isChecked() && (!box1.isChecked()))
            answer = 7;
        else
            answer = 9;
        return answer;
    }

    public int[] answerCheckedGlobal(ArrayList<CheckBox> l, String[] listVerb){
        int[] k = new int[listVerb.length];
        int i = 0;
        int j = 0;
        for (String c : listVerb){
            k[j] = answerChecked(l.get(i), l.get(i+1),l.get(i+2));
            i = i+3;
            j=j+1;
        }
        return k;
    }


    public String answerToString (int result){
        String answer = "No Answer";
        switch (result){
            case(0):
                answer = "No Answer";
            break;
            case (2):
                answer = "Infinitive";
            break;
            case (3):
                answer = "Simple Past";
            break;
            case(4):
                answer = "Past Participle";
            break;
            case (5):
                answer = "Infinitive, Simple Past";
            break;
            case (6):
                answer = "Infinitive, Past Participle";
            break;
            case (7):
                answer = "Simple Past, Past Participle";
            break;
            case (9):
                answer = "Infinitive, Simple Past, Past Participle";
            break;
        }
        return answer;
    }

    public void verify(ArrayList<TextView> txt, ArrayList<TextView> txt1, int[] answer, int[] correction){
        int j = 0;
        for (int i : answer){
            String answerString = answerToString(answer[j]);
            String correctionAnswer = answerToString(correction[j]);
            if (answer[j] == correction[j]){
                txt.get(j).setText(answerString);
                txt1.get(j).setText("");
            }
            else {
                txt.get(j).setText(answerString);
                txt1.get(j).setText("Correction : " + correctionAnswer);
            }
            j++;
        }
    }

    public void verifyLevel(ArrayList<TextView> txt, ArrayList<TextView> txt1,int level, int[] s, int[] a1, int[] a2, int[] a3){
        int r = 0;
        switch (level){
            case (1):
                verify(txt,txt1,s,a1);
                break;
            case (2):
                verify(txt,txt1,s,a2);
                break;
            case(3):
                verify(txt,txt1,s,a3);
                break;
        }
    }



    public void setLevel(ArrayList<TextView> l, String[] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i]);
            i++;
        }
    }

    public void changeLevel(int level, String[] s1, String[] s2, String[] s3, ArrayList<TextView> l){
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

    public int[] changeAnswerLevel(int level, String[] s1, String[] s2, String[] s3, ArrayList<CheckBox> l){
        int[] i = new int[]{};
        switch (level){
            case (1):
                i = answerCheckedGlobal(l, s1);
                break;
            case (2):
                i = answerCheckedGlobal(l, s2);
                break;
            case(3):
                i = answerCheckedGlobal(l, s3);
                break;
        }
        return i;
    }

    public void clearCheckBox(ArrayList<CheckBox> c){
        for(CheckBox cb : c) {
            cb.setChecked(false);
        }
    }

}
