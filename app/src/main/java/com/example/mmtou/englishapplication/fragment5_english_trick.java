package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mmtou on 10/02/2017.
 */

public class fragment5_english_trick extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment5_english_trick);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        TextView title = (TextView) findViewById(R.id.titlecat1);
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

        title.setTypeface(font2);
        ssCat.setTypeface(font2);
        ssCat1.setTypeface(font2);
        ssCat2.setTypeface(font2);
        ssCat3.setTypeface(font2);
        ssCat4.setTypeface(font2);
        ssCat5.setTypeface(font2);
        exemple2.setTypeface(font);
        exemple3.setTypeface(font);
        exemple4.setTypeface(font);
        exemple5.setTypeface(font);
        exemple7.setTypeface(font);
        exemple6.setTypeface(font);

        title.setText("Verbs With Vowel Changes");
        ssCat.setText("Long “E” Changes To Short “E”");
        exemple2.setText("keep\tkept\tkept\n" +
                "sleep\tslept\tslept\n" +
                "feel\tfelt\tfelt\n" +
                "bleed\tbled\tbled\n" +
                "feed\tfed\tfed\n" +
                "meet\tmet\tmet\n" +
                "lead\tled\tled\n");
        ssCat1.setText("“Ea” Is Pronounced Differently");
        exemple3.setText("deal\tdealt\tdealt\n" +
                "dream\tdreamt\tdreamt\n" +
                "mean\tmeant\tmeant\n" +
                "read\tread\tread\n" +
                "hear\theard\theard\n");
        ssCat2.setText("Long “I” Changes To “Ou”");
        exemple4.setText("bind\tbound\tbound\n" +
                "find\tfound\tfound\n" +
                "grind\tground\tground\n" +
                "wind\twound\twound\n");
        ssCat3.setText("Short “I” Changes To “U”");
        exemple5.setText("dig\tdug\tdug\n" +
                "stick\tstuck\tstuck\n" +
                "spin\tspun\tspun\n" +
                "sting\tstung\tstung\n" +
                "swing\tswung\tswung\n");
        ssCat4.setText("-Ell Changes To -Old");
        exemple6.setText("sell\tsold\tsold\n" +
                "tell\ttold\ttold\n");
        ssCat5.setText("-Ought And –Aught Endings");
        exemple7.setText("bring\tbrought\tbrought\n" +
                "buy\tbought\tbought\n" +
                "catch\tcaught\tcaught\n" +
                "fight\tfought\tfought\n" +
                "seek\tsought\tsought\n" +
                "teach\ttaught\ttaught\n" +
                "think\tthought\tthought\n");

    }
}
