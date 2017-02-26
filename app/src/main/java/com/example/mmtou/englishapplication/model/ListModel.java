package com.example.mmtou.englishapplication.model;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.activity.Exercise1Activity;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mmtou on 21/02/2017.
 */

public class ListModel {
    public PopupWindow pw;
    private ArrayList<HashMap<String, String>> feedList= new ArrayList<HashMap<String, String>>();
    public Button close;
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    public ListModel(){

    }

    public ArrayList<HashMap<String, String>>  readFile(String file, Context context){
        try {
            InputStream inputreader = context.getAssets().open(file);
            BufferedReader br = new BufferedReader(new InputStreamReader((inputreader)));
            String line;
            while ((line = br.readLine())!=null) {
                HashMap<String, String> map = new HashMap<>();
                String pats[]=line.split("\t");
                map.put("infinitive",pats[0]);
                map.put("preterite",pats[1]);
                map.put("pastParticiple",pats[2]);
                map.put("translate",pats[3]);
                feedList.add(map);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feedList;
    }

    public String[][]  readFileDef(String file, Context context){
        String[][] map = new String[180][4];
        try {
            int i =0;
            InputStream inputreader = context.getAssets().open(file);
            BufferedReader br = new BufferedReader(new InputStreamReader((inputreader)));
            String line;
            while ((line = br.readLine())!=null) {
                String pats[]=line.split("_");
                map[i][0]=(pats[0]);
                map[i][1]=(pats[1]);
                map[i][2]=(pats[2]);
                map[i][3]=(pats[3]);
                i++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public void showPopup(Context ctxt,View view, ArrayList<HashMap<String, String>>  feedList,int pos, String file){
        try {
            String[][] definitionList = new String[][]{};
            definitionList = readFileDef(file,ctxt);
            LayoutInflater inflater = (LayoutInflater)ctxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View popupView = inflater.inflate(R.layout.popup_list,(ViewGroup) view.findViewById(R.id.popup));
            pw = new PopupWindow(popupView, 1000,  650, true);
            pw.showAtLocation(popupView, Gravity.CENTER, 0, 0);
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.inf));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.pret));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.part));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.trans));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.definition));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.example1));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.example2));
            listTextView.add((TextView) pw.getContentView().findViewById(R.id.example3));
            style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",ctxt,listTextView);
            ((TextView) pw.getContentView().findViewById(R.id.inf)).setText(feedList.get(pos).get("infinitive"));
            ((TextView) pw.getContentView().findViewById(R.id.pret)).setText(feedList.get(pos).get("preterite"));
            ((TextView) pw.getContentView().findViewById(R.id.part)).setText(feedList.get(pos).get("pastParticiple"));
            ((TextView) pw.getContentView().findViewById(R.id.trans)).setText(feedList.get(pos).get("translate"));
            ((TextView) pw.getContentView().findViewById(R.id.definition)).setText(definitionList[pos][0]);
            ((TextView) pw.getContentView().findViewById(R.id.example1)).setText(definitionList[pos][1]);
            ((TextView) pw.getContentView().findViewById(R.id.example2)).setText(definitionList[pos][2]);
            ((TextView) pw.getContentView().findViewById(R.id.example3)).setText(definitionList[pos][3]);
            close = (Button) popupView.findViewById(R.id.button6);
            close.setOnClickListener(cancel);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private View.OnClickListener cancel = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pw.dismiss();
        }
    };

}
