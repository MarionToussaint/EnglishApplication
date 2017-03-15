package com.example.mmtou.englishapplication.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mmtou.englishapplication.ExerciseChoiceActivity;
import com.example.mmtou.englishapplication.activity.Exercise1ChoiceActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by mmtou on 08/03/2017.
 */

public class Exercise4Model {
    public boolean click = false;
    public int s=0;
    SharedPreferences sharedpreferences;
    public String[] listLevel1 = new String[]{"read","feel", "play", "see",
            "listen", "do", "go", "make", "know", "help", "say", "think",
            "like", "write", "forget", "eat","take", "bring", "cut", "clean",
            "watch", "be", "have", "meet", "put", "buy", "cook", "teach",
            "catch", "find", "answer", "lose","want", "tell", "win", "sit",
            "sell", "build", "drink", "open"};

    public Exercise4Model(){
    }

    public void setLevel(ArrayList<TextView> l, String[] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i]);
            i++;
        }
    }

    public int clickVerb(final TextView t1,final TextView t2,final TextView t3,final TextView t4){
        t1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (click == false) {
                    click = true;
                    t1.setTextColor(0xFFE5FFFA);
                }
            }
        });
        t2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (click == false) {
                    click = true;
                    t2.setTextColor(0xFFE5FFFA);
                }
            }
        });
        t3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (click == false) {
                    click = true;
                    t3.setTextColor(0xFFE5FFFA);
                }
            }
        });
        t4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (click == false) {
                    click = true;
                    t4.setTextColor(0xFFE5FFFA);
                }
            }
        });
        System.out.println("NIQUE13 /" +t1.getTextColors());
        System.out.println("NIQUE11 /" +t2.getTextColors().getDefaultColor());
        return s;
    }

    public void clickVerbGlobal(ArrayList<TextView> l){
        int i = 0;
        int size = (l.size())/4;
        for (int j=0;j < size; j++){
            clickVerb(l.get(j),l.get(j+1),l.get(j+2),l.get(j+3));
            click = false;
            i = i + 4;
        }
    }

    /*public int verbChoose(final TextView t1,final TextView t2,final TextView t3,final TextView t4){
        int s = 0;
        System.out.println("C1 :"+t1.getCurrentTextColor()+" C2 :"+t2.getCurrentTextColor());
        if (t1.getCurrentTextColor()==0xFFE5FFFA){s = 1;}
        else if (t2.getCurrentTextColor()==0xFFE5FFFA){s = 2;}
        else if (t3.getCurrentTextColor()==0xFFE5FFFA){s = 3;}
        else if (t4.getCurrentTextColor()==0xFFE5FFFA){s = 4;}
        else {s = 0;}
        System.out.println("NIQUE /" +s);
        return s;
    }*/



}
