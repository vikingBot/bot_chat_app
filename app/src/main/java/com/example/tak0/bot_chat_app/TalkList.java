package com.example.tak0.bot_chat_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import com.example.tak0.bot_chat_app.adapter.ImageArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class TalkList extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){

        View view =  inflater.inflate(R.layout.talk_list, group, false);

        List<ListItem> list = new ArrayList<ListItem>();

        for(int i = 1; i < 30; i++){
            ListItem item = new ListItem();
            item.setImageID(R.drawable.default_img)
                    .setMainText("Room"+i);
            list.add(item);
        }

        ImageArrayAdapter adapter = new ImageArrayAdapter(getContext(), R.layout.list_info, list);

        listView = (ListView)view.findViewById(R.id.talk_list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), Talk.class);
                startActivity(intent);

            }
        });
        return view;

    }

}
