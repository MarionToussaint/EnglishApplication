package com.example.mmtou.englishapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class VerbsDifferentWaysActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_verbs_different_ways);
        list = (ListView) findViewById(R.id.listview);
        ArrayList<String> s = new ArrayList<>();

            try {
                InputStream inputreader = getAssets().open("differentForms.txt");
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
    }
}
