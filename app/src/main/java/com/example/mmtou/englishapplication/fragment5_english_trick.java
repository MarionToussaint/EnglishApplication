package com.example.mmtou.englishapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

/**
 * Created by mmtou on 10/02/2017.
 */

public class fragment5_english_trick extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView2 = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment5_english_trick);

        TextView title = (TextView) findViewById(R.id.verb2);
        TextView ssCat = (TextView) findViewById(R.id.ssCat);
        TextView exemple2 = (TextView) findViewById(R.id.example2);
        TextView ssCat1 = (TextView) findViewById(R.id.ssCat1);
        TextView exemple3 = (TextView) findViewById(R.id.example3);
        TextView ssCat2 = (TextView) findViewById(R.id.ssCat2);
        TextView exemple4 = (TextView) findViewById(R.id.example4);
        TextView ssCat3 = (TextView) findViewById(R.id.ssCat3);
        TextView exemple5 = (TextView) findViewById(R.id.example5);
        TextView ssCat4 = (TextView) findViewById(R.id.ssCat4);
        TextView exemple6 = (TextView) findViewById(R.id.example6);
        TextView ssCat5 = (TextView) findViewById(R.id.ssCat5);
        TextView exemple7 = (TextView) findViewById(R.id.example7);

        listTextView.add(title);
        listTextView.add(ssCat);
        listTextView.add(ssCat1);
        listTextView.add(ssCat2);
        listTextView.add(ssCat3);
        listTextView.add(ssCat4);
        listTextView.add(ssCat5);

        listTextView2.add(exemple2);
        listTextView2.add(exemple3);
        listTextView2.add(exemple4);
        listTextView2.add(exemple5);
        listTextView2.add(exemple6);
        listTextView2.add(exemple7);
        style.changeFont("fonts/Aprikas_light_Demo.ttf",fragment5_english_trick.this,listTextView2);
        style.changeFont("fonts/LemonMilk.ttf",fragment5_english_trick.this,listTextView);


        title.setText("Verbs With Vowel Changes\n");
        ssCat.setText("Long “E” Changes To Short “E”");
        exemple2.setText("keep\t\tkept\t\tkept\n" +
                "sleep\t\tslept\t\tslept\n" +
                "feel\t\tfelt\t\tfelt\n" +
                "bleed\t\tbled\t\tbled\n" +
                "feed\t\tfed\t\tfed\n" +
                "meet\t\tmet\t\tmet\n" +
                "lead\t\tled\t\tled\n");
        ssCat1.setText("“Ea” Is Pronounced Differently");
        exemple3.setText("deal\t\tdealt\t\tdealt\n" +
                "dream\t\tdreamt\t\tdreamt\n" +
                "mean\t\tmeant\t\tmeant\n" +
                "read\t\tread\t\tread\n" +
                "hear\t\theard\t\theard\n");
        ssCat2.setText("Long “I” Changes To “Ou”");
        exemple4.setText("bind\t\tbound\t\tbound\n" +
                "find\t\tfound\t\tfound\n" +
                "grind\t\tground\t\tground\n" +
                "wind\t\twound\t\twound\n");
        ssCat3.setText("Short “I” Changes To “U”");
        exemple5.setText("dig\t\tdug\t\tdug\n" +
                "stick\t\tstuck\t\tstuck\n" +
                "spin\t\tspun\t\tspun\n" +
                "sting\t\tstung\t\tstung\n" +
                "swing\t\tswung\t\tswung\n");
        ssCat4.setText("-Ell Changes To -Old");
        exemple6.setText("sell\t\tsold\t\tsold\n" +
                "tell\t\ttold\t\ttold\n");
        ssCat5.setText("-Ought And –Aught Endings");
        exemple7.setText("bring\t\tbrought\t\tbrought\n" +
                "buy\t\tbought\t\tbought\n" +
                "catch\t\tcaught\t\tcaught\n" +
                "fight\t\tfought\t\tfought\n" +
                "seek\t\tsought\t\tsought\n" +
                "teach\t\ttaught\t\ttaught\n" +
                "think\t\tthought\t\tthought\n");

    }
}
