package com.example.cmd_f2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    //@Override
   // private static final String FILE_NAME = "example.txt";

   // EditText mEditText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout;
        ViewPager viewPager;
        @Override
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            tabLayout = findViewById(R.id.tabLayout);
            viewPager = findViewById(R.id.viewPager);
            tabLayout.addTab(tabLayout.newTab().setText("Day"));
            tabLayout.addTab(tabLayout.newTab().setText("Week"));
            tabLayout.addTab(tabLayout.newTab().setText("Month"));
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(),
                    tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }
                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }
                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }
        });
    }