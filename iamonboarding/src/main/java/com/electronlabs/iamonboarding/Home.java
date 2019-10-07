package com.electronlabs.iamonboarding;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button buttonX = (Button)findViewById(R.id.button2);
        buttonX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Toast.makeText(home.this, "Thanks for buying me a coffee", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://paypal.me/iamdevharsh")));
            }
        });
    }
}
