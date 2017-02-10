package com.example.mmtou.englishapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListActivity extends AppCompatActivity {
    private ArrayList<HashMap<String, String>> feedList= new ArrayList<HashMap<String, String>>();
    //private HashMap<String, String> map = new HashMap<String, String>();
    private ListView list;
    private TextView inf;
    private Button close;
    private PopupWindow pw;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<String> s = new ArrayList<>();
        list = (ListView)findViewById(R.id.listview);

        try {
            InputStream inputreader = getAssets().open("fullList.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader((inputreader)));
            //Scanner scanner = new Scanner(new FileReader("test.txt"));
            String line;
            while ((line = br.readLine())!=null) {
                HashMap<String, String> map = new HashMap<String, String>();
                String pats[]=line.split("\t");
                map.put("infinitive",pats[0]);
                map.put("preterite",pats[1]);
                map.put("pastParticiple",pats[2]);
                map.put("translate",pats[3]);
                feedList.add(map);
            }
            br.close();

            SimpleAdapter simpleAdapter = new SimpleAdapter(this, feedList, R.layout.row_list, new String[]{"infinitive", "preterite", "pastParticiple", "translate"},
                    new int[]{R.id.infinitive1, R.id.preterite1, R.id.pastParticiple1, R.id.translate1});
            list.setAdapter(simpleAdapter);

        } catch (Exception e) {
            e.printStackTrace();
        }



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pos = position;
                //showPopup();

            }
        });
    }

    /*private void showPopup(){
        try {
            LayoutInflater inflater = (LayoutInflater) ListActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.pop_list, (ViewGroup) findViewById(R.id.pop1));
            pw = new PopupWindow(layout, 1000,  650, true);
            pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
            /*((TextView) pw.getContentView().findViewById(R.id.verb1)).setText(feedList.get(pos).get("infinitive"));
            ((TextView) pw.getContentView().findViewById(R.id.correct1)).setText(ListVerb.definition[pos][0]);
            ((TextView) pw.getContentView().findViewById(R.id.example)).setText(ListVerb.definition[pos][1]);
            ((TextView) pw.getContentView().findViewById(R.id.example2)).setText(ListVerb.definition[pos][2]);
            ((TextView) pw.getContentView().findViewById(R.id.example3)).setText(ListVerb.definition[pos][3]);
            close = (Button) layout.findViewById(R.id.button2);
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
    };*/
}
