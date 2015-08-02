package com.example.kazuaki.werewolf;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Rule extends Activity {
    int mCanGuard = 1; // 連続ガードあり
    int mLack = 0; // 役欠けなし
    int mFortune = 1; // 初日占いあり
    int mtimer = 5; // 議論時間5分

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);


        // デフォルト設定
        final TextView canGuard = (TextView) findViewById(R.id.canGuard);
        canGuard.setText("連続ガード：あり");
        final TextView lack = (TextView)findViewById(R.id.lack);
        lack.setText("役欠け：なし");
        final TextView fortune = (TextView)findViewById(R.id.fortune);
        fortune.setText("初日占い：あり");
        final TextView timer = (TextView)findViewById(R.id.timer);
        timer.setText("議論時間：" + mtimer + "分");
        final Button recommend = (Button)findViewById(R.id.recommend);
        final Button btnToTop = (Button)findViewById(R.id.btnToTop);


        // 連続ガード設定
        canGuard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mCanGuard == 0) {
                    mCanGuard = 1;
                    canGuard.setText("連続ガード：あり");
                } else {
                    mCanGuard = 0;
                    canGuard.setText("連続ガード：なし");
                }
            }
        });
        // 役欠け設定
        lack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mLack == 0){
                    mLack = 1;
                    lack.setText("役欠け：あり");
                } else {
                    mLack = 0;
                    lack.setText("役欠け：なし");
                }
            }
        });
        // 初日占い
        fortune.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mFortune == 0) {
                    mFortune = 1;
                    fortune.setText("初日占い：あり");
                } else {
                    mFortune = 0;
                    fortune.setText("初日占い：なし");
                }
            }
        });
        // 議論時間設定
        timer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mtimer < 10) {
                    mtimer = mtimer + 1;
                } else if(mtimer == 10){
                    mtimer = 3;
                }
                timer.setText("議論時間：" + mtimer + "分");
            }
        });
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCanGuard = 1;
                canGuard.setText("連続ガード：あり");
                mLack = 0;
                lack.setText("役欠け：なし");
                mFortune = 1;
                fortune.setText("初日占い：あり");
                mtimer = 5;
                timer.setText("議論時間：" + mtimer + "分");
            }
        });

        btnToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rule.this, Top.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rule, menu);
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
