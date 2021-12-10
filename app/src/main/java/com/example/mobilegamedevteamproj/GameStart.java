package com.example.mobilegamedevteamproj;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameStart extends AppCompatActivity {

    GameScreen gameScreen;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameScreen = new GameScreen(this);
        setContentView(gameScreen);

//        setContentView(R.layout.game_start);
    }

//    public void gameStart(View view){
//
//        startActivity(new Intent(this,MainActivity.class));
//        finish();
//    }
}
