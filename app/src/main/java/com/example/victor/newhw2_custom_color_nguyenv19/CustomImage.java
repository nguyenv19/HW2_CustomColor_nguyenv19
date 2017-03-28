package com.example.victor.newhw2_custom_color_nguyenv19;

/*
 *
 *  Created by Victor Nguyen on 3/24/2017
 *
 *  Class for the image
 *
 *
 *
 *
 *
 *
 */
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;


/**
 * Created by Victor on 3/23/2017.
 */
public class CustomImage
{
    private int smallcircleSize = 80;
    private int width = 1000;
    private int length = 1000;
    protected Paint leftcirclePaint = new Paint();
    protected Paint rightcirclePaint = new Paint();
    protected Paint trsmallcirclePaint = new Paint();
    protected Paint lrsmallcirclePaint = new Paint();
    protected Paint tlsmallcirclePaint = new Paint();
    protected Paint llsmallcirclePaint = new Paint();
    protected Paint squarePaint = new Paint() ;
    protected float x;
    protected float y;
    private int leftcircleColor;
    private int rightcircleColor;
    private int trsmallcircleColor;
    private int lrsmallcircleColor;
    private int tlsmallcircleColor;
    private int llsmallcircleColor;
    private int squareColor;

    // Gets the Red Value of the RGB
    public int getRed(String wantedRed)
    {
        if(wantedRed == "squareColor")
        {
            int red = Color.red(squareColor);
            return red;
        }
        else if(wantedRed == "leftcircleColor")
        {
            int red = Color.red(leftcircleColor);
            return red;
        }
        else if(wantedRed == "rightcircleColor")
        {
            int red = Color.red(rightcircleColor);
            return red;
        }
        else if(wantedRed == "trsmallcircleColor")
        {
            int red = Color.red(trsmallcircleColor);
            return red;
        }
        else if(wantedRed == "tlsmallcircleColor")
        {
            int red = Color.red(tlsmallcircleColor);
            return red;
        }
        else if(wantedRed == "lrsmallcircleColor")
        {
            int red = Color.red(lrsmallcircleColor);
            return red;
        }
        else if(wantedRed == "llsmallcircleColor")
        {
            int red = Color.red(llsmallcircleColor);
            return red;
        }
        return 0;
    }

    // Gets the Green Value of the RGB
    public int getGreen(String wantedGreen)
    {
        if(wantedGreen == "squareColor")
        {
            int green = Color.green(squareColor);
            return green;
        }
        else if(wantedGreen == "leftcircleColor")
        {
            int green = Color.green(leftcircleColor);
            return green;
        }
        else if(wantedGreen == "rightcircleColor")
        {
            int green = Color.green(rightcircleColor);
            return green;
        }
        if(wantedGreen == "trsmallcircleColor")
        {
            int green = Color.green(trsmallcircleColor);
            return green;
        }
        if(wantedGreen == "tlsmallcircleColor")
        {
            int green = Color.green(tlsmallcircleColor);
            return green;
        }
        if(wantedGreen == "lrsmallcircleColor")
        {
            int green = Color.green(lrsmallcircleColor);
            return green;
        }
        if(wantedGreen == "llsmallcircleColor")
        {
            int green = Color.green(llsmallcircleColor);
            return green;
        }
        return 0;
    }

    // Gets the Blue value of the RGB
    public int getBlue(String wantedBlue)
    {
        if(wantedBlue == "squareColor")
        {
            int blue = Color.blue(squareColor);
            return blue;
        }
        else if(wantedBlue == "leftcircleColor")
        {
            int blue = Color.blue(leftcircleColor);
            return blue;
        }
        else if(wantedBlue == "rightcircleColor")
        {
            int blue = Color.blue(rightcircleColor);
            return blue;
        }
        if(wantedBlue == "trsmallcircleColor")
        {
            int blue = Color.blue(trsmallcircleColor);
            return blue;
        }
        if(wantedBlue == "tlsmallcircleColor")
        {
            int blue = Color.blue(tlsmallcircleColor);
            return blue;
        }
        if(wantedBlue == "lrsmallcircleColor")
        {
            int blue = Color.blue(lrsmallcircleColor);
            return blue;
        }
        if(wantedBlue == "llsmallcircleColor")
        {
            int blue = Color.blue(llsmallcircleColor);
            return blue;
        }
        return 0;
    }

    // Setter for the Color RGB
    public void setColor(String newColor, int R, int G, int B)
    {
        if(newColor=="squareColor")
        {
            squareColor = Color.rgb(R, G, B);
            squarePaint.setColor(squareColor);
        }
        else if(newColor=="leftcircleColor")
        {
            leftcircleColor = Color.rgb(R, G, B);
            leftcirclePaint.setColor(leftcircleColor);
        }
        if(newColor=="rightcircleColor")
        {
            rightcircleColor = Color.rgb(R, G, B);
            rightcirclePaint.setColor(rightcircleColor);
        }
        if(newColor=="trsmallcircleColor")
        {
            trsmallcircleColor = Color.rgb(R, G, B);
            trsmallcirclePaint.setColor(trsmallcircleColor);
        }
        if(newColor=="tlsmallcircleColor")
        {
            tlsmallcircleColor = Color.rgb(R, G, B);
            tlsmallcirclePaint.setColor(tlsmallcircleColor);
        }
        if(newColor=="lrsmallcircleColor")
        {
            lrsmallcircleColor = Color.rgb(R, G, B);
            lrsmallcirclePaint.setColor(lrsmallcircleColor);
        }
        if(newColor=="llsmallcircleColor")
        {
            llsmallcircleColor = Color.rgb(R, G, B);
            llsmallcirclePaint.setColor(llsmallcircleColor);
        }

    }

    // Ctor for the class
    public CustomImage()
    {
        x = 0;
        y = 0;

        // Sets the Colors
        leftcircleColor = Color.rgb(255, 255, 255);
        rightcircleColor = Color.rgb(0, 0, 0);
        trsmallcircleColor = Color.rgb(255, 255, 255);
        lrsmallcircleColor = Color.rgb(255, 255, 255);
        tlsmallcircleColor = Color.rgb(0, 0, 0);
        llsmallcircleColor = Color.rgb(0, 0, 0);
        squareColor = Color.rgb(180, 180, 180);


        leftcirclePaint.setColor(leftcircleColor);
        leftcirclePaint.setStyle(Paint.Style.FILL);

        rightcirclePaint.setColor(rightcircleColor);
        rightcirclePaint.setStyle(Paint.Style.FILL);

        trsmallcirclePaint.setColor(trsmallcircleColor);
        trsmallcirclePaint.setStyle(Paint.Style.FILL);

        lrsmallcirclePaint.setColor(lrsmallcircleColor);
        lrsmallcirclePaint.setStyle(Paint.Style.FILL);

        tlsmallcirclePaint.setColor(tlsmallcircleColor);
        tlsmallcirclePaint.setStyle(Paint.Style.FILL);

        llsmallcirclePaint.setColor(llsmallcircleColor);
        llsmallcirclePaint.setStyle(Paint.Style.FILL);

        squarePaint.setColor(squareColor);
        squarePaint.setStyle(Paint.Style.FILL);
    }

    // All the shapes in the drawing
    public void draw(Canvas canvas)
    {
        Rect square = new Rect((int)x, (int)y, width, length);
        RectF squareF = new RectF((int)x, (int)y, width, length);

        canvas.drawRect(square, squarePaint);
        canvas.drawArc(squareF, 270, -180, true, leftcirclePaint);
        canvas.drawArc(squareF, 270, 180, true, rightcirclePaint) ;
        canvas.drawCircle(x+250, y+300, smallcircleSize, tlsmallcirclePaint);
        canvas.drawCircle(x+750, y+300, smallcircleSize, trsmallcirclePaint );
        canvas.drawCircle(x+250, y+700, smallcircleSize, llsmallcirclePaint);
        canvas.drawCircle(x+750, y+700, smallcircleSize, lrsmallcirclePaint);

    }
}
