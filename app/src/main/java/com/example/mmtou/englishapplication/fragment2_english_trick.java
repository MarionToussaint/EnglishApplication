package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mmtou on 08/02/2017.
 */

public class fragment2_english_trick extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2_english_trick);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        TextView title = (TextView) findViewById(R.id.titlecat1);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView exemple = (TextView) findViewById(R.id.example);
        title.setTypeface(font2);
        text.setTypeface(font);
        exemple.setTypeface(font);

        title.setText("Verbs With All 3 Forms Identical");
        text.setText("Let’s begin with the easiest group of irregular verbs ! These verbs are the same in the present, the past, and the past participle");
        exemple.setText("bet" +"\n" + "burst"+"\n" + "cast"+"\n" + "cost" +"\n" + "cut"+"\n" + "fit"+"\n" + "hit"+"\n" + "hurt" +"\n" +"let"+"\n" + "put" +"\n" +"quit"+"\n" +"set"+"\n" +
                "put" +"\n" +
                "shut"+"\n" +"split"+"\n" + "spread");
    }
}
