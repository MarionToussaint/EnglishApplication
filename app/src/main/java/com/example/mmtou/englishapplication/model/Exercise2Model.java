package com.example.mmtou.englishapplication.model;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mmtou on 23/02/2017.
 */

public class Exercise2Model {
    public static String[][] listLevel1 = new String[][] {
            {"go","went","gone"}, {"say","said","said"}, {"do","did","done"},{"come","came","come"},
            {"have","had","have"},{"stand","stood","stood"}, {"make","made","made"},{"buy","bought","bought"},
            {"sit","sat","sat"},{"swim","swam","swum"}, {"speak","spoke","spoken"},{"see","saw","seen"},
            {"write","wrote","written"},{"sing","sang","sung"}, {"run","ran","run"}};

    public Exercise2Model(){

    }

    public int score(String[] answer,String[][] correct){
        int j = 0;
        int score = 0;
        for (int i=0;i<15;i++){
            if (answer[j]==correct[i][1] && answer[j+1]==correct[i][2]){
                score = score + 2;
            }
            else if (!(answer[j]==correct[i][1]) && answer[j+1]==correct[i][2]){
                score = score + 1;
            }
            else if ((answer[j]==correct[i][1]) && !(answer[j+1]==correct[i][2])){
                score = score + 1;
            }
            else {
                score = score;
            }
            j=j+2;
        }
        System.out.println("SCORE1 / "+score);
        score = score*100/30;
        System.out.println("SCORE / "+score);
        return (score);
    }

    public void setLevel(ArrayList<TextView> l, String[][] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i][0]);
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
        //System.out.println("Valeur de X : "+ x);
        return x;
    }

    public String[] answerList(ArrayList<EditText> t){
        String[] answer = new String[30];
        int j = 0;
        for (EditText e : t){
            answer[j] = editTextEmpty(e);
            j++;
        }
        return answer;
    }

    public void verify(ArrayList<TextView> ans, ArrayList<TextView> cor,String[][] correct,String[] s){
        int j = 0;
        int i = 0;
        for (TextView t : ans){
            if ((correct[i][1].equals(s[j]) && (correct[i][2].equals(s[j+1])))){
                ans.get(i).setText(correct[i][0] + "-> " + s[j] + " -> " + s[j+1]);
                cor.get(i).setText("");
            }
            else if (!(correct[i][1].equals(s[j]) && (correct[i][2].equals(s[j+1])))){
                ans.get(i).setText(correct[i][0] + " -> " + s[j] + " -> " );
                cor.get(i).setText("Correction : " + correct[i][0] + " -> "+ correct[i][1] + " -> " +correct[i][2]);
            }
            else if ((correct[i][1].equals(s[j]) && !(correct[i][2].equals(s[j+1])))){
                ans.get(i).setText(correct[i][0] +" -> " + " " + " -> " + s[j+1]);
                cor.get(i).setText("Correction : " + correct[i][0] + " -> "+ correct[i][1] + " -> " +correct[i][2]);
            }
            else {
                ans.get(i).setText(correct[i][0] +" -> " + s[j] + " -> " + s[j + 1]);
                cor.get(i).setText("Correction : " + correct[i][0] + " -> " + correct[i][1] + " -> " + correct[i][2]);
            }
            j=j+2;
            i++;
        }
    }

    public void clearEditText(ArrayList<EditText> c){
        for(EditText cb : c) {
            cb.getText().clear();
        }
    }



}
