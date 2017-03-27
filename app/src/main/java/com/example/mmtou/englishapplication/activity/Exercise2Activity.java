package com.example.mmtou.englishapplication.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.mmtou.englishapplication.ExpandableListViewAdapter;
import com.example.mmtou.englishapplication.R;
import com.example.mmtou.englishapplication.model.Exercise2Model;
import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Exercise2Activity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private List<String>parentHeaderInformation;
    private ArrayList<TextView> listTitle = new ArrayList<TextView>();
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private ArrayList<EditText> listEditText = new ArrayList<EditText>();
    private StyleModel style = new StyleModel();
    private Exercise2Model model = new Exercise2Model();
    public static String[] i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        listTitle.add(((TextView)findViewById(R.id.title)));
        listTitle.add(((TextView)findViewById(R.id.rule)));
        style.changeFontAndBold("fonts/Aprikas_light_Demo.ttf",Exercise2Activity.this,listTitle);

        listTextView.add(((TextView)findViewById(R.id.verb)));
        listTextView.add(((TextView)findViewById(R.id.verb2)));
        listTextView.add(((TextView)findViewById(R.id.verb3)));
        listTextView.add(((TextView)findViewById(R.id.verb4)));
        listTextView.add(((TextView)findViewById(R.id.verb5)));
        listTextView.add(((TextView)findViewById(R.id.verb6)));
        listTextView.add(((TextView)findViewById(R.id.verb7)));
        listTextView.add(((TextView)findViewById(R.id.verb8)));
        listTextView.add(((TextView)findViewById(R.id.verb9)));
        listTextView.add(((TextView)findViewById(R.id.verb10)));
        listTextView.add(((TextView)findViewById(R.id.verb11)));
        listTextView.add(((TextView)findViewById(R.id.verb12)));
        listTextView.add(((TextView)findViewById(R.id.verb13)));
        listTextView.add(((TextView)findViewById(R.id.verb14)));
        listTextView.add(((TextView)findViewById(R.id.verb15)));
        style.changeFont("fonts/Aprikas_light_Demo.ttf",Exercise2Activity.this,listTextView);

        listEditText.add(((EditText) findViewById(R.id.editText)));
        listEditText.add(((EditText) findViewById(R.id.editText2)));
        listEditText.add(((EditText)findViewById(R.id.editText3)));
        listEditText.add(((EditText) findViewById(R.id.editText4)));
        listEditText.add(((EditText)findViewById(R.id.editText5)));
        listEditText.add(((EditText)findViewById(R.id.editText6)));
        listEditText.add(((EditText)findViewById(R.id.editText7)));
        listEditText.add(((EditText)findViewById(R.id.editText8)));
        listEditText.add(((EditText)findViewById(R.id.editText9)));
        listEditText.add(((EditText)findViewById(R.id.editText10)));
        listEditText.add(((EditText)findViewById(R.id.editText11)));
        listEditText.add(((EditText)findViewById(R.id.editText12)));
        listEditText.add(((EditText)findViewById(R.id.editText13)));
        listEditText.add(((EditText)findViewById(R.id.editText14)));
        listEditText.add(((EditText)findViewById(R.id.editText15)));
        listEditText.add(((EditText)findViewById(R.id.editText16)));
        listEditText.add(((EditText)findViewById(R.id.editText17)));
        listEditText.add(((EditText)findViewById(R.id.editText18)));
        listEditText.add(((EditText)findViewById(R.id.editText19)));
        listEditText.add(((EditText)findViewById(R.id.editText20)));
        listEditText.add(((EditText)findViewById(R.id.editText21)));
        listEditText.add(((EditText)findViewById(R.id.editText22)));
        listEditText.add(((EditText)findViewById(R.id.editText23)));
        listEditText.add(((EditText)findViewById(R.id.editText24)));
        listEditText.add(((EditText)findViewById(R.id.editText25)));
        listEditText.add(((EditText)findViewById(R.id.editText26)));
        listEditText.add(((EditText)findViewById(R.id.editText27)));
        listEditText.add(((EditText)findViewById(R.id.editText28)));
        listEditText.add(((EditText)findViewById(R.id.editText29)));
        listEditText.add(((EditText)findViewById(R.id.editText30)));
        style.changeFontEdittext("fonts/Aprikas_light_Demo.ttf",Exercise2Activity.this,listEditText);

        model.changeLevel(Exercice2ChoiceActivity.level,model.listLevel1,model.listLevel2,model.listLevel3,model.listLevel4,model.listLevel5,model.listLevel6,listTextView);

        Button check = (Button)findViewById(R.id.button2);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise2Activity.this,check);
        Button reset = (Button)findViewById(R.id.button4);
        style.changeButtonFont("fonts/Aprikas_light_Demo.ttf",Exercise2Activity.this,reset);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = model.answerList(listEditText);
                startActivity(new Intent(Exercise2Activity.this,Exercise2CorrectionActivity.class));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.clearEditText(listEditText);
            }
        });


        /*parentHeaderInformation = new ArrayList<String>();
        parentHeaderInformation.add("Show Example");
        HashMap<String, List<String>> allChildItems = returnGroupedChildItems();
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        ExpandableListViewAdapter expandableListViewAdapter = new ExpandableListViewAdapter(getApplicationContext(), parentHeaderInformation, allChildItems);
        expandableListView.setAdapter(expandableListViewAdapter);
        //expandableListView.setChildIndicator(null);*/
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