package com.electronlabs.iamonboarding;


import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.electronlabs.iamonboarding.Adapter;

import me.relex.circleindicator.CircleIndicator;

public class HomeActivity extends AppCompatActivity {

    public ViewPager viewpager;

    Adapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager);
        CircleIndicator indicator = findViewById(R.id.indicator);

        Adapter = new Adapter(getSupportFragmentManager());
        viewpager.setAdapter(Adapter);

        indicator.setViewPager(viewpager);
        Adapter.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
