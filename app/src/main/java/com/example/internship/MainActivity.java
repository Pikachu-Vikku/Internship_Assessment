package com.example.internship;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        BottomNavigationView bottomNavigationView=findViewById(R.id.main_bottom_navbar);
        bottomNavigationView.setSelectedItemId(R.id.profile);
        Intent intent=getIntent();
        TextView name=findViewById(R.id.name);
        String s1= intent.getStringExtra("vikash");

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListner);

        if (s1.equals("vikash")){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new ProfileFragment()).commit();
        }
        else if (s1.equals("vikku")){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Profile2Fragment()).commit();
        }


        final ImageButton hamburger = findViewById(R.id.hamburger_icon);
        final DrawerLayout drawer = findViewById(R.id.drawer_menu);

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListner=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;
            switch (item.getItemId()){
                case R.id.orders:
                    Toast.makeText(MainActivity.this, "This is orders",
                            Toast.LENGTH_LONG).show();
                    break;
                case R.id.payment:
                    Toast.makeText(MainActivity.this, "This is Payments",
                            Toast.LENGTH_LONG).show();
                    break;
                case R.id.insights:
                    Toast.makeText(MainActivity.this, "This is Insights",
                            Toast.LENGTH_LONG).show();
                    break;
                case R.id.profile:
                    Toast.makeText(MainActivity.this, "This is Profile",
                            Toast.LENGTH_LONG).show();
                    break;
            }
            return true;
        }
    };

    @Override
    public void onBackPressed() {
        final DrawerLayout drawer = findViewById(R.id.drawer_menu);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }
}