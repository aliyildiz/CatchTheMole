package com.aliyildiz.catchthemole;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView scoreText;
    TextView timeText;
    int score;

    ImageView ımageView1;
    ImageView ımageView2;
    ImageView ımageView3;
    ImageView ımageView4;
    ImageView ımageView5;
    ImageView ımageView6;
    ImageView ımageView7;
    ImageView ımageView8;
    ImageView ımageView9;
    ImageView ımageView10;
    ImageView ımageView11;
    ImageView ımageView12;
    ImageView ımageView13;
    ImageView ımageView14;
    ImageView ımageView15;
    ImageView ımageView16;

    ImageView [] imageArray;
    Handler handler;
    Runnable runnable;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ımageView1 = findViewById(R.id.imageView);
        ımageView2 = findViewById(R.id.imageView2);
        ımageView3 = findViewById(R.id.imageView3);
        ımageView4 = findViewById(R.id.imageView4);
        ımageView5 = findViewById(R.id.imageView5);
        ımageView6 = findViewById(R.id.imageView6);
        ımageView7 = findViewById(R.id.imageView7);
        ımageView8 = findViewById(R.id.imageView8);
        ımageView9 = findViewById(R.id.imageView9);
        ımageView10 = findViewById(R.id.imageView10);
        ımageView11 = findViewById(R.id.imageView11);
        ımageView12 = findViewById(R.id.imageView12);
        ımageView13 = findViewById(R.id.imageView13);
        ımageView14 = findViewById(R.id.imageView14);
        ımageView15 = findViewById(R.id.imageView15);
        ımageView16 = findViewById(R.id.imageView16);

        imageArray = new ImageView[]{ımageView1, ımageView2, ımageView3, ımageView4, ımageView5, ımageView6, ımageView7, ımageView8, ımageView9, ımageView10, ımageView11, ımageView12, ımageView13, ımageView14, ımageView15, ımageView16};

        score=0;

        new CountDownTimer(30000,1000){

            @Override
            public void onTick(long l) {
                timeText=findViewById(R.id.textTime);
                timeText.setText("Time : "+ l/1000);

            }

            @Override
            public void onFinish() {
                timeText=findViewById(R.id.textTime);
                timeText.setText("Game Over!");
            }
        }.start();
    }

    public void increaseScore (View view){

        scoreText=findViewById(R.id.textScore);
        score++;
        scoreText.setText("Score : "+score);

    }

}
