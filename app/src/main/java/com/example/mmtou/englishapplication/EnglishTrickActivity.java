package com.example.mmtou.englishapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TabHost;
import android.widget.TextView;

public class EnglishTrickActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_trick);

        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabHost.TabSpec tab1 = tabHost.newTabSpec("Introduction");
        // setting Title and Icon for the Tab
        tab1.setIndicator("Introduction");
        Intent tab1Intent = new Intent(this, fragment1_english_trick.class);
        tab1.setContent(tab1Intent);

        // Tab for Songs
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Category 1");
        tab2.setIndicator("Category 1");
        Intent tab2Intent = new Intent(this, fragment2_english_trick.class);
        tab2.setContent(tab2Intent);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("Category 2");
        tab3.setIndicator("Category 2");
        Intent tab3Intent = new Intent(this, fragment3_english_trick.class);
        tab3.setContent(tab3Intent);

        TabHost.TabSpec tab4 = tabHost.newTabSpec("Category 3");
        tab4.setIndicator("Category 3");
        Intent tab4Intent = new Intent(this, fragment4_english_trick.class);
        tab4.setContent(tab4Intent);

        TabHost.TabSpec tab5 = tabHost.newTabSpec("Category 4");
        tab5.setIndicator("Category 4");
        Intent tab5Intent = new Intent(this, fragment5_english_trick.class);
        tab5.setContent(tab5Intent);

        TabHost.TabSpec tab6 = tabHost.newTabSpec("Category 5");
        tab6.setIndicator("Category 5");
        Intent tab6Intent = new Intent(this, fragment6_english_trick.class);
        tab6.setContent(tab6Intent);

        TabHost.TabSpec tab7 = tabHost.newTabSpec("Category 6");
        tab7.setIndicator("Category 6");
        Intent tab7Intent = new Intent(this, fragment7_english_trick.class);
        tab7.setContent(tab7Intent);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);
        tabHost.addTab(tab5);
        tabHost.addTab(tab6);
        tabHost.addTab(tab7);


        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FD9BAC"));
            tv.setTypeface(font2, Typeface.BOLD);
        }
    }
}
