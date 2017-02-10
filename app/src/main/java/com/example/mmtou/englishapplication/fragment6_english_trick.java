package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mmtou on 10/02/2017.
 */

public class fragment6_english_trick extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment6_english_trick);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Aprikas_light_Demo.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/LemonMilk.ttf");
        TextView title = (TextView) findViewById(R.id.titlecat1);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView ssCat = (TextView) findViewById(R.id.ssCat1);
        TextView exemple2 = (TextView) findViewById(R.id.example);
        title.setTypeface(font2);
        ssCat.setTypeface(font2);
        text.setTypeface(font);
        exemple2.setTypeface(font);

        title.setText("Verbs With 3 Different Vowels !");
        text.setText("Are you ready for a challenge ? These irregular verbs have different vowels in each form. Fortunately, they do follow a pattern\n");
        ssCat.setText("Vowel Changes From “I” To “A” To “U”");
        exemple2.setText("begin\t\tbegan\t\tbegun\n" +
                "drink\t\tdrank\t\tdrunk\n" +
                "ring\t\trang\t\trung\n" +
                "shrink\t\tshrank\t\tshrunk\n" +
                "sing\t\tsang\t\tsung\n" +
                "sink\t\tsank\t\tsunk\n" +
                "spring\t\tsprang\t\tsprung\n" +
                "swim\t\tswam\t\tswum\n");
    }
}
