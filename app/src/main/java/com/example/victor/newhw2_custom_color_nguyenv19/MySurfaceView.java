package com.example.victor.newhw2_custom_color_nguyenv19;

/**
 *  Created by Victor on 3/24/2017.
 *
 *  Custom surfaceview for the CustomImage
 *
 *
 *
 */

 import android.content.Context;
 import android.graphics.Canvas;
 import android.util.AttributeSet;
 import android.view.SurfaceView;




public class MySurfaceView extends SurfaceView
{

    private CustomImage mainImage = new CustomImage();


    private void myInitializationStuff()
    {
        setWillNotDraw(false);
    }

    public MySurfaceView(Context context)
    {
        super(context);
        myInitializationStuff();


    }
    public MySurfaceView(Context context, AttributeSet set)
    {
        super(context, set);
        myInitializationStuff();
    }
    public MySurfaceView(Context context, AttributeSet set, int defStyle)
    {
        super(context, set, defStyle);
        myInitializationStuff();
    }

    // Puts
    public void setCustomImage(CustomImage newcustomImage)
    {
        if(newcustomImage != null)
        {
            this.mainImage = newcustomImage;
        }
    }

    // Draws the image on the surface view
    public void draw(Canvas canvas)
    {

        super.draw(canvas);
        mainImage.draw(canvas);
    }
}

