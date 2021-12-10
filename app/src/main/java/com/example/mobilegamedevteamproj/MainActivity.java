package com.example.mobilegamedevteamproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.game_start);
        setContentView(new GameScreen(this));

    }

    public void start(View view) {
        Intent intent = new Intent(this, GameStart.class);
        startActivity(intent);
        finish();
    }
}