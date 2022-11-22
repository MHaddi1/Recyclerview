package com.example.recylcalarview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);


        //initializing the productlist

        ArrayList<Object> productList = new ArrayList<>();

        //adding some items to our list

        productList.add(
                new Product(
                        1,
                        "C Language",
                        "This is a Description",
                        "4.8",
                        R.drawable.c,
                        "6000"
                        ));
        productList.add(
                new Product(
                        2,
                        "C ++ Language",
                        "This is a Description",
                        "4.8",
                        R.drawable.cplus,
                        "6500"
                ));
        productList.add(
                new Product(
                        3,
                        "C shape Language",
                        "This is a Description",
                        "4.8",
                        R.drawable.cshape,
                        "8000"
                ));
        productList.add(
                new Product(
                        1,
                        "Java Language",
                        "This is a Description",
                        "4.3",
                        R.drawable.java,
                        "9000"
                ));
        productList.add(
                new Product(
                        1,
                        "JavaScript Language",
                        "This is a Description",
                        "4.8",
                        R.drawable.javascript,
                        "7000"
                ));
        productList.add(
                new Product(
                        1,
                        "Python Language",
                        "This is a Description",
                        "4.8",
                        R.drawable.python,
                        "6600"
                ));


//recyclerViewInterface = new RecyclerViewInterface() {
//    @Override
//    public void OnClickItem(int pos, String s) {
//        Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_SHORT).show();
//
//    }
//};



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

  


    }



}