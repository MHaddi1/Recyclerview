package com.example.recylcalarview;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;




public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout


  Context context;

    //we are storing all the products in a list
    private ArrayList<Object> productList;



    //getting the context and product list with constructor
    public ProductAdapter(Context context, ArrayList<Object> productList) {
        this.context=context;
        this.productList = productList;


    }




    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recylcerview, null);
        return new ProductViewHolder (view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Product product = (Product) productList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(product.getRating());
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));
        holder.imageView.setImageResource(product.getImage());

//  ;

        //binding the data with the viewholder views

    holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(context,Show_Screen.class);
       i.putExtra("title", product.getTitle());
       i.putExtra("shortdesc",product.getShortdesc());
       i.putExtra("image", product.getImage());
       i.putExtra("price",product.getPrice());
       i.putExtra("rating",product.getRating());

       context.startActivities(new Intent[]{i});

    }

});



    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


   public static class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice,addcart;
        ImageView imageView,img1;
        int img;
        private ProductAdapter adapter;

        public ProductViewHolder(View itemView) {
            super(itemView);


            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);


        }




//        public ProductViewHolder LinkAdapter(ProductAdapter adapter){
//            this.adapter=adapter;
//            return this;
//        }

    }


}

