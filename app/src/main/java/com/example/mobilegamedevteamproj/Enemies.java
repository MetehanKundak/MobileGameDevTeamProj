package com.example.mobilegamedevteamproj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Enemies {
    Context context;
    Bitmap enemyShip;

    public Enemies(Context context){
        this.context = context;
        enemyShip = BitmapFactory.decodeResource(context.getResources(),R.drawable.enemyship1);

    }

}
