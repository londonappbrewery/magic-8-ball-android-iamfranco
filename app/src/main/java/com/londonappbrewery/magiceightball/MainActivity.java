package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign views to variables
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        Button myButton = (Button) findViewById(R.id.askButton);

        // assign possible answers as array elements
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        // listen for button click
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int number = randomGenerator.nextInt(5); // 5 because there are only 5 answers
                Log.d("8 ball", "the number is " + number);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
