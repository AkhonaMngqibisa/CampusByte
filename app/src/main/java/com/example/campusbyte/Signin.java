package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signin extends AppCompatActivity
{
    private Button SignIn;
    private TextView forgotPassword;
    private TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        SignIn = (Button)findViewById(R.id.SignIn);
        SignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openHome();
            }
        });

        forgotPassword= (TextView)findViewById(R.id.forgotPassword);
        forgotPassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openForgotPassword();
            }
        });

        signup= (TextView)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openSignUp();
            }
        });
    }

    //-------------Home Page
    public void openHome()
    {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    //--------------Forgot Password PAge
    public void openForgotPassword()
    {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);

    }

    //--------------Signup PAge
    public void openSignUp()
    {
        Intent intent = new Intent(this,Siginup.class);
        startActivity(intent);

    }
}