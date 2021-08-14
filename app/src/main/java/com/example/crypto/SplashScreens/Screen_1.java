package com.example.crypto.SplashScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.crypto.R;

import java.util.Timer;
import java.util.TimerTask;

public class Screen_1 extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Screen_1.this, Screen_2.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}