package com.hfad.stopwatch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends AppCompatActivity {
    // seconds displayed on the stopwatch
    private int seconds = 0;
    // is stopwatch running?
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        runTimer();
    }

    //Start the stopwatch running when the start button is clicked


    //Stop the stopwatch running when the stop button is clicked


    //Reset the stopwatch when the reset button is clicked


    //Sets the number of seconds on the timer
    private void runTimer() {
   
      
    }
}
