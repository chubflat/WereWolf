package com.example.kazuaki.werewolf;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ItemAdapter extends ArrayAdapter<ItemData>{
    private LayoutInflater inflater;
    private List<ItemData> items;

    public ItemAdapter(Context context,int resource,
                       List<ItemData>objects) {
        super(context, resource, objects);
        // TODO Auto-generated constructor stub
        inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        items = objects;
    }
    @Override
    public View getView(int position,View convertView,
                        ViewGroup parent){
        // TODO Auto-generated method stub
        if(convertView == null){
            //xmlからViewの生成
            convertView = inflater.inflate(R.layout.listview,null);
        }
        // 指定された行(position)の項目データ取得
        ItemData item = this.items.get(position);
        // 画像をセット
        ImageView img = (ImageView)convertView.findViewById(R.id.itemimage_id);
        img.setImageBitmap(item.getImage());
        // テキストをセット
        TextView info = (TextView)convertView.findViewById(R.id.itemtext_id);
        info.setText(item.getText());

        return convertView;
    }
}
