package com.example.angieryu2202.myapplication;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class survey extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        final CheckBox First, Second, Third;

        First = (CheckBox) findViewById(R.id.checkBox);
        Second = (CheckBox) findViewById(R.id.checkBox2);
        Third = (CheckBox) findViewById(R.id.checkBox3);
        final ArrayList<String> result = new ArrayList<String>();

        //First CheckBox
        First.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (First.isChecked()) {
                    Toast.makeText(survey.this, "First checkbox checked", Toast.LENGTH_SHORT).show();
                    result.add("First Checked");
                    System.out.println(result);
                } else {
                    Toast.makeText(survey.this, "First checkbox Unchecked", Toast.LENGTH_SHORT).show();
                }

            }
        });

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox", false);
        checkBox1.setChecked(checked);
        addListenerOnButton();}

        public void addListenerOnButton() {

        final Context context = this;

        Button button = (Button) findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);

            }

        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("checkBox", checked).commit();
                break;
        }


    }
}





