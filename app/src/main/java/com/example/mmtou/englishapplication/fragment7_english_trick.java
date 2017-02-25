package com.example.mmtou.englishapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;

/**
 * Created by mmtou on 10/02/2017.
 */

public class fragment7_english_trick extends AppCompatActivity {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment7_english_trick);

        TextView title = (TextView) findViewById(R.id.verb2);
        TextView text = (TextView) findViewById(R.id.tab);
        TextView exemple2 = (TextView) findViewById(R.id.example);

        listTextView.add(text);
        listTextView.add(exemple2);
        style.changeFont("fonts/Aprikas_light_Demo.ttf",fragment7_english_trick.this,listTextView);
        style.changeFontOfSingleText("fonts/LemonMilk.ttf",fragment7_english_trick.this,title);

        title.setText("The REALLY Irregular Verbs");
        text.setText("Well, these are the completely irregular verbs – the ones that don’t fit into any of " +
                "the categories above! They are also some of the most commonly used verbs in the English language, so make sure to memorize them in all their crazy irregular forms !\n");
        exemple2.setText("be\t\twas / were\t\tbeen\n" +
                "do\t\tdid\t\tdone\n" +
                "go\t\twent\t\tgone\n" +
                "have\t\thad\t\thad\n" +
                "make\t\tmade\t\tmade\n");
    }
}
