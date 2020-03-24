package com.example.time_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {

    Button get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        get = (Button) findViewById(R.id.start);
         get.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent button= new Intent(start.this,MainActivity.class);
                 startActivity(button);

             }
         });

    }
}
