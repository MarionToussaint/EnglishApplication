package com.example.mmtou.englishapplication;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mmtou.englishapplication.R;

import org.w3c.dom.Text;

import java.lang.reflect.Type;
import java.util.zip.Inflater;

/**
 * Created by mmtou on 08/02/2017.
 */

public class fragment1_english_trick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1_english_trick);
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/LemonMilk.ttf");
        TextView title = (TextView) findViewById(R.id.titleTrick);
        TextView text = (TextView) findViewById(R.id.intro);
        title.setTypeface(font2);
        text.setTypeface(font);

        title.setText("Tips For Learning Irregular Verbs");
        text.setText("Did you know that about 70% of the time when we use a verb in English, it is an irregular one ? That means that learning and using irregular verbs is essential for learning English !\n" +
                "\n" +
                "The English language has so many irregular verbs that it can make you go crazy… but even irregular verbs follow some patterns ! In this lesson, you’ll learn “groups” of irregular verbs that can make it easier to memorize them\n" +
                "\n" +
                "Don’t just study this list – try to create your own sentences and use all the verbs you know ! This will help you remember them much better\n" +
                "\n" +
                "Ready ? Let’s go !");


        System.out.println(text.getText());
    }



}

