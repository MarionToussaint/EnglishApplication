package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mmtou on 08/02/2017.
 */

public class fragment3_english_trick extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment3_english_trick);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        TextView title = (TextView) findViewById(R.id.titlecat1);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView exemple = (TextView) findViewById(R.id.example);
        title.setTypeface(font2);
        text.setTypeface(font);
        exemple.setTypeface(font);

        title.setText("Verbs With Identical Present And Past Participle");
        text.setText("These verbs are the same in the present and the past participle ! Only the past form is different :\n");
        exemple.setText("come\t\tcame\t\tcome" +"\n" + "become\t\tbecame\t\tbecome"+"\n" + "run\t\tran\t\trun");
    }
}
