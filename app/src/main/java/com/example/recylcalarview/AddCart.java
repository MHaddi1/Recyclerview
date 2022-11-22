package com.example.recylcalarview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class AddCart extends AppCompatActivity {
  ImageView imageView;
  int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cart);

            imageView = findViewById(R.id.imageView);


    }

}