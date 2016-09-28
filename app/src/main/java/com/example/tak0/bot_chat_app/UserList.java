package com.example.tak0.bot_chat_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.tak0.bot_chat_app.adapter.UserExpandableAdapter;

import java.util.ArrayList;
import java.util.List;


public class UserList extends Fragment {

    String[] groupName = {"info", "group", "friend"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        View view = inflater.inflate(R.layout.user_list, group, false);

        ExpandableListView listView = (ExpandableListView) view.findViewById(R.id.expandableListView);

        List<String> parent = new ArrayList<String>();
        List<List<ListItem>> childrenList = new ArrayList<List<ListItem>>();


        for(String name: groupName){
            List<ListItem> children = new ArrayList<ListItem>();
            if(name.equals("info")){
                ListItem item = new ListItem().setMainText("user");
                children.add(item);
            }else {
                for (int i = 0; i < 5; i++) {
                    ListItem item = new ListItem();
                    children.add(item);
                }
            }

            parent.add(name);
            childrenList.add(children);
        }

        UserExpandableAdapter adapter = new UserExpandableAdapter(getContext(), parent, childrenList);

        listView.setAdapter(adapter);


        return view;
    }

}