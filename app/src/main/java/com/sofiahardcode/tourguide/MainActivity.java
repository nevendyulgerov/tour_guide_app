package com.sofiahardcode.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CategoryFragmentPagerAdapter categoryFragmentPagerAdapter = new CategoryFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(categoryFragmentPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}