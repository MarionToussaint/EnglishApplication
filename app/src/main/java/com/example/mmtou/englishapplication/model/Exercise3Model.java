package com.example.mmtou.englishapplication.model;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 01/03/2017.
 */

public class Exercise3Model {

    public Exercise3Model(){
    }

    public void setEditText(ArrayList<EditText> s){

    }

    public void setLevel(ArrayList<TextView> l, String[][] s){
        int i = 0;
        for (TextView t : l){
            t.setText(s[i][0]);
            i++;
        }
    }

}
