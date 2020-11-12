package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Siginup extends AppCompatActivity {

    EditText e1, e2, e3, e4, e5;
    Button b1;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siginup);

        db= new DatabaseHelper(this);
        e1= (EditText)findViewById(R.id.et_Name);
        e2= (EditText)findViewById(R.id.et_Username);
        e3= (EditText)findViewById(R.id.t_Email);
        e4= (EditText)findViewById(R.id.et_Password);
        e5= (EditText)findViewById(R.id.et_Repassword);
        b1=(Button)findViewById(R.id.et_Reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                String s3= e3.getText().toString();
                String s4= e4.getText().toString();
                String s5= e5.getText().toString();

                if(s1.equals("")|| s2.equals("")|| s3.equals("")|| s4.equals("")|| s5.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                 }
                else
                {
                    if(s4.equals(s5))
                    {
                        Boolean checkEmail = db.checkEmail(s3);
                        if(checkEmail==true)
                        {
                            Boolean insert = db.insert(s1,s2,s3,s4);
                            if(insert==true)
                            {
                                Toast.makeText(getApplicationContext(),"Registered Successful",Toast.LENGTH_SHORT).show();
                                openSignIn();
                            }
                        }

                        else{
                            Toast.makeText(getApplicationContext(),"Email Already exist",Toast.LENGTH_SHORT).show();
                        }
                    }

                    else{

                        Toast.makeText(getApplicationContext(),"Password does not match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    //------------Signin
    public void openSignIn()
    {
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
    }
}