package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Handler handler;
    Runnable runnable;
    ImageView Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logo = findViewById(R.id.Logo);
        Logo.animate().alpha(4000).setDuration(0);

        handler= new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent dsp = new Intent(MainActivity.this,Signin.class);
                startActivity(dsp);
                finish();
            }
        },4000);
    }
}