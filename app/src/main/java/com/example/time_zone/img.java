package com.example.time_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class img extends AppCompatActivity implements View.OnClickListener {
    ImageView w1v,w2v,w3v,w4v,w5v,w6v,w7v,w8v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);
        w1v= (ImageView) findViewById(R.id.w1);
        w2v= (ImageView) findViewById(R.id.w2);
        w3v= (ImageView) findViewById(R.id.w3);
        w4v= (ImageView) findViewById(R.id.w4);
        w5v= (ImageView) findViewById(R.id.w5);
        w6v= (ImageView) findViewById(R.id.w6);
        w7v= (ImageView) findViewById(R.id.w7);
        w8v= (ImageView) findViewById(R.id.w8);

        w1v.setOnClickListener(this);
        w2v.setOnClickListener(this);
        w3v.setOnClickListener(this);
        w4v.setOnClickListener(this);
        w5v.setOnClickListener(this);
        w6v.setOnClickListener(this);
        w7v.setOnClickListener(this);
        w8v.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.w1){
            w1v.setVisibility(v.GONE);
            w2v.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.w2){
            w2v.setVisibility(v.GONE);
            w3v.setVisibility(v.VISIBLE);
        }
       else if(v.getId()==R.id.w3){
            w3v.setVisibility(v.GONE);
            w4v.setVisibility(v.VISIBLE);
        }
       else if(v.getId()==R.id.w4){
            w4v.setVisibility(v.GONE);
            w5v.setVisibility(v.VISIBLE);
        }
      else  if(v.getId()==R.id.w5){
            w5v.setVisibility(v.GONE);
            w6v.setVisibility(v.VISIBLE);
        }
       else if(v.getId()==R.id.w6){
            w6v.setVisibility(v.GONE);
            w7v.setVisibility(v.VISIBLE);
        }
       else if(v.getId()==R.id.w7){
            w7v.setVisibility(v.GONE);
            w8v.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.w8){
            w8v.setVisibility(v.GONE);
            w1v.setVisibility(v.VISIBLE);
        }


    }
}
