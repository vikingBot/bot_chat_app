package com.example.tak0.bot_chat_app;

public class ListItem {

    private int imageID;
    private String mainText;
    private String subText;

    public ListItem(){
        this.imageID = R.drawable.default_img;
        this.mainText = "None";
        this.subText = "None";
    }

    public ListItem(String text){
        this.imageID = R.drawable.default_img;
        this.mainText = text;
    }

    public ListItem(int imageID, String mainText){
        this.imageID = imageID;
        this.mainText = mainText;
    }

    public int getImageID(){
        return imageID;
    }

    public ListItem setImageID(int imageID){
        this.imageID = imageID;
        return this;
    }

    public String getMainText(){
        return mainText;
    }

    public String getSubText(){
        return subText;
    }

    public ListItem setMainText(String text){
        this.mainText = text;
        return this;
    }

}
