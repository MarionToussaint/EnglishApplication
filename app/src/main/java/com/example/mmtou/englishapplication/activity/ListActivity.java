package com.example.mmtou.englishapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.ListModel;

import java.util.ArrayList;
import java.util.HashMap;

public class ListActivity extends AppCompatActivity {
    private ArrayList<HashMap<String, String>> feedList= new ArrayList<HashMap<String, String>>();
    private ListModel model = new ListModel();
    private ListView list;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = (ListView)findViewById(R.id.listview);

        feedList = model.readFile("fullList.txt",ListActivity.this);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, feedList, R.layout.row_list, new String[]{"infinitive", "preterite", "pastParticiple", "translate"},
                    new int[]{R.id.infinitive1, R.id.preterite1, R.id.pastParticiple1, R.id.translate1});
        list.setAdapter(simpleAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pos = position;
                model.showPopup(ListActivity.this,view,"fullList.txt",position,"definition.txt");

            }
        });


    }

}
