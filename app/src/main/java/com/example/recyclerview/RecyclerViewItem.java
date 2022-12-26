package com.example.recyclerview;

public class RecyclerViewItem {

    private int imageResourse;
    private String text1;
    private String text2;
    //Alt + insert code generator!
    public RecyclerViewItem(int imageResourse, String text1, String text2){
        this.imageResourse = imageResourse;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageResourse(){
        return imageResourse;
    }
    public String getText1(){
        return text1;
    }
    public String getText2(){
        return text2;
    }

}
