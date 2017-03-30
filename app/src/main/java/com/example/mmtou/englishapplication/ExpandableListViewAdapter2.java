package com.example.mmtou.englishapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.mmtou.englishapplication.model.StyleModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mmtou on 30/03/2017.
 */

public class ExpandableListViewAdapter2 extends BaseExpandableListAdapter {
    private ArrayList<TextView> listTextView = new ArrayList<TextView>();
    private StyleModel style = new StyleModel();
    private Context context;
    private List<String> parentDataSource;
    private HashMap<String, List<String>> childDataSource;

    public ExpandableListViewAdapter2(Context context, List<String> childParent, HashMap<String, List<String>> child) {
        this.context = context;
        this.parentDataSource = childParent;
        this.childDataSource = child;
    }

    @Override
    public int getGroupCount() {
        return this.parentDataSource.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.childDataSource.get(this.parentDataSource.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return parentDataSource.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.childDataSource.get(parentDataSource.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_parent, parent, false);

        }
        String parentHeader = (String)getGroup(groupPosition);
        TextView parentItem = (TextView) view.findViewById(R.id.parent_layout);
        Typeface font = Typeface.createFromAsset(context.getAssets(),"fonts/Aprikas_light_Demo.ttf");
        parentItem.setTypeface(font);
        parentItem.setText(parentHeader);
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout1, parent, false);
        }
        String childName = (String)getChild(groupPosition, childPosition);
        TextView childItem = (TextView)view.findViewById(R.id.child_layout);
        listTextView.add(childItem);
        listTextView.add((TextView)view.findViewById(R.id.example));
        listTextView.add((TextView)view.findViewById(R.id.pret1));
        listTextView.add((TextView)view.findViewById(R.id.pastPart1));
        listTextView.add((TextView)view.findViewById(R.id.answer));
        listTextView.add((TextView)view.findViewById(R.id.pret2));
        listTextView.add((TextView)view.findViewById(R.id.pastPart2));
        listTextView.add((TextView)view.findViewById(R.id.child_layout2));
        style.changeFont("fonts/Aprikas_light_Demo.ttf",this.context,listTextView);

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
