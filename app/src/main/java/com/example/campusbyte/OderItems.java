package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class OderItems extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_items);

        //Openning the category pages......

        //find the View that shows the numbers category
        TextView coldbeverage = (TextView) findViewById(R.id.coldbeverage);
        // set a clicklistener on the View
        coldbeverage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // create a new intent to open the [@link NumbersActivity]
                Intent intent = new Intent(OderItems.this, ColdBeverages.class);
                //Start the new activity
                startActivity(intent);
            }
        });


        TextView coldfood = (TextView) findViewById(R.id.coldfood);
        coldfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (OderItems.this, ColdFood.class);
                startActivity(intent);

            }
        });


        TextView snacks = (TextView) findViewById(R.id.snacks);
        snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OderItems.this, Snacks.class);
                startActivity(intent);
            }
        });

        TextView warmbeverage = (TextView)findViewById(R.id.warmbeverage);
        warmbeverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OderItems.this,WarmBeverages.class);
                startActivity(intent);
            }
        });

        TextView warmfood = (TextView) findViewById(R.id.warmfood);
        warmfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OderItems.this, WarmFood.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    }
