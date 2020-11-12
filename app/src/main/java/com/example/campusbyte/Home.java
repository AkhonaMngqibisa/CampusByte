package com.example.campusbyte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity
{

    private DrawerLayout mDrawlayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mDrawlayout=(DrawerLayout)findViewById(R.id.drawer1);
        mToggle= new ActionBarDrawerToggle(this,mDrawlayout,R.string.open,R.string.close);
        mDrawlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = findViewById(R.id.NavigationView1);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                int id = menuItem.getItemId();

                if(id==R.id.items1)
                {

                }
                else if(id==R.id.items2)
                {

                }
                else if(id==R.id.items3)
                {
                    openOrder();
                }
                else if(id==R.id.items4)
                {
                    openHistoryOrders();
                }
                else if(id==R.id.items5)
                {
                    openSettings();
                }
                else if(id==R.id.items6)
                {
                    openLogout();
                }
                return true;
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    //-------------order
    public void openOrder()
    {
        Intent intent = new Intent(this, OderItems.class);
        startActivity(intent);
    }
    //-------------History Orders
    public void openHistoryOrders()
    {
        Intent intent = new Intent(this, OrderHistory.class);
        startActivity(intent);
    }
    //------------Logout
    public void openLogout()
    {
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
    }
    //------------Settings
    public void openSettings()
    {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}