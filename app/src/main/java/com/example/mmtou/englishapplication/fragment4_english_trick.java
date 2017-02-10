package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by mmtou on 08/02/2017.
 */

public class fragment4_english_trick extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment4_english_trick);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        TextView title = (TextView) findViewById(R.id.titlecat1);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView ssCat = (TextView) findViewById(R.id.ssCat);
        TextView exemple2 = (TextView) findViewById(R.id.example2);
        TextView ssCat1 = (TextView) findViewById(R.id.ssCat1);
        TextView exemple3 = (TextView) findViewById(R.id.example3);
        TextView ssCat2 = (TextView) findViewById(R.id.ssCat2);
        TextView exemple4 = (TextView) findViewById(R.id.example4);
        TextView ssCat3 = (TextView) findViewById(R.id.ssCat3);
        TextView exemple5 = (TextView) findViewById(R.id.example5);
        title.setTypeface(font2);
        ssCat.setTypeface(font2);
        ssCat1.setTypeface(font2);
        ssCat2.setTypeface(font2);
        ssCat3.setTypeface(font2);
        text.setTypeface(font);
        exemple2.setTypeface(font);
        exemple3.setTypeface(font);
        exemple4.setTypeface(font);
        exemple5.setTypeface(font);

        title.setText("Verbs With –N In The Past Participle");
        text.setText("These verbs are a little more complicated, as they have –n in the past participle form. There are a few different groups of verbs :");
        ssCat.setText("With “O” In The Past And Past Participle");
        exemple2.setText("break\t\tbroke\t\tbroken"+"\n" + "choose\t\tchose\t\tchosen" +"\n"+ "forget\t\tforgot\t\tforgotten"
        + "\n"+"freeze\t\tfroze\t\tfrozen\n" + "get\t\tgot\t\tgotten\n" + "speak\t\tspoke\t\tspoken\n" + "steal\t\tstole\t\tstolen\n"
        + "tear\t\ttore\t\ttorn\n" + "wake\t\twoke\t\twoken\n" + "wear\t\twore\t\tworn\n");
        ssCat1.setText("With “O” In The Past Only");
        exemple3.setText("drive\t\tdrove\t\tdriven\n" +
                "ride\t\trode\t\tridden\n" +
                "rise\t\trose\t\trisen\n" +
                "write\t\twrote\t\twritten\n");
        ssCat2.setText("Past With -Ew, Past Participle With -Own");
        exemple4.setText("blow\t\tblew\t\tblown\n" +
                "fly\t\tflew\t\tflown\n" +
                "grow\t\tgrew\t\tgrown\n" +
                "know\t\tknew\t\tknown\n" +
                "throw\t\tthrew\t\tthrown\n");
        ssCat3.setText("Other Irregular Verbs With Past Participle Ending In –N");
        exemple5.setText("bite\t\tbit\t\tbitten\n" +
                "hide\t\thid\t\thidden\n" +
                "eat\t\tate\t\teaten\n" +
                "fall\t\tfell\t\tfallen\n" +
                "forbid\t\tforbade\t\tforbidden\n" +
                "forgive\t\tforgave\t\tforgiven\n" +
                "give\t\tgave\t\tgiven\n" +
                "see\t\tsaw\t\tseen\n" +
                "shake\t\tshook\t\tshaken\n" +
                "take\t\ttook\t\ttaken\n");

    }
}
