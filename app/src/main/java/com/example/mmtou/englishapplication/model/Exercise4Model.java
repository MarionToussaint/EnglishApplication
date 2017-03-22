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
import java.util.StringTokenizer;

/**
 * Created by mmtou on 08/03/2017.
 */
public class Exercise4Model {
    public String[] listLevel1 = new String[]{"read", "feel", "play", "see",
            "listen", "do", "go", "make", "know", "help", "say", "think",
            "like", "write", "forget", "eat", "take", "bring", "cut", "clean",
            "watch", "be", "have", "meet", "put", "buy", "cook", "teach",
            "catch", "find", "answer", "lose", "want", "tell", "win", "sit",
            "sell", "build", "drink", "open"};
    public int[] answerList = new int[]{1,2,3,0,1,2,2,3,0,0};
    public ArrayList<TextView> pop = new ArrayList<>();
    public Exercise4Activity ex = new Exercise4Activity();

    public Exercise4Model() {
    }

    public void setLevel(String[] s, ArrayList<TextView> l) {
        int j = 0;
        for (int i = 0; i < l.size() - 2; i++) {
            l.get(i).setText(s[j]);
            j++;
        }
    }

    public void Clickable(final CheckBox c1, final CheckBox c2, final CheckBox c3, final CheckBox c4) {
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
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
                if (isChecked) {
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
                if (isChecked) {
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
                if (isChecked) {
                    c1.setClickable(false);
                    c2.setClickable(false);
                    c3.setClickable(false);
                }
            }
        });
    }

    public int answerChecked(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4) {
        int answer = 0;
        if ((!box1.isChecked()) && (!box2.isChecked()) && (!box3.isChecked()) && (!box4.isChecked()))
            answer = 0;
        else if (box1.isChecked() && (!box2.isChecked()) && (!box3.isChecked()) && (!box4.isChecked()))
            answer = 1;
        else if (box2.isChecked() && (!box1.isChecked()) && (!box3.isChecked()) && (!box4.isChecked()))
            answer = 2;
        else if (box3.isChecked() && (!box2.isChecked()) && (!box1.isChecked()) && (!box4.isChecked()))
            answer = 3;
        else if ((!box1.isChecked()) && (!box2.isChecked()) && (!box3.isChecked()) && (box4.isChecked()))
            answer = 4;

        return answer;
    }

    /*public void check(Button b, final ArrayList<CheckBox> l,int j) {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answer = answerChecked(l.get(0), l.get(1), l.get(2), l.get(3));
                System.out.println("Answer is : " + answer);
                ex.showPopup(answerList,listLevel1,answer,j);
                j++;
            }
        });
    }*/

    public ArrayList<TextView> addPop(){
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb1)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb2)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb3)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb4)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb5)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb6)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.verb7)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.textView3)));
        pop.add(((TextView) ex.pw.getContentView().findViewById(R.id.textView2)));
        return pop;
    }

    public void color(ArrayList<TextView> l, int answer, int[] answerList, int i){
        l.get(answer-1).setTextColor(0xFFE5FFFA);
        l.get(answerList[i]-1).setTextColor(0xFFE5FFFA);
    }

    public void clear(ArrayList<TextView> t, int index, String[] verb){
        for (int i=0;i<4;i++){
            t.get(i).setText(verb[index]);
            index++;
        }
    }

    public void setChangePop(String[] verb, int[] answer, int ans,int index){
        ArrayList<TextView> l =addPop();
        color(l,ans,answer,index);
        int indexVerb = 4*index;

        if (!(answer[index]==ans)) {
            for (int k = 0; k < 4; k++) {
                l.get(k).setText(verb[indexVerb]);
                l.get(k + 4).setText(verb[indexVerb]);
                indexVerb++;
            }
        }
        else {
            for (int k = 0; k < 4; k++) {
                l.get(k).setText(verb[indexVerb]);
                l.get(k + 4).setText("");
            }
            l.get(8).setText("Good Answer !");
            l.get(9).setText("");
        }
    }


}