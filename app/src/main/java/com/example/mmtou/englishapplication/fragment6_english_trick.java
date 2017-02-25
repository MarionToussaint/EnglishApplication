package com.example.mmtou.englishapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

/**
 * Created by mmtou on 10/02/2017.
 */

public class fragment6_english_trick extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView2 = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment6_english_trick);

        TextView title = (TextView) findViewById(R.id.verb2);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView ssCat = (TextView) findViewById(R.id.ssCat1);
        TextView exemple2 = (TextView) findViewById(R.id.example);

        listTextView.add(ssCat);
        listTextView.add(title);

        listTextView2.add(text);
        listTextView2.add(exemple2);
        style.changeFont("fonts/Aprikas_light_Demo.ttf",fragment6_english_trick.this,listTextView2);
        style.changeFont("fonts/LemonMilk.ttf",fragment6_english_trick.this,listTextView);


        title.setText("Verbs With 3 Different Vowels !");
        text.setText("Are you ready for a challenge ? These irregular verbs have different vowels in each form : fortunately, they do follow a pattern\n");
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
