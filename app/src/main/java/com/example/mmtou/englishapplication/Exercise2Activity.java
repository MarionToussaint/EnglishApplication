package com.example.mmtou.englishapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Exercise2Activity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private List<String>parentHeaderInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Aprikas_light_Demo.ttf");
        ((TextView)findViewById(R.id.title)).setTypeface(font);
        ((TextView)findViewById(R.id.rule)).setTypeface(font);
        ((TextView)findViewById(R.id.verb2)).setTypeface(font);
        ((TextView)findViewById(R.id.editText)).setTypeface(font);
        ((TextView)findViewById(R.id.editText2)).setTypeface(font);
        ((TextView)findViewById(R.id.verb)).setTypeface(font);
        ((TextView)findViewById(R.id.editText3)).setTypeface(font);
        ((TextView)findViewById(R.id.editText4)).setTypeface(font);

        parentHeaderInformation = new ArrayList<String>();
        parentHeaderInformation.add("Show Example");
        HashMap<String, List<String>> allChildItems = returnGroupedChildItems();
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        ExpandableListViewAdapter expandableListViewAdapter = new ExpandableListViewAdapter(getApplicationContext(), parentHeaderInformation, allChildItems);
        expandableListView.setAdapter(expandableListViewAdapter);
        //expandableListView.setChildIndicator(null);
    }

    private HashMap<String, List<String>> returnGroupedChildItems(){
        HashMap<String, List<String>> childContent = new HashMap<String, List<String>>();
        List<String> cars = new ArrayList<String>();
        cars.add("Give");
        childContent.put(parentHeaderInformation.get(0), cars);
        return childContent;
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}