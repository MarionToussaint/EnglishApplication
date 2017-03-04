package com.example.mmtou.englishapplication.model;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 01/03/2017.
 */

public class Exercise3Model {
    public static String[][] listLevel1 = new String[][]{
            {"begin","began","begun"}, {"feel","felt","felt"}, {"get","got","got"},{"draw","drew","drawn"},
            {"bring","brought","brought"},{"know","knew","known"}, {"take","took","taken"},{"pay","paid","paid"},
            {"meet","met","met"},{"leave","left","left"}, {"wake","woke","waken"},{"read","read","read"},
            {"sleep","slept","slept"},{"ride","rode","ridden"}, {"build","built","built"}};
    public int[] level1 = new int[]{1,3,2,2,1,1,3,2,3,1,1,3,2,2,3};

    public Exercise3Model(){
    }

    public int score(String[] answer,String[][] correct){
        int j = 0;
        int score = 0;
        for (int i=0;i<15;i++){
            if (answer[j].equals(correct[i][1]) && answer[j+1].equals(correct[i][2])){
                score = score + 2;
            }
            else if (!(answer[j].equals(correct[i][1])) && answer[j+1].equals(correct[i][2])){
                score = score + 1;
            }
            else if ((answer[j].equals(correct[i][1])) && !(answer[j+1].equals(correct[i][2]))){
                score = score + 1;
            }
            else {
                score = score;
            }
            j=j+2;
        }
        score = score*100/30;
        return (score);
    }

    public void setEditText(ArrayList<EditText> list,int[] i){
        int j = 0;
        for (int k = 0; k < i.length;k++){
            System.out.println("i : "+i[k]);
            switch (i[k]){
                case(1):
                    list.get(j).setHint("Simple Past");
                    list.get(j+1).setHint("Past Participle");
                break;
                case(2):
                    list.get(j).setHint("Infinitive");
                    list.get(j+1).setHint("Past Participle");
                    break;
                case(3):
                    list.get(j).setHint("Infinitive");
                    list.get(j+1).setHint("Simple Past");
                    break;
            }
            j=j+2;
        }
    }

    public void setLevel(ArrayList<TextView> l, String[][] s,int[] j){
        int i = 0;
        for (TextView t : l){
            switch (j[i]){
                case(1):
                    t.setText(s[i][0]);
                break;
                case(2):
                    t.setText(s[i][1]);
                break;
                case(3):
                    t.setText(s[i][2]);
                break;
            }
            i++;
        }
    }

    public String editTextEmpty(EditText box1){
        String x;
        if (!(box1.getText().toString().trim().length() == 0)){
            x = box1.getText().toString();
        }
        else {
            x = ("  ");
        }
        //System.out.println("ANSWER = "+ x);
        return x;
    }

    public String[] answerList(ArrayList<EditText> t){
        String[] answer = new String[30];
        int j = 0;
        for (EditText e : t){
            System.out.println("ANSWER[J]1 = "+ editTextEmpty(e));
            answer[j] = editTextEmpty(e);
            System.out.println("ANSWER[J] = "+ answer[j]);
            j++;
        }
        return answer;
    }

    public void verify1(TextView ans, TextView cor,String[] correct,String s, String s1){
        if ((correct[1].equals(s) && (correct[2].equals(s1)))) {
            ans.setText(correct[0] + "-> " + s + " -> " + s1);
            cor.setText("");
        }
        else {
            ans.setText(correct[0] +" -> " + s + " -> " + s1);
            cor.setText("Correction : " + correct[0] + " -> " + correct[1] + " -> " + correct[2]);
        }
    }

    public void verify2(TextView ans, TextView cor,String[] correct,String s, String s1){
        if ((correct[0].equals(s) && (correct[2].equals(s1)))) {
            ans.setText(s + "-> " + correct[1] + " -> " + s1);
            cor.setText("");
        }
        else {
            ans.setText(s + "-> " + correct[1] + " -> " + s1);
            cor.setText("Correction : " + correct[0] + " -> " + correct[1] + " -> " + correct[2]);
        }
    }

    public void verify3(TextView ans, TextView cor,String[] correct,String s, String s1){
        if ((correct[0].equals(s) && (correct[1].equals(s1)))) {
            ans.setText(s + "-> " + s1 + " -> " + correct[2]);
            cor.setText("");
        }
        else {
            ans.setText(s + "-> " + s1 + " -> " + correct[2]);
            cor.setText("Correction : " + correct[0] + " -> " + correct[1] + " -> " + correct[2]);
        }
    }

    public void verify(ArrayList<TextView> ans, ArrayList<TextView> cor,String[][] correct,String[] s, int[] k){
        int j = 0;
        for (int n = 0; n < k.length; n++) {
            switch (k[n]) {
                case (1):
                    verify1(ans.get(n), cor.get(n), correct[n], s[j], s[j + 1]);
                    break;
                case (2):
                    verify2(ans.get(n), cor.get(n), correct[n], s[j], s[j + 1]);
                    break;
                case (3):
                    verify3(ans.get(n), cor.get(n), correct[n], s[j], s[j + 1]);
                    break;
            }
            j+=2;
        }
    }

    public void clearEditText(ArrayList<EditText> c){
        for(EditText cb : c) {
            cb.getText().clear();
        }
    }





}
