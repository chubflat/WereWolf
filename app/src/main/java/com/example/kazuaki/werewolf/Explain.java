package com.example.kazuaki.werewolf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Explain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);


        // Buttonを取得
        Button btnToTop = (Button) findViewById(R.id.btnToTop);

        btnToTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Explain.this, Top.class);
                startActivity(intent);
            }
        });
        // ListViewの項目セット
        Bitmap image0 = BitmapFactory.decodeResource(getResources(),R.drawable.card0);
        Bitmap image1 = BitmapFactory.decodeResource(getResources(),R.drawable.card1);
        Bitmap image2 = BitmapFactory.decodeResource(getResources(),R.drawable.card2);
        Bitmap image3 = BitmapFactory.decodeResource(getResources(),R.drawable.card3);
        List<ItemData> objects = new ArrayList<ItemData>();
        objects.add(new ItemData(image0,"村人"));
        objects.add(new ItemData(image1,"人狼"));
        objects.add(new ItemData(image2,"予言者"));
        objects.add(new ItemData(image3,"霊媒師"));
        ItemAdapter adapter = new ItemAdapter(this,R.layout.listview,objects);
        // リストビュー表示
        ListView listView =(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_explain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
