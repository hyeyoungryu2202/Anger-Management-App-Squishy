package com.example.angieryu2202.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView good = (ImageView) findViewById(R.id.gif1);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(good);
        Glide.with(this).load(R.drawable.fire).into(gifImage);


        addListenerOnButton();}
    public void addListenerOnButton() {

        final Context context = this;

        Button button = (Button) findViewById(R.id.button_next2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main4Activity.class);
                startActivity(intent);

            }

        });
    }
}
