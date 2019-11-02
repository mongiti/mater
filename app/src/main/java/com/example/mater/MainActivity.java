package com.example.mater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton mFabMap = findViewById(R.id.location);
        mFabMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createMapIntent(v);
            }
        });
    }

    public void createMapIntent(View view){

        Uri uriAddress = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uriAddress);
        mapIntent.setPackage("com.google.android.apps.maps");

        if (mapIntent.resolveActivity(getPackageManager()) !=null){
            startActivity(mapIntent);
        }
    }


}
