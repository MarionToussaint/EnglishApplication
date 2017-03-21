package com.example.mmtou.englishapplication.model;

import android.view.View;
import android.widget.CheckBox;

/**
 * Created by mmtou on 17/03/2017.
 */

public class Exercise5Model {
    public String[] list1 = new String[]{"learn","play","swell","","","say","come","caught","do","slept"};
    public int[] listAnswer = new int[]{0,1,7,3,4,2,6,7,2,7};

    public void oneBoxOnly(final CheckBox one,final CheckBox two) {
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    two.setChecked(false);
                    one.setChecked(false);
                }
            }
        });
    }


}
