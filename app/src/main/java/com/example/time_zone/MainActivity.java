package com.example.time_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button list, img,abt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= (Button) findViewById(R.id.button2);
        img= (Button) findViewById(R.id.button3);
        abt= (Button) findViewById(R.id.button);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button= new Intent(MainActivity.this, List.class);
                startActivity(button);

            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button= new Intent(MainActivity.this, img.class);
                startActivity(button);

            }
        });

        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button= new Intent(MainActivity.this, about.class);
                startActivity(button);

            }
        });
    }
}
