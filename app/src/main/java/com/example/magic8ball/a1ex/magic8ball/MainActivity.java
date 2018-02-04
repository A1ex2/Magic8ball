package com.example.magic8ball.a1ex.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button askButton;
        askButton = (Button) findViewById(R.id.ask);

        final ImageView ball = (ImageView) findViewById(R.id.magic);

        final int[] ballArray =
                {R.drawable.magic_ball_1,
                 R.drawable.magic_ball_2,
                 R.drawable.magic_ball_3,
                 R.drawable.magic_ball_4,
                 R.drawable.magic_ball_5,
                 R.drawable.magic_ball_6,
                 R.drawable.magic_ball_7,
                 R.drawable.magic_ball_8
                };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();
                int number = randomGenerator.nextInt(7);

                ball.setImageResource(ballArray[number]);
            }
        });


    }
}
