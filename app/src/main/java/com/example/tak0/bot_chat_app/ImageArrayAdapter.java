package com.example.tak0.bot_chat_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tak0 on 2016/09/22.
 */
public class ImageArrayAdapter extends ArrayAdapter<ListItem> {

    private int resourceID;
    private List<ListItem> items;
    private LayoutInflater inflater;

    public ImageArrayAdapter(Context context, int resourceID, List<ListItem> items){
        super(context, resourceID, items);

        this.resourceID = resourceID;
        this.items = items;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        if(convertView != null){
            view = convertView;
        }else {
            view = this.inflater.inflate(this.resourceID, null);
        }

        ListItem item = this.items.get(position);

        TextView appText = (TextView)view.findViewById(R.id.list_text);
        appText.setText(item.getText());

        ImageView appImage = (ImageView)view.findViewById(R.id.list_image);
        appImage.setImageResource(item.getImageID());

        return view;
    }
}
