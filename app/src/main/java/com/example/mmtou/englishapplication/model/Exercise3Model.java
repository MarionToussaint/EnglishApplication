package com.example.mmtou.englishapplication.model;

import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 01/03/2017.
 */

public class Exercise3Model {
    public static String[][] listLevel1 = new String[][] {
            {"go","went","gone"}, {"do","did","done"}, {"run","ran","run"},{"stand","stood","stood"},
            {"see","saw","seen"},{"come","came","come"}, {"have","had","have"},{"lose","lost","lost"},
            {"read","read","read"},{"think","thought","thought"},{"tell","told","told"},{"sit","sat","sat"},
            {"say","said","said"},{"find","found","found"}, {"leave","left","left"}};

    public static String[][] listLevel2 = new String[][]{
            {"break","broke","broken"}, {"forget", "forgot", "forgotten"}, {"choose", "chose", "chosen"},{"draw","drew","drawn"},
            {"buy","bought","bought"},{"fly","flew","flown"},{"hurt", "hurt", "hurt"}, {"get","got","got"},
            {"drink","drank","drunk"},{"bring","brought","brought"},{"cut","cut","cut"},{"sink", "sank", "sunk"},
            {"make","made","made"},{"know","knew","known"},{"pay","paid","paid"}};
            // {"build","built","built"}};

    public static String[][] listLevel3 = new String[][]{
            {"wear","wore","worn"},{"eat","ate","eaten"},{"hear","heard","heard"},{"cost","cost","cost"},
            {"fall", "fell", "fallen"},{"hit", "hit", "hit"},{"keep" ,"kept", "kept"},{"feel","felt","felt"},
            {"meet","met","met"},{"understand","understood","understood"},{"ride","rode","ridden"},{"put","put","put"},
            {"send", "sent", "sent"},{"shake","shook","shaken"},{"win","won","won"}};

    public static String[][] listLevel4 = new String[][]{
            {"feed", "fed", "fed"},{"sing","sang","sung"},{"take","took","taken"},{"swim","swam","swum"},
            {"throw", "threw", "thrown"},{"write","wrote","written"},{"begin","began","begun"},{"sleep","slept","slept"},
            {"mean", "meant", "meant"},{"fight","fought","fought"},{"stick","stuck","stuck"},{"light","lit","lit"},
            {"teach", "taught", "taught"},{"wake","woke","waken"},{"speak","spoke","spoken"}};

    public int[] level1 = new int[]{2,3,1,2,1,3,1,3,2,1,1,2,3,1,2};
    public int[] level2 = new int[]{2,3,1,2,1,3,1,3,2,1,1,2,3,1,2};
    public int[] level3 = new int[]{1,3,1,2,1,3,1,2,1,2,1,2,3,1,2};
    public int[] level4 = new int[]{2,3,1,2,1,3,2,1,3,2,1,3,1,3,2};

    public Exercise3Model(){
    }



    public int score1(String answer1, String answer2, String[]correct){
        int score = 0;
            if (answer1.equals(correct[1]) && answer2.equals(correct[2])){
                score = score + 2;
            }
            else if (!(answer1.equals(correct[1])) && answer2.equals(correct[2])){
                score = score + 1;
            }
            else if ((answer1.equals(correct[1])) && !(answer2.equals(correct[2]))){
                score = score + 1;
            }
            else {
                score = score;
            }
        return (score);
    }

    public int score2(String answer1, String answer2, String[]correct){
        int score = 0;
        if (answer1.equals(correct[0]) && answer2.equals(correct[2])){
            score = score + 2;
        }
        else if (!(answer1.equals(correct[0])) && answer2.equals(correct[2])){
            score = score + 1;
        }
        else if ((answer1.equals(correct[0])) && !(answer2.equals(correct[2]))){
            score = score + 1;
        }
        else {
            score = score;
        }
        return (score);
    }

    public int score3(String answer1, String answer2, String[]correct){
        int score = 0;
        if (answer1.equals(correct[0]) && answer2.equals(correct[1])){
            score = score + 2;
        }
        else if (!(answer1.equals(correct[0])) && answer2.equals(correct[1])){
            score = score + 1;
        }
        else if ((answer1.equals(correct[0])) && !(answer2.equals(correct[1]))){
            score = score + 1;
        }
        else {
            score = score;
        }
        return (score);
    }

    public int score(String[] answer,String[][] correct,int[] k){
        int j = 0;
        int score = 0;
        for (int i=0;i<15;i++){
            switch (k[i]){
                case (1):
                    score += score1(answer[j],answer[j+1],correct[i]);
                break;
                case (2):
                    score += score2(answer[j],answer[j+1],correct[i]);
                    break;
                case (3):
                    score += score3(answer[j],answer[j+1],correct[i]);
                    break;
            }
            j=j+2;
        }
        score = score*100/30;
        return (score);
    }

    public int scoreLevel(int level, String[] s, String[][] a1, String[][]  a2, String[][]  a3,String[][] a4, int[] i1,int[] i2,int[] i3,int[] i4){
        int r = 0;
        switch (level){
            case (1):
                r = score(s,a1,i1);
                break;
            case (2):
                r = score(s,a2,i2);
                break;
            case(3):
                r = score(s,a3,i3);
                break;
            case (4):
                r = score(s,a4,i4);
                break;
        }
        return r;
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

    public void changeLevel(int level, String[][] s1, String[][] s2, String[][] s3, String[][] s4,int[] i1,int[] i2,int[] i3,int[] i4,ArrayList<TextView> l,ArrayList<EditText> e){
        switch (level){
            case (1):
                setLevel(l,s1,i1);
                setEditText(e,i1);
                break;
            case (2):
                setLevel(l,s2,i2);
                setEditText(e,i2);
                break;
            case(3):
                setLevel(l,s3,i3);
                setEditText(e,i3);
                break;
            case (4):
                setLevel(l,s4,i4);
                setEditText(e,i3);
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

    public void verifyLevel(ArrayList<TextView> txt, ArrayList<TextView> txt1,int level, String[] s, String[][] a1, String[][] a2, String[][] a3,String[][] a4, int[] i1,int[] i2,int[] i3,int[] i4){
        int r = 0;
        switch (level){
            case (1):
                verify(txt,txt1,a1,s,i1);
                break;
            case (2):
                verify(txt,txt1,a2,s,i2);
                break;
            case(3):
                verify(txt,txt1,a3,s,i3);
                break;
            case (4):
                verify(txt,txt1,a4,s,i4);
                break;
        }
    }

    public void clearEditText(ArrayList<EditText> c){
        for(EditText cb : c) {
            cb.getText().clear();
        }
    }





}
