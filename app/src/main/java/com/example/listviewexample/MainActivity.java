package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArray = findViewById(R.id.buttonArray);
        btnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(MainActivity.class.getName(), "Array button clicked");

                Intent intent = new Intent(MainActivity.this,ArrayAdapterActivity.class);
                startActivity(intent);
            }



        });


        Button btnCustom = findViewById(R.id.buttonCustom);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(MainActivity.class.getName(), "Custom button clicked");

                Intent intent = new Intent(MainActivity.this,CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}