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

    public static String[][] listLevel2 = new String[][]{
            {"begin","began","begun"}, {"feel","felt","felt"}, {"get","got","got"},{"draw","drew","drawn"},
            {"bring","brought","brought"},{"know","knew","known"}, {"take","took","taken"},{"pay","paid","paid"},
            {"meet","met","met"},{"leave","left","left"}, {"wake","woke","waken"},{"read","read","read"},
            {"sleep","slept","slept"},{"ride","rode","ridden"}, {"build","built","built"}};

    public static String[][] listLevel3 = new String[][]{
            {"catch","caught","caught"}, {"tell","told","told"}, {"understand","understood","understood"},{"cut","cut","cut"},
            {"ring","rang","rung"},{"eat","ate","eaten"}, {"wear","wore","worn"},{"put","put","put"},
            {"sell","sold","sold"},{"think","thought","thought"}, {"drive","drove","driven"},{"win","won","won"},
            {"drink","drank","drunk"},{"break","broke","broken"}, {"fight","fought","fought"}};

    public static String[][] listLevel4 = new String[][]{
            {"fall", "fell", "fallen"}, {"keep" ,"kept", "kept"}, {"mean", "meant", "meant"}, {"forget", "forgot", "forgotten"},
            {"hit", "hit", "hit"}, {"freeze", "froze", "frozen"},{"throw", "threw", "thrown"}, {"feed", "fed", "fed"},
            {"blow", "blew", "blown"}, {"lead", "led", "led"}, {"hurt", "hurt", "hurt"}, {"teach", "taught", "taught"},
            {"spend", "spent", "spent"}, {"choose", "chose", "chosen"}, {"set", "set", "set"}};

    public static String[][] listLevel5 = new String[][]{
            {"fly", "flew", "flown"}, {"hold", "held", "held"}, {"steal", "stole", "stolen"}, {"sink", "sank", "sunk"},
            {"hide", "hid", "hidden"}, {"rise", "rose", "risen"}, {"spring", "sprang", "sprung"}, {"let", "let", "let"},
            {"send", "sent", "sent"}, {"tear", "tore", "torn"}, {"grow","grew", "grown"}, {"sweep", "swept", "swept"},
            {"lend", "lent","lent"}, {"become", "became", "become"}, {"swear" ,"swore", "sworn"}};

    public static String[][] listLevel6 = new String[][]{
            {"shine","shone","shone"},{"hear", "heard","heard"},{"find","found","found"},{"shut","shut","shut"},
            {"beat","beat","beaten"},{"breed","bred","bred"},{"stick","stuck","stuck"},{"lose","lost","lost"},
            {"slit","slit","slit"},{"lay","laid","laid"},{"spin","spun","spun"},{"thrust", "thrust","thrust"},
            {"bite","bit","bitten"},{"swing","swung","swung"},{"grind","ground","ground"}
    };


    public Exercise2Model(){

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

    public int scoreLevel(int level, String[] s, String[][] a1, String[][]  a2, String[][]  a3,String[][] a4, String[][]  a5, String[][]  a6){
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
            case (4):
                r = score(s,a4);
                break;
            case (5):
                r = score(s,a5);
                break;
            case(6):
                r = score(s,a6);
                break;
        }
        return r;
    }

    public void setLevel(ArrayList<TextView> l, String[][] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i][0]);
            i++;
        }
    }

    public void changeLevel(int level, String[][] s1, String[][] s2, String[][] s3, String[][] s4, String[][] s5, String[][] s6,ArrayList<TextView> l){
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
            case (4):
                setLevel(l,s4);
                break;
            case (5):
                setLevel(l,s5);
                break;
            case(6):
                setLevel(l,s6);
                break;
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

    public void verify(ArrayList<TextView> ans, ArrayList<TextView> cor,String[][] correct,String[] s){
        int j = 0;
        int i = 0;
        for (TextView t : ans){
            if ((correct[i][1].equals(s[j]) && (correct[i][2].equals(s[j+1])))){
                ans.get(i).setText(correct[i][0] + "-> " + s[j] + " -> " + s[j+1]);
                cor.get(i).setText("");
            }
            else {
                ans.get(i).setText(correct[i][0] +" -> " + s[j] + " -> " + s[j + 1]);
                cor.get(i).setText("Correction : " + correct[i][0] + " -> " + correct[i][1] + " -> " + correct[i][2]);
            }
            j=j+2;
            i++;
        }
    }

    public void verifyLevel(ArrayList<TextView> txt, ArrayList<TextView> txt1,int level, String[] s, String[][] a1, String[][] a2, String[][] a3,String[][] a4, String[][] a5, String[][] a6){
        int r = 0;
        switch (level){
            case (1):
                verify(txt,txt1,a1,s);
                break;
            case (2):
                verify(txt,txt1,a2,s);
                break;
            case(3):
                verify(txt,txt1,a3,s);
                break;
            case (4):
                verify(txt,txt1,a4,s);
                break;
            case (5):
                verify(txt,txt1,a5,s);
                break;
            case(6):
                verify(txt,txt1,a6,s);
                break;
        }
    }

    public void clearEditText(ArrayList<EditText> c){
        for(EditText cb : c) {
            cb.getText().clear();
        }
    }



}
