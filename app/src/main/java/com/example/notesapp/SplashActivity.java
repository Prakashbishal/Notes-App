package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView textView = findViewById(R.id.textView);

        // Scale and fade in animation
        ObjectAnimator scaleAnimatorX = ObjectAnimator.ofFloat(textView, "scaleX", 0.5f, 1f);
        ObjectAnimator scaleAnimatorY = ObjectAnimator.ofFloat(textView, "scaleY", 0.5f, 1f);
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);

        // Set the duration of the animation
        scaleAnimatorX.setDuration(1000);
        scaleAnimatorY.setDuration(1000);
        alphaAnimator.setDuration(1000);

        // Start the animations
        scaleAnimatorX.start();
        scaleAnimatorY.start();
        alphaAnimator.start();
        Objects.requireNonNull(getSupportActionBar()).hide();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity2.class));
                finish();
            }
        }, 3000);
    }
}