package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signin extends AppCompatActivity
{
    EditText  EmailAddress, Password;
    DatabaseHelper db;
    private Button SignIn;
    private TextView forgotPassword;
    private TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        db = new DatabaseHelper(this);
        EmailAddress = (EditText) findViewById(R.id.et_Email1) ;
        Password = (EditText) findViewById(R.id.et_Password1) ;

        SignIn = (Button)findViewById(R.id.SignIn);
        SignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                 String email = EmailAddress.getText().toString();
                String password = Password.getText().toString();
                Boolean checkEmailPassword = db.checkEandP(email,password);

                if(checkEmailPassword==true)
                {
                    if(EmailAddress.getText().toString().equals("admin")&& Password.getText().toString().equals("admin"))
                                         {
                                             Toast.makeText(getApplicationContext(),"Successful Signin as Admin",Toast.LENGTH_SHORT).show();
                                             openAdminAbout();
                                          }
                                           else {
                                            openHome();
                                             }
                }
                    else
                {
                    Toast.makeText(getApplicationContext(),"Wrong email or password",Toast.LENGTH_SHORT).show();
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
    }//--------------Forgot Password PAge
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
