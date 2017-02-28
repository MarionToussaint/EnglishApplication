package com.example.mmtou.englishapplication.model;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mmtou on 21/02/2017.
 */

public class StyleModel {

    private ArrayList<TextView> listTextView = new ArrayList<TextView>();

    public StyleModel(){

    }

    public void changeFont(String fontName, Context context,ArrayList<TextView> list){
        Typeface font = Typeface.createFromAsset(context.getAssets(),fontName);
        for(TextView txt : list){
            txt.setTypeface(font);
        }
    }

    public void changeButtonFont(String fontName, Context context,Button b){
        Typeface font = Typeface.createFromAsset(context.getAssets(),fontName);
        b.setTypeface(font);
    }

    public void changeFontAndBold(String fontName, Context context,ArrayList<TextView> list){
        Typeface font = Typeface.createFromAsset(context.getAssets(),fontName);
        for(TextView txt : list){
            txt.setTypeface(font,Typeface.BOLD);
        }
    }

    public void changeFontOfSingleText(String fontName, Context context,TextView txt){
        Typeface font = Typeface.createFromAsset(context.getAssets(),fontName);
        txt.setTypeface(font);
    }

    public void changeCheckBoxFontAndBold(String fontName, Context context,ArrayList<CheckBox> list){
        Typeface font = Typeface.createFromAsset(context.getAssets(),fontName);
        for(CheckBox txt : list){
            txt.setTypeface(font,Typeface.BOLD);
        }
    }

    public void changeFontEdittext(String fontName, Context context,ArrayList<EditText> list){
        Typeface font = Typeface.createFromAsset(context.getAssets(),fontName);
        for(EditText txt : list){
            txt.setTypeface(font);
        }
    }
}
