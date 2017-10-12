package com.example.user.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    ImageView gambar;
    TextView resep;

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intens = getIntent();

        getSupportActionBar().setTitle(intens.getStringExtra("food.desc1"));

        gambar = (ImageView)findViewById(R.id.myImg);
        resep = (TextView)findViewById(R.id.txt1);

        resep.setText(intens.getStringExtra("food.desc1"));
        resep.setText(intens.getStringExtra("food.desc2"));
        gambar.setImageResource(intens.getIntExtra("food.gambar",0));

    }


}
