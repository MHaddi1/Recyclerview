package com.example.recylcalarview;

public class Product{
    private int id;
    private  String title;
    private String shortdesc;
    private String rating;
    private int image;
    private String price;

    public Product(int id, String title, String shortdesc, String  rating, int image,String price) {
        this.id=id;
        this.image=image;
        this.rating=rating;
        this.title=title;
        this.shortdesc=shortdesc;
        this.price=price;
    }

    public int getId()
    {
        return id;
    }
    public String getTitle(){
        return title;
    }

public String getPrice(){
        return price;
}

    public String getShortdesc(){
        return shortdesc;
    }

    public String getRating(){
        return rating;
    }
    public int getImage(){
        return image;
    }

}