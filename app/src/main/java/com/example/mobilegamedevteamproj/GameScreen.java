package com.example.mobilegamedevteamproj;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.View;

public class GameScreen extends View {

    Context context;
    Bitmap background;
    Handler handler;
    Runnable runnable;

    public GameScreen(Context context) {
        super(context);
        this.context = context;
        background = BitmapFactory.decodeResource(getResources(),R.drawable.space);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(background,0,0,null);
    }
}
