package com.example.victor.newhw2_custom_color_nguyenv19;


/*
 *
 *  Created by Victor Nguyen on 3/24/2017
 *
 *  MainActivity where everything is put together
 *
 *
 *
 *
 *
 *
 *
 */



import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener
{

    private TextView title;
    private TextView red;
    private TextView green;
    private TextView blue;
    private SeekBar r;
    private SeekBar g;
    private SeekBar b;


    CustomImage customImage;
    MySurfaceView msv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setSupportActionBar(toolbar);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);

        // initializing the variables
        title = (TextView)findViewById(R.id.titleText);
        red = (TextView)findViewById(R.id.redText);
        green = (TextView)findViewById(R.id.greenText);
        blue = (TextView)findViewById(R.id.blueText);
        r = (SeekBar)findViewById(R.id.rBar);
        g = (SeekBar)findViewById(R.id.gBar);
        b = (SeekBar)findViewById(R.id.bBar);
        title.setText("Select A Part To Modify");
        red.setText("Red: 0");
        green.setText("Green: 0");
        blue.setText("Blue: 0");


        // Red SeekBar
        r.setMax(255);
        r.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {

                red.setText("Red: " + r.getProgress());
                String name = "" + title.getText();

                // If Top Left Circle is selected, seek bar will change the red color for that part
                if(name.contains("Top Left Circle"))
                {
                    customImage.setColor("tlsmallcircleColor", r.getProgress(), customImage.getGreen("tlsmallcircleColor"), customImage.getBlue("tlsmallcircleColor"));
                    msv.invalidate();

                }

                // If Top Right Circle is selected, seek bar will change the red color for that part
                else if(name.contains("Top Right Circle"))
                {
                    customImage.setColor("trsmallcircleColor", r.getProgress(), customImage.getGreen("trsmallcircleColor"), customImage.getBlue("trsmallcircleColor"));
                    msv.invalidate();

                }

                // If Bottom Left Circle is selected, seek bar will change the red color for that part
                else if(name.contains("Bottom Left Circle"))
                {
                    customImage.setColor("llsmallcircleColor", r.getProgress(), customImage.getGreen("llsmallcircleColor"), customImage.getBlue("llsmallcircleColor"));
                    msv.invalidate();

                }

                // If Bottom Right Circle is selected, seek bar will change the red color for that part
                else if(name.contains("Bottom Right Circle"))
                {
                    customImage.setColor("lrsmallcircleColor", r.getProgress(), customImage.getGreen("lrsmallcircleColor"), customImage.getBlue("lrsmallcircleColor"));
                    msv.invalidate();
                }

                // If Right Half is selected, seek bar will change the red color for that part
                else if(name.contains("Right Half"))
                {
                    customImage.setColor("rightcircleColor", r.getProgress(), customImage.getGreen("rightcircleColor"), customImage.getBlue("rightcircleColor"));
                    msv.invalidate();

                }

                // If Left Half is selected, seek bar will change the red color for that part
                else if(name.contains("Left Half"))
                {
                    customImage.setColor("leftcircleColor", r.getProgress(), customImage.getGreen("leftcircleColor"), customImage.getBlue("leftcircleColor"));
                    msv.invalidate();

                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });


        // Seek bar for Green
        g.setMax(255);
        g.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                green.setText("Green: " + g.getProgress());


                String name = "" + title.getText();

                // If Top Left Circle is selected, seek bar will change the green color for that part
                if(name.contains("Top Left Circle"))
                {
                    customImage.setColor("tlsmallcircleColor", customImage.getRed("tlsmallcircleColor"), g.getProgress(), customImage.getBlue("tlsmallcircleColor"));
                    msv.invalidate();
                }

                // If Top Right Circle is selected, seek bar will change the green color for that part
                else if(name.contains("Top Right Circle"))
                {
                    customImage.setColor("trsmallcircleColor", customImage.getRed("trsmallcircleColor"), g.getProgress(), customImage.getBlue("trsmallcircleColor"));
                    msv.invalidate();
                }

                // If Bottom Left Circle is selected, seek bar will change the green color for that part
                else if(name.contains("Bottom Left Circle"))
                {
                    customImage.setColor("llsmallcircleColor", customImage.getRed("llsmallcircleColor"), g.getProgress(), customImage.getBlue("llsmallcircleColor"));
                    msv.invalidate();

                }

                // If Bottom Right Circle is selected, seek bar will change the green color for that part
                else if(name.contains("Bottom Right Circle"))
                {
                    customImage.setColor("lrsmallcircleColor", customImage.getRed("lrsmallcircleColor"), g.getProgress(), customImage.getBlue("lrsmallcircleColor"));
                    msv.invalidate();

                }

                // If Right Half is selected, seek bar will change the green color for that part
                else if(name.contains("Right Half"))
                {
                    customImage.setColor("rightcircleColor", customImage.getRed("rightcircleColor"), g.getProgress(), customImage.getBlue("rightcircleColor"));
                    msv.invalidate();

                }

                // If Left Half is selected, seek bar will change the green color for that part
                else if(name.contains("Left Half"))
                {
                    customImage.setColor("leftcircleColor", customImage.getRed("leftcircleColor"), g.getProgress(), customImage.getBlue("leftcircleColor"));
                    msv.invalidate();

                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });


        b.setMax(255);
        b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                blue.setText("Blue: " + b.getProgress());
                String name = "" + title.getText();

                // If Top Left Circle is selected, seek bar will change the blue color for that part
                if(name.contains("Top Left Circle"))
                {
                    customImage.setColor("tlsmallcircleColor", customImage.getRed("tlsmallcircleColor"), customImage.getGreen("tlsmallcircleColor"), b.getProgress());
                    msv.invalidate();
                }

                // If Top Right Circle is selected, seek bar will change the blue color for that part
                else if(name.contains("Top Right Circle"))
                {
                    customImage.setColor("trsmallcircleColor", customImage.getRed("trsmallcircleColor"), customImage.getGreen("trsmallcircleColor"), b.getProgress());
                    msv.invalidate();
                }

                // If Bottom Left Circle is selected, seek bar will change the blue color for that part
                else if(name.contains("Bottom Left Circle"))
                {
                    customImage.setColor("llsmallcircleColor", customImage.getRed("llsmallcircleColor"), customImage.getGreen("llsmallcircleColor"), b.getProgress());
                    msv.invalidate();
                }

                // If Bottom Right Circle is selected, seek bar will change the blue color for that part
                else if(name.contains("Bottom Right Circle"))
                {
                    customImage.setColor("lrsmallcircleColor", customImage.getRed("lrsmallcircleColor"), customImage.getGreen("lrsmallcircleColor"), b.getProgress());
                    msv.invalidate();
                }

                // If Right Half is selected, seek bar will change the blue color for that part
                else if(name.contains("Right Half"))
                {
                    customImage.setColor("rightcircleColor", customImage.getRed("rightcircleColor"), customImage.getGreen("rightcircleColor"), b.getProgress());
                    msv.invalidate();

                }

                // If Left Half is selected, seek bar will change the blue color for that part
                else if(name.contains("Left Half"))
                {
                    customImage.setColor("leftcircleColor", customImage.getRed("leftcircleColor"), customImage.getGreen("leftcircleColor"), b.getProgress());
                    msv.invalidate();

                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });

        // Puts the surfaceview into the layout
        this.msv = (MySurfaceView) this.findViewById(R.id.thesurfaceView);

        // Puts onTouchListener on the Surfaceview
        msv.setOnTouchListener(this);

        //draws the image
        initCustomImage();




    }

    // Method for putting the image on the surfaceview
    protected void initCustomImage()
    {
        customImage = new CustomImage();
        msv.setCustomImage(customImage);
        msv.invalidate();
    }




    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        int x = (int)event.getX();
        int y = (int)event.getY();



        // Top Left Cirlce
        if ( (x>170 && x<340) &&  ( y>220&& y<420) )
        {
            title.setText("You Have Chosen The Top Left Circle");
            r.setProgress(customImage.getRed("tlsmallcircleColor"));
            g.setProgress(customImage.getGreen("tlsmallcircleColor"));
            b.setProgress(customImage.getBlue("tlsmallcircleColor"));
            red.setText("Red: " + customImage.getRed("tlsmallcircleColor"));
            green.setText("Green: " + customImage.getGreen("tlsmallcircleColor"));
            blue.setText("Blue: " + customImage.getBlue("tlsmallcircleColor"));

        }

        // Top Right Circle
        else if ( (x>670 && x<840) &&  ( y>220&& y<420) )
        {
            title.setText("You Have Chosen The Top Right Circle");
            r.setProgress(customImage.getRed("trsmallcircleColor"));
            g.setProgress(customImage.getGreen("trsmallcircleColor"));
            b.setProgress(customImage.getBlue("trsmallcircleColor"));
            red.setText("Red: " + customImage.getRed("trsmallcircleColor"));
            green.setText("Green: " + customImage.getGreen("trsmallcircleColor"));
            blue.setText("Blue: " + customImage.getBlue("trsmallcircleColor"));
        }

        // Bottom Left Circle
        else if ( (x>170 && x<340) &&  ( y>620&& y<860) )
        {
            title.setText("You Have Chosen The Bottom Left Circle");
            r.setProgress(customImage.getRed("llsmallcircleColor"));
            g.setProgress(customImage.getGreen("llsmallcircleColor"));
            b.setProgress(customImage.getBlue("llsmallcircleColor"));
            red.setText("Red: " + customImage.getRed("llsmallcircleColor"));
            green.setText("Green: " + customImage.getGreen("llsmallcircleColor"));
            blue.setText("Blue: " + customImage.getBlue("llsmallcircleColor"));
        }

        // Bottom Right Circle
        else if ( (x>670 && x<840) &&  ( y>620&& y<860) )
        {
            title.setText("You Have Chosen The Bottom Right Circle");
            r.setProgress(customImage.getRed("lrsmallcircleColor"));
            g.setProgress(customImage.getGreen("lrsmallcircleColor"));
            b.setProgress(customImage.getBlue("lrsmallcircleColor"));
            red.setText("Red: " + customImage.getRed("lrsmallcircleColor"));
            green.setText("Green: " + customImage.getGreen("lrsmallcircleColor"));
            blue.setText("Blue: " + customImage.getBlue("lrsmallcircleColor"));
        }

        // Left Half
        else if ( x<500 && ((x-500)*(x-500)) + ((y-500)*(y-500)) <500*500   )
        {
            title.setText("You Have Chosen The Left Half");
            r.setProgress(customImage.getRed("leftcircleColor"));
            g.setProgress(customImage.getGreen("leftcircleColor"));
            b.setProgress(customImage.getBlue("leftcircleColor"));
            red.setText("Red: " + customImage.getRed("leftcircleColor"));
            green.setText("Green: " + customImage.getGreen("leftcircleColor"));
            blue.setText("Blue: " + customImage.getBlue("leftcircleColor"));


        }

        // Right Half
        else if ( x>500 && ((x-500)*(x-500)) + ((y-500)*(y-500)) <500*500   )
        {
            title.setText("You Have Chosen The Right Half");
            r.setProgress(customImage.getRed("rightcircleColor"));
            g.setProgress(customImage.getGreen("rightcircleColor"));
            b.setProgress(customImage.getBlue("rightcircleColor"));
            red.setText("Red: " + customImage.getRed("rightcircleColor"));
            green.setText("Green: " + customImage.getGreen("rightcircleColor"));
            blue.setText("Blue: " + customImage.getBlue("rightcircleColor"));
        }
        return true;
    }
}

