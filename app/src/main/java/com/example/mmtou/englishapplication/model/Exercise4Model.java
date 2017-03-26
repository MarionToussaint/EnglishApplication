package com.example.mmtou.englishapplication.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mmtou.englishapplication.Exercise4Activity;
import com.example.mmtou.englishapplication.ExerciseChoiceActivity;
import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.activity.Exercise1ChoiceActivity;

import org.w3c.dom.Text;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by mmtou on 08/03/2017.
 */
public class Exercise4Model {
    public static String[][] listLevel1 = new String[][] {
            {"go","have","say","do"}, {"come","stand","make","buy"}, {"sit","swim","speak","see"},{"write","understand","sing","run"},
            {"go","have","say","do"}, {"come","stand","make","buy"}, {"sit","swim","speak","see"},{"write","understand","sing","run"},
            {"go","have","say","do"}, {"come","stand","make","buy"}};
    public String[] answerList = new String[]{"have","stand","sit","write","go","come","swim","understand","say","buy"};
    //public Exercise4Activity ex = new Exercise4Activity();

    public Exercise4Model() {
    }

    public void setLevel(ArrayList<TextView> l, String[][] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i][0]+"\t\t"+s[i][1]+"\t\t"+s[i][2]+"\t\t"+s[i][3]);
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

    public void verify(ArrayList<TextView> ans, ArrayList<TextView> cor,String[] correct,String[] s){
        int j = 0;
        int i = 0;
        for (TextView t : ans){
            if ((correct[i].equals(s[j]))){
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

    public void clearEditText(ArrayList<EditText> c){
        for(EditText cb : c) {
            cb.getText().clear();
        }
    }


    public void Checked (String answer, String correction){

    }

}