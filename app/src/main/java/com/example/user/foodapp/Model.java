package com.example.user.foodapp;

/**
 * Created by USER on 10/5/2017.
 */

public class Model {

    String nama;
    String desc;
    String recipe;
    int image;


    public Model(String nam, String des, String rec, int img)
    {
        nama = nam;
        desc = des;
        recipe = rec;
        image = img;
    }

    public void setName(String nam)
    {
        nama = nam;
    }

    public void setDesc(String des)
    {
        desc = des;
    }

    public void setRecipe(String res)
    {
        recipe = res;
    }

    public void setImage(int img)
    {
        image = img;
    }

    public String getName()
    {
        return nama;
    }

    public String getDesc()
    {
        return desc;
    }

    public String getRecipe()
    {
        return recipe;
    }

    public int getImage()
    {
        return image;
    }
}
