package com.example.pratik.allmixedup.splashlaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


import com.example.pratik.allmixedup.MainActivity;
import com.example.pratik.allmixedup.R;

import static java.lang.Thread.sleep;

/**
 * Created by prati on 26-05-2017.
 */

public class Splash extends Activity
{

    private Thread splash_thread;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        splash_thread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    int waited = 0;
                    while (waited <= 0)
                    {
                        sleep(100);
                        waited += 100;
                    }

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {

                    finish();

                    Intent i=new Intent(Splash.this, MainActivity.class);
                    startActivity(i);

                }

            }
        };

        splash_thread.start();

    }


}
