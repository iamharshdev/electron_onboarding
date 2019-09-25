package com.electronlabs.onboarding;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.electronlabs.onboarding.Adapter.Adapter_onboard;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewpager;
    Button buttonX;

    Adapter_onboard adapter_onboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager);
        CircleIndicator indicator = findViewById(R.id.indicator);

        adapter_onboard = new Adapter_onboard(getSupportFragmentManager());
        viewpager.setAdapter(adapter_onboard);

        Button buttonX = (Button)findViewById(R.id.button);
        buttonX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "Developed by iamharsh.dev", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),main.class);
                startActivity(intent);
            }
        });

        indicator.setViewPager(viewpager);
        adapter_onboard.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
