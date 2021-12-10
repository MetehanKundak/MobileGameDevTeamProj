package com.example.mobilegamedevteamproj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Player {

    Context context;
    Bitmap player_bitmap;

    public Player(Context context){
        this.context = context;
        player_bitmap = BitmapFactory.decodeResource(context.getResources(),R.drawable.Player);
    }

}
