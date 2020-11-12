package com.example.campusbyte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class AdminAbout extends AppCompatActivity
{
    private DrawerLayout mDrawlayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_about);
        mDrawlayout=(DrawerLayout)findViewById(R.id.drawer);
        mToggle= new ActionBarDrawerToggle(this,mDrawlayout,R.string.open,R.string.close);
        mDrawlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        navigationView = findViewById(R.id.NavigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                int id = menuItem.getItemId();

                if(id==R.id.item1)
                {

                }
                else if(id==R.id.item2)
                {

                }
                else if(id==R.id.item3)
                {
                    openPendingOrders();
                }
                else if(id==R.id.item4)
                {
                    completedOrders();
                }
                else if(id==R.id.item5)
                {
                    openHistoryOrders();
                }
                else if(id==R.id.item6)
                {
                    openEditItems();
                }
                else if(id==R.id.item7)
                {

                    openSettings();
                }
                else if(id==R.id.item8)
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

    //-------------Edit Item
    public void openEditItems()
    {
        Intent intent = new Intent(this, EditItems.class);
        startActivity(intent);
    }
    //-------------Pending Orders
    public void openPendingOrders()
    {
        Intent intent = new Intent(this, PendingOrders.class);
        startActivity(intent);
    }
    //-------------History Orders
    public void openHistoryOrders()
    {
        Intent intent = new Intent(this, OrderHistory.class);
        startActivity(intent);
    }
    //-------------Completed Orders
    public void completedOrders()
    {
        Intent intent = new Intent(this, CompletedOrders.class);
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