package com.example.kazuaki.werewolf;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class Top extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        // buttonを取得
        Button btnToExplain = (Button) findViewById(R.id.btnToExplain);
        Button btnToPlayer = (Button) findViewById(R.id.btnToPlayer);
        Button btnToRoll = (Button) findViewById(R.id.btnToRoll);
        Button btnToRule = (Button) findViewById(R.id.btnToRule);
        Button btnStart = (Button) findViewById(R.id.btnStart);

        btnToExplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Top.this, Explain.class);
                startActivity(intent);
            }
        });

        btnToPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Top.this, Player.class);
                startActivity(intent);
            }
        });
        btnToRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Top.this, Roll.class);
                startActivity(intent);
            }
        });
        btnToRule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Top.this, Rule.class);
                startActivity(intent);
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Top.this, Game.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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