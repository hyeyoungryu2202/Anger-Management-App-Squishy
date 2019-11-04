package com.example.angieryu2202.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.bumptech.glide.request.target.Target;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView rabbit = (ImageView) findViewById(R.id.gif1);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(rabbit);
        Glide.with(this).load(R.drawable.gif1).override(500,500).into(gifImage);


        ImageView rabbit2 = (ImageView) findViewById(R.id.gif2);
        GlideDrawableImageViewTarget gifImage2 = new GlideDrawableImageViewTarget(rabbit2);
        Glide.with(this).load(R.drawable.gif2).override(500,500).into(gifImage2);

        ImageView rabbit3 = (ImageView) findViewById(R.id.gif3);
        GlideDrawableImageViewTarget gifImage3 = new GlideDrawableImageViewTarget(rabbit3);
        Glide.with(this).load(R.drawable.gif3).override(500,500).into(gifImage3);

        ImageView rabbit4 = (ImageView) findViewById(R.id.gif4);
        GlideDrawableImageViewTarget gifImage4 = new GlideDrawableImageViewTarget(rabbit4);
        Glide.with(this).load(R.drawable.gif4).override(500,500).into(gifImage4);

        ImageView rabbit5 = (ImageView) findViewById(R.id.gif5);
        GlideDrawableImageViewTarget gifImage5 = new GlideDrawableImageViewTarget(rabbit5);
        Glide.with(this).load(R.drawable.gif5).override(500,500).into(gifImage5);

        ImageView rabbit6 = (ImageView) findViewById(R.id.gif6);
        GlideDrawableImageViewTarget gifImage6 = new GlideDrawableImageViewTarget(rabbit6);
        Glide.with(this).load(R.drawable.gif6).override(500,500).into(gifImage6);

    }
}
