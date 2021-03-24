package com.androidlearning.covid_killer;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.androidlearning.covid_killer.GameView.screenRatioX;
import static com.androidlearning.covid_killer.GameView.screenRatioY;

public class Virus {

    public int speed = 20;
    public boolean wasShot = true;
    int x= 0,y,width,height,virusCounter = 1;
    Bitmap virus;

    Virus (Resources res) {

        virus = BitmapFactory.decodeResource(res, R.drawable.virus);

        width = virus.getWidth();
        height = virus.getHeight();

        width /=6;
        height /=6;

        width =(int) (width *screenRatioX);
        height = (int) (height *screenRatioY);

        virus = Bitmap.createScaledBitmap(virus, width, height, false);

        y= -height;
    }

    Bitmap getVirus () {
        if(virusCounter == 1) {
            virusCounter++;
            return virus;
        }
        if(virusCounter == 2) {
            virusCounter++;
            return virus;
        }
        if(virusCounter == 3) {
            virusCounter++;
            return virus;
        }
        virusCounter = 1;

        return virus;

    }

    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);

    }

}
