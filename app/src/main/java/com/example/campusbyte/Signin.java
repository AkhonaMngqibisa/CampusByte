package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Signin extends AppCompatActivity
{
    private Button SignIn;
    private TextView forgotPassword, EmailAddress, Password;
    private TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        EmailAddress = (TextView) findViewById(R.id.EmailAddress) ;
        Password = (TextView) findViewById(R.id.Password) ;

        SignIn = (Button)findViewById(R.id.SignIn);
        SignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(EmailAddress.getText().toString().equals("admin")&& Password.getText().toString().equals("admin"))
                {
                 openAdminAbout();
                }
                else if(EmailAddress.getText().toString().equals("user")&& Password.getText().toString().equals("user"))
                {
                    openHome();
                }
               else
                    {
                        Toast.makeText(getApplicationContext(),"Not registered create an account",Toast.LENGTH_LONG).show();
                    }
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

    //-------------Home Page for user
    public void openHome()
    {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    //-------------Home Page for admin
   public void openAdminAbout()
    {
        Intent intent = new Intent(this,AdminAbout.class);
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