package com.example.mmtou.englishapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

/**
 * Created by mmtou on 08/02/2017.
 */

public class fragment2_english_trick extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2_english_trick);

        TextView title = (TextView) findViewById(R.id.verb2);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView exemple = (TextView) findViewById(R.id.example);

        listTextView.add(text);
        listTextView.add(exemple);
        style.changeFont("fonts/Aprikas_light_Demo.ttf",fragment2_english_trick.this,listTextView);
        style.changeFontOfSingleText("fonts/LemonMilk.ttf",fragment2_english_trick.this,title);

        title.setText("Verbs With All 3 Forms Identical");
        text.setText("Let’s begin with the easiest group of irregular verbs ! These verbs are the same in the present, the past, and the past participle\n");
        exemple.setText("bet" +"\n" + "burst"+"\n" + "cast"+"\n" + "cost" +"\n" + "cut"+"\n" + "fit"+"\n" + "hit"+"\n" + "hurt" +"\n" +"let"+"\n" + "put" +"\n" +"quit"+"\n" +"set"+"\n" +
                "put" +"\n" +
                "shut"+"\n" +"split"+"\n" + "spread");
    }
}
