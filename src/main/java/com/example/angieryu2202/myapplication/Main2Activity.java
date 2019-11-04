package com.example.angieryu2202.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView myTextView = (TextView) findViewById(R.id.survey_result);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/HoonWhitecatR.ttf");
        myTextView.setTypeface(typeface);

        addListenerOnButton();}
    public void addListenerOnButton() {

        final Context context = this;

        Button button = (Button) findViewById(R.id.next_button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main3Activity.class);
                startActivity(intent);

            }

        });
    }
}
