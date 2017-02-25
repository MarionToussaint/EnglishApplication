package com.example.mmtou.englishapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

/**
 * Created by mmtou on 08/02/2017.
 */

public class fragment3_english_trick extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment3_english_trick);

        TextView title = (TextView) findViewById(R.id.verb2);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView exemple = (TextView) findViewById(R.id.example);

        listTextView.add(text);
        listTextView.add(exemple);
        style.changeFont("fonts/Aprikas_light_Demo.ttf",fragment3_english_trick.this,listTextView);
        style.changeFontOfSingleText("fonts/LemonMilk.ttf",fragment3_english_trick.this,title);

        title.setText("Verbs With Identical Present And Past Participle");
        text.setText("These verbs are the same in the present and the past participle ! Only the past form is different :\n");
        exemple.setText("come\t\tcame\t\tcome" +"\n" + "become\t\tbecame\t\tbecome"+"\n" + "run\t\tran\t\trun");
    }
}
