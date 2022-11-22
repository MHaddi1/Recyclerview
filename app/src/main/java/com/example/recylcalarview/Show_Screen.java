package com.example.recylcalarview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Show_Screen extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4;
    ImageView imageView;
    int img;
    String rating,des,price,title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_screen);
        imageView = findViewById(R.id.imageView2);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.price);
        textView4 = findViewById(R.id.rating);
        getData();
        setData();
    }
    private void getData(){
        if(getIntent().hasExtra("image")&&getIntent().hasExtra("title")&&getIntent().hasExtra("rating")&&getIntent().hasExtra("price")&&getIntent().hasExtra("shortdesc")){
            img = getIntent().getIntExtra("image",1);
            rating = getIntent().getStringExtra("rating");
            price = getIntent().getStringExtra("price");
            des = getIntent().getStringExtra("shortdesc");
            title = getIntent().getStringExtra("title");

        }
        else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData (){
        imageView.setImageResource(img);
        textView1.setText(title);
        textView2.setText(des);
        textView3.setText(price);
        textView4.setText(rating);
    }
}