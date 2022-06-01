package com.example.consolegamelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IntoScreen extends AppCompatActivity {
    public View view;
    public Animation anim;
    private static int TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into_screen);

        view=(ImageView)findViewById(R.id.logoRotate);

        rotateAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(IntoScreen.this, MainMenuActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

    }

    private void rotateAnimation() {
        anim = AnimationUtils.loadAnimation(this,R.anim.rotate_logo);
        view.startAnimation(anim);
    }
}