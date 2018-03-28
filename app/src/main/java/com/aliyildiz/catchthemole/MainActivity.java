package com.aliyildiz.catchthemole;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreText;
    TextView timeText;
    int score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
}
