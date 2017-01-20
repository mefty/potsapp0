package com.example.mefty.potsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends Activity {
    int degree=0;
    double seconds=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ExitClick (View v){
        finish();
    }
//touti en i main
    public void spin(View v) {
        while (seconds<2)
    seconds=(Math.random())*4.5;
        // Intent intent = new Intent(this, spin.class);
        // startActivity(intent);

        //  setContentView(R.layout.activity_main);
        CountDownTimer cdt = new CountDownTimer((int) (seconds * 1000), 10) {
            @Override
            public void onTick(long milisUntilFinished) {
                ImageView imageView = (ImageView) findViewById(R.id.img1);
                Bitmap myImg = BitmapFactory.decodeResource(getResources(), R.drawable.imageedit_1_3947658613);
                Matrix matrix = new Matrix();
                matrix.postRotate(degree);
                Bitmap rotated = Bitmap.createBitmap(myImg, 0, 0, myImg.getWidth(), myImg.getHeight(),
                        matrix, true);
                imageView.setImageBitmap(rotated);
                degree += 5;
            }

            @Override
            public void onFinish() {

            }


        }.start();


    }
    }

