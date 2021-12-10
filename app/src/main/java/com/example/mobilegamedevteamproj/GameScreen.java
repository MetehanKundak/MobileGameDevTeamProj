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
import android.view.MotionEvent;
import android.view.View;

public class GameScreen extends View {

    Context context;
    Bitmap background;
    Handler handler;
    Runnable runnable;
    static int dx,dy;
    Rect rectangle;
    Player playerShip;
    long update = 30;
    public GameScreen(Context context) {
        super(context);

        background = BitmapFactory.decodeResource(getResources(),R.drawable.space);

        Display disp = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        Point dimension = new Point();
        disp.getSize(dimension);
        dx = dimension.x;
        dy = dimension.y;
        rectangle = new Rect(0, 0, dx, dy);

        playerShip = new Player(context);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(background,null,rectangle,null);

        canvas.drawBitmap(playerShip.get_Player(), playerShip.playerX, playerShip.playerY, null);
        handler.postDelayed(runnable,update);
    }



}
