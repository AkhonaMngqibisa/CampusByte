package com.example.campusbyte;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class Snacks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        TextView fruit_pastilles = (TextView) findViewById(R.id.fruit_pastilles);
        fruit_pastilles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, FruitPastilles.class);
                startActivity(intent);
            }
        });

        TextView lays_chips = (TextView) findViewById(R.id.lays_chips);
        lays_chips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, chips.class);
                startActivity(intent);
            }
        });



    }
    }
