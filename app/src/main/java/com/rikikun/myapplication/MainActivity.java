package com.rikikun.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView profile;
    LinearLayout bio;
    Animation atg, atg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = findViewById(R.id.profile);
        bio = findViewById(R.id.bio);

        atg1 = AnimationUtils.loadAnimation(this, R.anim.atg1);
        atg = AnimationUtils.loadAnimation(this, R.anim.atg);

        profile.startAnimation(atg);
        bio.startAnimation(atg1);

    }
}