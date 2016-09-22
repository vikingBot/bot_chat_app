package com.example.tak0.bot_chat_app;

/**
 * Created by tak0 on 2016/09/22.
 */
public class ListItem {

    private int imageID;
    private String text;

    public ListItem(){
        this.imageID = R.drawable.default_img;
        this.text = "None";
    }

    public ListItem(String text){
        this.imageID = R.drawable.default_img;
        this.text = text;
    }

    public ListItem(int imageID, String text){
        this.imageID = imageID;
        this.text = text;
    }

    public int getImageID(){
        return imageID;
    }

    public ListItem setImageID(int imageID){
        this.imageID = imageID;
        return this;
    }

    public String getText(){
        return text;
    }

    public ListItem setText(String text){
        this.text = text;
        return this;
    }

}
