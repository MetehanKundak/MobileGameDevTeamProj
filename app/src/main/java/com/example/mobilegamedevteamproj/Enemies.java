package com.example.mobilegamedevteamproj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Enemies {
    Context context;
    Bitmap enemyShip;
    int enemyX,enemyY;
    int enemySpeed;
    Random number;

    public Enemies(Context context){
        this.context = context;
        enemyShip = BitmapFactory.decodeResource(context.getResources(),R.drawable.enemyship1);
        number = new Random();

        enemyX = GameScreen.dx + number.nextInt(500);
        enemyY = 0;
        enemySpeed = 10 + number.nextInt(5);
    }

    public Bitmap enemyBitmap(){ // Method for getting the bitmap
        return enemyShip;
    }

    public int enemyWidth(){
        return enemyShip.getWidth(); // Method for getting the enemy bitmap Width
    }

    public int enemyHeight(){
        return enemyShip.getHeight(); // Method for getting the enemy bitmap Height
    }

}
