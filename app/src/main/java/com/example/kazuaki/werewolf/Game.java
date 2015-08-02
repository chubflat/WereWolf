package com.example.kazuaki.werewolf;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Game extends Activity {
    private int roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final ImageView rollImage = (ImageView)this.findViewById(R.id.imageView0);
        final TextView rollText = (TextView)this.findViewById(R.id.textView0);
        rollImage.setImageResource(R.drawable.card0);

        Button btn0 = (Button) findViewById(R.id.button0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollImage.setImageResource(R.drawable.card0);
                rollText.setText(R.string.explain0);
            }

        });
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollImage.setImageResource(R.drawable.card1);
                rollText.setText(R.string.explain1);
            }

        });
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollImage.setImageResource(R.drawable.card2);
                rollText.setText(R.string.explain2);

            }

        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollImage.setImageResource(R.drawable.card3);
                rollText.setText(R.string.explain3);
            }

        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
