package com.example.kazuaki.werewolf;

import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ItemData extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // 画像データ
    private Bitmap imgData;
    // テキストデータ
    private String txtData;

    public ItemData(Bitmap img,String text){
        this.imgData = img;
        this.txtData = text;
    }

    public Bitmap getImage(){
        return imgData;
    }
    public String getText(){
        return txtData;
    }
}
